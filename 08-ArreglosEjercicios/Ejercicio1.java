// Sumar numeros aleatorios; 

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        int[] datosInt = null;

        int cantidad = 0;

        Scanner leer = new Scanner(System.in);

        while (true) {

            System.out.print("  (0) ¿Cuantos datos desea sumar? --> ");

            try {

                cantidad = leer.nextInt();
                datosInt = new int[cantidad];
                break;

            } catch (InputMismatchException e) {

                System.out.println("      La cantidad debe ser un numero.");

            } catch (NegativeArraySizeException e) {

                System.out.println("      La cantidad debe ser un numero positivo.");

            } finally{

                leer.nextLine();

            }

            System.out.println();

        }

        if (cantidad != 0) {

            for (int i = 0; i < cantidad; i++) {

                System.out.print("  (s) Dato " + (i + 1) + ", ingrese valor --> ");

                String valorStr = leer.nextLine();
                String salir = "s";

                if (valorStr.equalsIgnoreCase(salir)) {
                    System.out.println("      Has salido del programa.");
                    break;
                }

                try {

                    int valorInt = Integer.parseInt(valorStr);
                    datosInt[i] = valorInt;

                } catch (NumberFormatException e) {

                    System.out.println("      El valor debe ser un numero.");
                    i--;

                }

            }

            int suma = 0; 
            
            for(int i = 0; i < cantidad; i++){

                suma = suma + datosInt[i];

            }

            System.out.println("      La suma de todos los elementos es: "+suma+".");

        } else {

            System.out.println("      Has salido del programa.");

        }

        leer.close();

    }

}