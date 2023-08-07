// LLenar arreglo con datos pedidos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("    ¿Cuantos datos desea almacenar? --> ");

        String[] datos;

        while (true) {

            try {

                datos = new String[leer.nextInt()];
                leer.nextLine();
                break;

            } catch (InputMismatchException | NegativeArraySizeException e) {
                System.out.print("    Ingrese un valor valido. --> ");
                leer.nextLine();
            }
        }

        for (int i = 0; i < datos.length; i++) {
            System.out.print("    Ingrese el dato "+(i + 1)+" --> ");
            datos[i] = leer.nextLine();
        }

        if(datos.length != 0){

            System.out.println("    Datos almacenados:");

            for (int i = 0; i < datos.length; i++) {
                System.out.println("    "+(i + 1)+": "+datos[i]);
            }

        } else {
            System.out.println("    No se almacenaron datos.");
        }

        leer.close();

    }
}
