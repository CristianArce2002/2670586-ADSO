// Generar datos aleatorios y buscar cuantas veces se repiten;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("  ¿Cuantos datos desea generar? --> ");

        int cantidadDatos = 0;

        int[] datos;

        try {

            cantidadDatos = leer.nextInt();

            if (cantidadDatos == 0) {

                System.out.println("  No se han generado datos.");

            } else {

                datos = new int[cantidadDatos];

                Random aleatorio = new Random();

                System.out.print("  Los numeros generados son: ");

                for (int i = 0; i < cantidadDatos; i++) {
                    datos[i] = aleatorio.nextInt(10);
                    System.out.print(datos[i] + " ");
                }

                System.out.println();

                System.out.print("  ¿Que numero desea buscar? --> ");
                int numeroBuscado = leer.nextInt();

                int contador = 0;

                for (int i = 0; i < cantidadDatos; i++) {
                    if (datos[i] == numeroBuscado) {
                        contador++;
                    }
                }

                System.out.println("  El numero " + numeroBuscado + " aparece " + contador + " veces en el arreglo.");

            }

        } catch (InputMismatchException e) {

            System.out.println("  La cantidad debe ser un numero.");

        } catch (NegativeArraySizeException e) {

            System.out.println("  La cantidad debe ser un numero positivo.");

        } finally{

            leer.close();

        }
    }
}