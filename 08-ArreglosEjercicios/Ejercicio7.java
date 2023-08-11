// Generar numeros aleatorios y mostrar orden inverso.

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args){

        Scanner leer = new Scanner(System.in);

        System.out.print("  ¿Cuantos datos desea generar? --> ");

        int cantidadDatos = 0;

        int[] datos;

        try{

            cantidadDatos = leer.nextInt();

            if (cantidadDatos <= 0) {

                System.out.println("  La cantidad debe ser un numero positivo.");

            } else {

                datos = new int[cantidadDatos];

                Random aleatorio = new Random();

                System.out.print("  Los numeros generados son: ");

                for (int i = 0; i < cantidadDatos; i++) {
                    datos[i] = aleatorio.nextInt(10);
                    System.out.print(datos[i] + " ");
                }

                System.out.println();

                int[] datosInversos = new int[cantidadDatos];

                for (int i = 0; i < cantidadDatos; i++) {
                    datosInversos[i] = datos[cantidadDatos - i - 1];
                }

                System.out.print("  Los numeros en orden inverso son: ");

                for (int i = 0; i < cantidadDatos; i++) {
                    System.out.print(datosInversos[i] + " ");
                }

            }

        } catch (InputMismatchException e) {

            System.out.println("  La cantidad debe ser un numero.");

        }finally{

            leer.close();

        }
    }
}