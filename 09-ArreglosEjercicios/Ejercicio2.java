// LLenar arreglo con datos pedidos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("    ¿Cuantos nombres desea almacenar? --> ");

        String[] nombres;

        while (true) {

            try {

                nombres = new String[leer.nextInt()];
                leer.nextLine();
                break;

            } catch (InputMismatchException | NegativeArraySizeException e) {
                System.out.print("    Ingrese un valor valido. --> ");
                leer.nextLine();
            }
        }

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("    Ingrese el nombre "+(i + 1)+" --> ");
            nombres[i] = leer.nextLine();
        }

        if(nombres.length != 0){

            System.out.println("    Nombres almacenados:");

            for (int i = 0; i < nombres.length; i++) {
                System.out.println("    "+(i + 1)+": "+nombres[i]);
            }

            System.out.print("    Ingrese nombre de la lista --> ");
            String nombre = leer.nextLine();
            boolean validar = true;

            for (int i = 0; i < nombres.length; i++){
                if (nombre.equals(nombres[i])){
                    System.out.println("    "+nombre+" se encuentra en la posicion "+(i + 1)+".");
                    validar = false;
                }
            } 

            if (validar){
                System.out.println("    "+nombre+" no está en la lista.");
            }              

        } else {
            System.out.println("    No se almacenaron nombres.");
        }

        leer.close();

    }
}
