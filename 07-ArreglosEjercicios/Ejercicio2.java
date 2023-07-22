// Arreglo numeros primos; 

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("  Ingrese longitud arreglo: ");
        int arreglo[] = new int[sc.nextInt()];
        sc.close();

        int contador = 0;

        for (int i = 2; contador < arreglo.length; i++) {

            int divisibles = 0;

            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    divisibles++;
                }

            }

            if (divisibles == 2) {
                arreglo[contador] = i;
                contador++;
            }

        }

        System.out.print("  Contenido arreglo: ");

        for (int i = 0; i < arreglo.length; i++) {

            if (i == 0){
                System.out.print(arreglo[i]);
            } else {
                System.out.print(", " + arreglo[i]);
            }

        }
        
    }

}
