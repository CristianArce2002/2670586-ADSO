// Encontrar el menor de numeros aleatorios; 

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String entrada = "";
        boolean validar = false;
        int longitud = 0;
        int numeros[] = null;
        int numeroMenor = 101;
        String alerta = "    Ingrese una cantidad valida.";

        while (validar == false) {

            System.out.print("    ¿Cuantos numeros desea generar? (rango: 1 a 100) --> ");
            entrada = sc.nextLine();

            try {

                longitud = Integer.parseInt(entrada);

                if (longitud < 1 || longitud > 100){

                    System.out.println(alerta);

                } else {

                    numeros = new int[longitud];
                    validar = true;
                }

            } catch (NumberFormatException | NegativeArraySizeException e) {
                System.out.println(alerta);
            }

        }

        sc.close();

        for (int i = 0; i < numeros.length; i++) {

            int aleatorio = (int) Math.floor(Math.random() * 100);
            numeros[i] = aleatorio;

            if (numeros[i] < numeroMenor){

                numeroMenor = numeros[i];
                
            }

        }

        System.out.println("    Los numeros generados son:");

        for (int i = 0; i < numeros.length; i++) {

            
            if (i % 20 == 0) {
                System.out.println();
                System.out.print("   ");
            }

            System.out.print(" " + numeros[i]);

            if (i != numeros.length-1){
                System.out.print(",");
            }
            
        }

        System.out.println(".");
        System.out.println("    El valor minimo encontrado es: [" + numeroMenor + "].");

    }

}