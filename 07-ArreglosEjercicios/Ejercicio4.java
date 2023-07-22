// Arreglo descendente;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("  Ingrese longitud arreglo: ");
        int arreglo[] = new int[sc.nextInt()];

        for (int i = 0; i < arreglo.length; i++) {

            System.out.print("  Ingrese valor posicion " + i + ": ");
            arreglo[i] = sc.nextInt();

        }

        sc.close();
        System.out.print("  Orden descendente: ");
        int auxiliar = 5;

        for (int a = 0; a < arreglo.length; a++) {

            for (int i = a + 1; i < arreglo.length; i++) {

                if (arreglo[a] < arreglo[i]) {

                    auxiliar = arreglo[a];
                    arreglo[a] = arreglo[i];
                    arreglo[i] = auxiliar;

                }

            }

        }

        for (int i = 0; i < arreglo.length; i++) {

            if (i == 0) {
                System.out.print(arreglo[i]);
            } else {
                System.out.print(", " + arreglo[i]);
            }

        }

    }

}
