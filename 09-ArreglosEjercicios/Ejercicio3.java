//Registro de clientes;

import java.util.Scanner;

public class Ejercicio3 {

    static final int longitud = 100;
    static String[] clientes = new String[longitud];
    static int memoria = longitud;
    static boolean menu = true;
    static Scanner leer = new Scanner(System.in);
    static String alerta = "    Ingrese una opcion valida.";
    static String ceroClientes = "    No hay clientes registrados.";
    static int posicion = 0;

    public static void main(String[] args) {

        while (menu) {

            mostrarMenu();

            int opcion = leerOpcion();

            switch (opcion) {
                case 1:
                    ingresarCliente();
                    break;

                case 2:
                    verClientes();
                    break;

                case 3:
                    editarCLiente();
                    break;
                case 4:
                    eliminarCliente();
                    break;

                case 5:
                    menu = false;
                    break;

                default:
                    System.out.println(alerta);
            }

            System.out.println();

        }

        leer.close();

    }

    static void mostrarMenu() {

        System.out.println("                Memoria disponible: " + memoria + " Registros.");
        System.out.println("    1: Registrar cliente.");
        System.out.println("    2: Ver lista de clientes.");
        System.out.println("    3: Editar cliente.");
        System.out.println("    4: Eliminar cliente.");
        System.out.println("    5: Salir");

    }

    static int leerOpcion() {

        int opcion = 0;
        System.out.print("    Ingrese opcion --> ");

        try {

            opcion = leer.nextInt();

        } catch (Exception e) {

        } finally {
            leer.nextLine();
        }

        return opcion;

    }

    static void ingresarCliente() {

        if (posicion < longitud) {

            System.out.print("    Ingrese nombre del cliente --> ");
            String nombre = leer.nextLine();
            boolean validar = true;
            for (int i = 0; i < posicion; i++) {

                if (nombre.equals(clientes[i])) {
                    validar = false;
                }

            }

            if (validar) {

                clientes[posicion] = nombre;
                posicion++;
                memoria--;

            } else {
                System.out.println("    El nombre ya esta registrado.");
            }

        } else {
            System.out.println("    No hay memoria para un nuevo cliente.");
        }

    }

    static void verClientes() {

        if (posicion != 0) {
            for (int i = 0; i < posicion; i++) {
                System.out.println("    cliente " + (i + 1) + ": " + clientes[i]);
            }
        } else {
            System.out.println(ceroClientes);
        }

    }

    static void editarCLiente() {

        if (posicion != 0) {

            System.out.print("    Ingrese nombre del cliente --> ");
            String nombre = leer.nextLine();
            boolean validar = false;
            for (int i = 0; i < posicion; i++) {

                if (nombre.equals(clientes[i])) {

                    System.out.print("    Ingrese nuevo nombre para " + nombre + " --> ");
                    clientes[i] = leer.nextLine();
                    validar = true;

                }

            }

            if (!validar) {
                System.out.println("    El nombre " + nombre + " no esta en la lista.");
            }
        } else {
            System.out.println(ceroClientes);
        }

    }

    static void eliminarCliente() {

        if (posicion != 0) {

            System.out.print("    ingrese cliente que desea eliminar --> ");
            String nombre = leer.nextLine();
            boolean validar = false;
            for (int i = 0; i < posicion; i++) {

                if (nombre.equals(clientes[i])) {

                    clientes[i] = null;
                    System.out.print("    el cliente " + nombre + " se ha eliminado con exito.");
                    validar = true;
                    memoria++;
                    posicion--;

                }
            }

            if (!validar) {
                System.out.println("    El cliente " + nombre + " no esta registrado.");
            }

            int x = 1;

            for (int i = 0; i < posicion; i++) {

                if (clientes[i] == null) {

                    String paso = clientes[i];
                    clientes[i] = clientes[x];
                    clientes[x] = paso;

                }

                if (x < posicion - 1) {
                    x++;
                }

            }

        } else {
            System.out.println(ceroClientes);
        }
    }
}