// Multiplicar numeros aleatorios; 

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String entrada = "";
        boolean validar = false;
        int longitud = 0;
        long numeros[] = null;
        long producto = 1;
        String alerta = "    Ingrese una cantidad valida.";

        while (validar == false) {

            System.out.print("    ¿Cuantos numeros desea generar? (rango: 1 a 20) --> ");
            entrada = sc.nextLine();

            try {

                longitud = Integer.parseInt(entrada);

                if (longitud < 1 || longitud > 20){

                    System.out.println(alerta);

                } else {

                    numeros = new long[longitud];
                    validar = true;
                }

            } catch (NumberFormatException | NegativeArraySizeException e) {
                System.out.println(alerta);
            }

        }

        sc.close();

        for (int i = 0; i < numeros.length; i++) {

            long aleatorio = (long) Math.floor((Math.random() * 10)+1);
            numeros[i] = aleatorio;
            producto = producto * aleatorio;

        }

        System.out.print("    Los numeros generados son: ");

        for (int i = 0; i < numeros.length; i++) {

            System.out.print(numeros[i]);

            if (i != numeros.length-1){
                System.out.print(", ");
            }
            
        }

        System.out.println(".");
        System.out.println("    Este es el producto: [" + producto + "].");

    }

}