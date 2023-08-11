// Generar numeros aleatorios y separar los pares de los impares;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {

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

                int[] pares = new int[cantidadDatos];
                int[] impares = new int[cantidadDatos];
                int contadorPares = 0;
                int contadorImpares = 0;

                for (int i = 0; i < cantidadDatos; i++) {
                    if (datos[i] % 2 == 0) {
                        pares[contadorPares] = datos[i];
                        contadorPares++;
                    } else {
                        impares[contadorImpares] = datos[i];
                        contadorImpares++;
                    }
                }

                System.out.print("\n  Los numeros pares son: ");

                for (int i = 0; i < contadorPares; i++) {
                    System.out.print(pares[i] + " ");
                }

                System.out.print("\n  Los numeros impares son: ");

                for (int i = 0; i < contadorImpares; i++) {
                    System.out.print(impares[i] + " ");
                }

            }

        } catch (InputMismatchException e) {

            System.out.println("  La cantidad debe ser un numero.");

        } finally{

            leer.close();

        }
    }
}