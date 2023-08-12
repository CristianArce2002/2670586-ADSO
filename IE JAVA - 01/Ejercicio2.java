// Cuadricula en zigzag;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int[][] cuadricula;

        System.out.print("\n Ingrese un numero (rango: 1 a 9) --> ");

        try {

            int longitud = leer.nextInt();

            if (longitud > 0 && longitud < 10) {

                cuadricula = new int[longitud][longitud];

                int contador = 1;

                for (int i = 0; i < cuadricula.length; i++) {

                    if (i - 1 % 2 == 0) {

                        for (int j = cuadricula[i].length - 1; j >= 0; j--) {
                            cuadricula[i][j] = contador;
                            contador++;
                        }

                    } else {

                        for (int j = 0; j < cuadricula[i].length; j++) {
                            cuadricula[i][j] = contador;
                            contador++;
                        }

                    }

                }

                for (int i = 0; i < cuadricula.length; i++) {

                    System.out.print("  ");

                    for (int j = 0; j < cuadricula[i].length; j++) {

                        System.out.printf("[%02d]", cuadricula[i][j]);

                    }

                    System.out.println();

                }

            } else if (longitud > 9) {

                System.out.println("  El numero debe ser menor a diez.");

            } else {

                System.out.println("  El numero debe ser mayor a cero.");

            }

        } catch (

        InputMismatchException e) {

            System.out.println("  El valor ingresado debe ser numerico.");

        } finally {

            leer.close();

        }
    }
}
