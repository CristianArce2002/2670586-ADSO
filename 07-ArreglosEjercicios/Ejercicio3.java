// Arreglo anti-horario;

import java.util.Scanner;

public class Ejercicio3 {
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

        System.out.print("  Ingrese posicion: ");
        int posicion = sc.nextInt();
        sc.close();

        System.out.print("  Anti-horario: ");

        for (int i = 0; i < arreglo.length; i++) {

            if (i == 0) {
                System.out.print(arreglo[posicion]);
            } else {
                System.out.print(", " + arreglo[posicion]);
            }

            if (posicion == 0) {
                posicion = arreglo.length;
            }

            posicion--;

        }

    }

}
