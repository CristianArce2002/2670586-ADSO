import java.util.Date; //Liberia de fechas

public class TarjetaDebito {
    // Atributos
    private String nombrePropietario;
    private String numeroTarjeta;
    private String nombreBanco;
    private int dineroDisponible;
    private int cantidadRetiro;
    private String ultimasTransacciones[];
    private String clave;
    private String estado;

    // Metodo constructor 1
    public TarjetaDebito(String nombrePropietario, String numeroTarjeta, String nombreBanco, int dineroDisponible,
            int cantidadRetiro, String clave) {
        this.nombrePropietario = nombrePropietario;
        this.numeroTarjeta = numeroTarjeta;
        this.nombreBanco = nombreBanco;
        this.dineroDisponible = dineroDisponible;
        this.cantidadRetiro = cantidadRetiro;
        this.clave = clave;
        this.estado = "ACTIVO";
        this.ultimasTransacciones = new String[10];
    }

    // Funcionalidades
    public void registrarTransaccion(String tipo, int monto, String estado) {
        Date fecha = new Date(); // Se crea un objeto de tipo fecha, la cual genera la fecha actual del sistema
        String texto = fecha.toString() + tipo + " - " + numeroTarjeta + " - " + monto + " - " + estado; // fecha.toString
                                                                                                         // para generar
                                                                                                         // su texto

        // Buscar un indice donde este vacio
        int indice = -1;

        for (int i = 0; i < ultimasTransacciones.length; i++) {
            if (ultimasTransacciones[i] == null) {
                indice = i;
                break;
            }
        }

        if (indice != -1) {
            ultimasTransacciones[indice] = texto;
        } else {
            for (int i = 0; i < ultimasTransacciones.length - 1; i++) {
                ultimasTransacciones[i] = ultimasTransacciones[i + 1];
            }
            ultimasTransacciones[ultimasTransacciones.length - 1] = texto;
        }

    }

    public void verHistorial(String pass) {
        if (pass.equals(clave)) {
            registrarTransaccion(" HISTORIAL", 0, "OK");
            for (int i = 0; i < ultimasTransacciones.length; i++) {
                if (ultimasTransacciones[i] != null) {
                    System.out.println(" =>" + ultimasTransacciones[i]);
                }
            }
        } else {
            System.out.println("ACCESO DENEGADO");
            registrarTransaccion(" HISTORIAL", 0, "ERROR");
        }

    }

    public boolean aumentarSaldo(int monto, String pass) {
        if (pass.equals(clave)) {
            if (monto > 0) {
                dineroDisponible += monto;
                System.out.println("TRANSACCION EXITOSA EN AUMENTO DE SALDO");
                registrarTransaccion("AUMENTOSALDO", monto, "OK");
                return true;
            } else {
                System.out.println("ERROR EN MONTO INGRESADO");
                registrarTransaccion("AUMENTOSALDO", monto, "ERROR");
                return false;
            }

        } else {
            System.out.println("ERROR EN PASSWORD - AUMENTO DE SALDO");
            registrarTransaccion("AUMENTOSALDO", monto, "ERROR");
            return false;
        }
    }

    public boolean disminuirSaldo(int monto, String pass) {
        if (pass.equals(clave)) {
            if (monto > 0 && monto <= cantidadRetiro) {
                if (monto <= dineroDisponible) {
                    dineroDisponible -= monto;
                    System.out.println("TRANSACCION EXITOSA EN AUMENTO DE SALDO");
                    registrarTransaccion("DISMINUCIONSALDO", monto, "OK");
                    return true;
                } else {
                    System.out.println("ERROR EN MONTO INGRESADO SUPERA DINERO EN TARJETA");
                    registrarTransaccion("DISMINUCIONSALDO", monto, "ERROR");
                    return false;
                }
            } else {
                System.out.println("ERROR EN MONTO INGRESADO - FUERA DE RANGO");
                registrarTransaccion("DISMINUCIONSALDO", monto, "ERROR");
                return false;
            }

        } else {
            System.out.println("ERROR EN PASSWORD - DISMINUCION DE SALDO");
            registrarTransaccion("DISMINUCIONSALDO", monto, "ERROR");
            return false;
        }
    }

    public int getSaldo(String pass) {
        if (pass.equals(clave)) {
            registrarTransaccion("CONSULTASALDO", 0, "OK");
            return dineroDisponible;
        } else {
            registrarTransaccion("CONSULTASALDO", 0, "ERROR");
            return -1;
        }

    }

    public boolean validar_clave(String pass) {

        if (pass.equals(clave)) {
            registrarTransaccion("VALIDADR CLAVE", 0, "OK");
            return true;
        } else {
            registrarTransaccion("VALIDADR CLAVE", 0, "ERROR");
            return false;
        }
    }

    public boolean validar_estado() {

        if (estado.equals("ACTIVO")) {
            return true;
        } else {
            return false;
        }
    }

    public String getNumero() {
        return numeroTarjeta;
    }
}