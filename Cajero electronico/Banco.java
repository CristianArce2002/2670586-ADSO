import java.util.Date;

public class Banco {

    int capacidad_total;
    int dinero_disponible;
    int billetes_10;
    int billetes_20;
    int billetes_50;
    int billetes_100;

    String[] lista_transacciones;
    String nombre_banco;
    String usuario_abmin;
    String clave_admin;

    public Banco(int capacidad_total, int dinero_disponible, int billetes_10, int billetes_20, int billetes_50,
            int billetes_100, String[] lista_transacciones, String nombre_banco, String usuario_abmin,
            String clave_admin) {
        this.capacidad_total = capacidad_total;
        this.dinero_disponible = dinero_disponible;
        this.billetes_10 = billetes_10;
        this.billetes_20 = billetes_20;
        this.billetes_50 = billetes_50;
        this.billetes_100 = billetes_100;
        this.lista_transacciones = new String[100];
        this.nombre_banco = nombre_banco;
        this.usuario_abmin = usuario_abmin;
        this.clave_admin = clave_admin;
    }

    public Banco(int capacidad_total, String nombre_banco, String usuario_abmin, String clave_admin) {
        this.capacidad_total = capacidad_total;
        this.nombre_banco = nombre_banco;
        this.usuario_abmin = usuario_abmin;
        this.clave_admin = clave_admin;
        this.dinero_disponible = 0;
        this.billetes_10 = 0;
        this.billetes_20 = 0;
        this.billetes_50 = 0;
        this.billetes_100 = 0;
        this.lista_transacciones = new String[100];

    }

    public boolean abastecer_banco(int cant_10, int cant_20, int cant_50, int cant_100) {

        int total = (cant_10 * 10000) + (cant_20 * 20000) + (cant_50 * 50000) + (cant_100 * 100000);

        if (total <= capacidad_total) {

            dinero_disponible = total;
            this.billetes_10 = cant_10;
            this.billetes_20 = cant_20;
            this.billetes_50 = cant_50;
            this.billetes_100 = cant_100;

            registrar_transferencia("Abastecer", "0000 0000 0000 0000", total, "Ok");
            return true;

        } else {

            registrar_transferencia("Abastecer", "0000 0000 0000 0000", total, "Error");
            return false;

        }

    }

    public void registrar_transferencia(String tipo, String numero_targeta, int monto, String estado) {

        Date fecha = new Date();

        String texto = fecha.toString() + " / " + tipo + " / " + numero_targeta + " / " + monto + " / " + estado;

        int indice = -1;

        for (int i = 0; i < lista_transacciones.length; i++) {
            if (lista_transacciones[i] == null) {
                indice = i;
                break;
            }
        }

        if (indice != -1) {
            lista_transacciones[indice] = texto;
        } else {
            for (int i = 0; i < lista_transacciones.length; i++) {
                lista_transacciones[i] = lista_transacciones[i + 1];
            }
            lista_transacciones[lista_transacciones.length - 1] = texto;            
        }

    }

    public void imprimirDatos() {

        System.out.println();
        System.out.println("  capacidad_total: " + capacidad_total);
        System.out.println("  dinero_disponible: " + dinero_disponible);
        System.out.println("  billetes_10: " + billetes_10);
        System.out.println("  billetes_20: " + billetes_20);
        System.out.println("  billetes_50: " + billetes_50);
        System.out.println("  billetes_100: " + billetes_100);
        System.out.println("  nombre_banco: " + nombre_banco);
        System.out.println("  usuario_abmin: " + usuario_abmin);
        System.out.println("  clave_admin: " + clave_admin);
        System.out.println("  lista_transacciones: ");

        for (int i = 0; i < lista_transacciones.length; i++) {
            if (lista_transacciones[i] != null) {

                System.out.println("  -->"+lista_transacciones[i]);

            }
        }
    }
}

// chat gpt, ayudame;
