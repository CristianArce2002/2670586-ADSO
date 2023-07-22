// Arreglo separar primos, no primos;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("  Ingrese longitud arreglo: ");
        int arreglo[] = new int[sc.nextInt()];

        for (int i = 0; i < arreglo.length; i++) {

            System.out.print("  Ingrese valor posicion " + i + ": ");
            arreglo[i] = sc.nextInt();

        }

        sc.close();

        System.out.print("  Arreglo original: ");

        for (int i = 0; i < arreglo.length; i++) {

            if (i == 0) {
                System.out.print(arreglo[i]);
            } else {
                System.out.print(", " + arreglo[i]);
            }

        }

        System.out.println();

        int contadorPrimos = 0;
        int contadorNoPrimos = 0;

        for (int i = 0; i < arreglo.length; i++) {

            int divisibles = 0;

            for (int j = 1; j <= arreglo[i]; j++) {

                if (arreglo[i] % j == 0) {
                    divisibles++;
                }

            }

            if (divisibles == 2) {
                contadorPrimos++;
            } else {
                contadorNoPrimos++;
            }

        }

        int arregloPrimo[] = new int[contadorPrimos];
        int arregloNoPrimo[] = new int[contadorNoPrimos];

        contadorPrimos = 0;
        contadorNoPrimos = 0;

        for (int i = 0; i < arreglo.length; i++) {

            int divisibles = 0;

            for (int j = 1; j <= arreglo[i]; j++) {

                if (arreglo[i] % j == 0) {
                    divisibles++;
                }

            }

            if (divisibles == 2) {
                arregloPrimo[contadorPrimos] = arreglo[i];
                contadorPrimos++;
            } else {
                arregloNoPrimo[contadorNoPrimos] = arreglo[i];
                contadorNoPrimos++;
            }

        }

        System.out.print("  Arreglo primos: ");

        for (int i = 0; i < arregloPrimo.length; i++) {

            if (i == 0) {
                System.out.print(arregloPrimo[i]);
            } else {
                System.out.print(", " + arregloPrimo[i]);
            }

        }

        System.out.println();

        System.out.print("  Arreglo no primos: ");

        for (int i = 0; i < arregloNoPrimo.length; i++) {

            if (i == 0) {
                System.out.print(arregloNoPrimo[i]);
            } else {
                System.out.print(", " + arregloNoPrimo[i]);
            }

        }

    }

}
