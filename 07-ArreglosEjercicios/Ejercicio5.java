// Arreglo movimiento;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("  Ingrese longitud arreglo: ");
        int arreglo[] = new int[sc.nextInt()];

        for (int i = 0; i < arreglo.length; i++) {

            System.out.print("  Ingrese valor posicion " + i + ": ");
            arreglo[i] = sc.nextInt();

        }

        System.out.print("  Arreglo original: ");

        for (int i = 0; i < arreglo.length; i++) {

            if (i == 0) {
                System.out.print(arreglo[i]);
            } else {
                System.out.print(", " + arreglo[i]);
            }

        }

        System.out.println();
        System.out.print("  Numero movimientos: ");
        int movimientos = sc.nextInt();
        sc.close();
        int auxiliar = 0;

        for (int m = 1; m <= movimientos; m++) {

            for (int i = 0; i < arreglo.length - 1; i++) {

                auxiliar = arreglo[i];
                arreglo[i] = arreglo[i + 1];
                arreglo[i + 1] = auxiliar;

            }

            System.out.print("  Movimiento " + m + ":    ");

            for (int i = 0; i < arreglo.length; i++) {

                if (i == 0) {
                    System.out.print(arreglo[i]);
                } else {
                    System.out.print(", " + arreglo[i]);
                }

            }

            System.out.println();

        }

    }

}
