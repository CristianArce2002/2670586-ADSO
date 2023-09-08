import java.util.Date; 

public class CajeroElectronico {
    int capacidadTotal;
    int dineroDisponible;
    int cant_10;
    int cant_20;
    int cant_50;
    int cant_100;
    String nombreBanco;
    String listaTransacciones[];
    String usuarioAdmin;
    String claveAdmin;

    public CajeroElectronico(int capacidadTotal, int dineroDisponible, int cant_10, int cant_20, int cant_50,
            int cant_100, String nombreBanco, String usuarioAdmin, String claveAdmin) {
        this.capacidadTotal = capacidadTotal; // This. para el contexto, ya que es ambiguo
        this.dineroDisponible = dineroDisponible;
        this.cant_10 = cant_10;
        this.cant_20 = cant_20;
        this.cant_50 = cant_50;
        this.cant_100 = cant_100;
        this.nombreBanco = nombreBanco;
        this.usuarioAdmin = usuarioAdmin;
        this.claveAdmin = claveAdmin;

        listaTransacciones = new String[100];
    }

    public CajeroElectronico(int capacidadTotal, String nombreBanco, String usuarioAdmin, String claveAdmin) {
        this.capacidadTotal = capacidadTotal;
        this.nombreBanco = nombreBanco;
        this.usuarioAdmin = usuarioAdmin;
        this.claveAdmin = claveAdmin;

        this.dineroDisponible = 0;
        this.cant_10 = cant_10;
        this.cant_20 = cant_20;
        this.cant_50 = cant_50;
        this.cant_100 = cant_100;

        listaTransacciones = new String[100];
    }

    public void imprimirDetalle() {
        System.out.println("---------------------------------------");
        System.out.println("  Total: " + capacidadTotal);
        System.out.println("  Disponible: " + dineroDisponible);
        System.out.println("  cant_10: " + cant_10);
        System.out.println("  cant_20: " + cant_20);
        System.out.println("  cant_50: " + cant_50);
        System.out.println("  cant_100: " + cant_100);
        System.out.println("  Banco: " + nombreBanco);
        System.out.println("  usuarioAdmin: " + usuarioAdmin);
        System.out.println("  claveAdmin: " + claveAdmin);
        System.out.println("  Historial de transacciones: ");

        for (int i = 0; i < listaTransacciones.length; i++) {
            if (listaTransacciones[i] != null) {
                System.out.println("        => " + listaTransacciones[i]);
            }
        }

        System.out.println("---------------------------------------");

    }

    public boolean abastecerCajero(int cant_10, int cant_20, int cant_50, int cant_100) {
        int total = (cant_10 * 10000) + (cant_20 * 20000) + (cant_50 * 50000) + (cant_100 * 100000);

        if (total <= capacidadTotal) {
            dineroDisponible = total;
            this.cant_10 = cant_10;
            this.cant_20 = cant_20;
            this.cant_50 = cant_50;
            this.cant_100 = cant_100;

            registrarTransaccion(" ABASTECER", "0000 0000 0000 0000", total, "OK");
            return true;
        } else {
            registrarTransaccion(" ABASTECER", "0000 0000 0000 0000", total, "ERROR");
            return false;

        }
    }

    public void registrarTransaccion(String tipo, String numeroTarjeta, int monto, String estado) {
        Date fecha = new Date(); 
        String texto = fecha.toString() + tipo + " - " + numeroTarjeta + " - " + monto + " - " + estado; 

        int indice = -1;

        for (int i = 0; i < listaTransacciones.length; i++) {
            if (listaTransacciones[i] == null) {
                indice = i;
                break;
            }
        }

        if (indice != -1) {
            listaTransacciones[indice] = texto;
        } else {
            for (int i = 0; i < listaTransacciones.length - 1; i++) {
                listaTransacciones[i] = listaTransacciones[i + 1];
            }
            listaTransacciones[listaTransacciones.length - 1] = texto;
        }

    }

    public void verHistorialCajero(String user, String pass) {

        if (user.equals(usuarioAdmin) && pass.equals(claveAdmin)) {
            registrarTransaccion(" HISTORIAL", "0000 0000 0000 0000", 0, "OK");
            for (int i = 0; i < listaTransacciones.length; i++) {
                if (listaTransacciones[i] != null) {
                    System.out.println(listaTransacciones[i]);
                }
            }
        } else {
            System.out.println("ACCESO DENEGADO !!!");
            registrarTransaccion(" HISTORIAL", "0000 0000 0000 0000", 0, "ERROR");
        }
    }

    public void consignar_dinero_tarjeta(TarjetaDebito targeta, String clave, int cant_10, int cant_20, int cant_50,
            int cant_100) {

        int monto = (10000 * cant_10) + (20000 * cant_20) + (50000 * cant_50) + (100000 * cant_100);

        if (targeta.validar_clave(clave)) {

            if (targeta.validar_estado()){

                if (monto > 0){

                    if ((dineroDisponible + monto) <= capacidadTotal){

                        targeta.aumentarSaldo(monto, clave);
                        dineroDisponible += monto;
                        this.cant_10 += cant_10;
                        this.cant_20 += cant_20;
                        this.cant_50 += cant_50;
                        this.cant_100 += cant_100;
                        
                        System.out.println("REALIZADO - CONSIGNAR DINERO !!!");
                        registrarTransaccion("CONSIGNACIÓN", targeta.getNumero(), monto, "OK");

                    } else {

                        System.out.println("ERROR MONTO SUPERIOR - CONSIGNAR DINERO !!!");
                        registrarTransaccion(" MONTO SUPERIOR", targeta.getNumero(), monto, "ERROR");

                    }
                    
                } else {

                    System.out.println("ERROR MONTO INFERIOR - CONSIGNAR DINERO !!!");
                    registrarTransaccion(" MONTO NEGATIVO", targeta.getNumero(), monto, "ERROR");

                }

            } else {

                System.out.println("ERROR ESTADO INACTIVO - CONSIGNAR DINERO !!!");
                registrarTransaccion(" ESTADO INACTIVO", targeta.getNumero(), monto, "ERROR");

            }

        } else {

            System.out.println("ERROR PASSWORD - CONSIGNAR DINERO !!!");
            registrarTransaccion(" CONSIGNACIÓN", targeta.getNumero(), monto, "ERROR");

        }

    }

}