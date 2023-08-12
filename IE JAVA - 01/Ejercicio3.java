// Minibuscaminas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int bomba = 1;
        int dos = 2;

        try {

            System.out.print("  Ingrese longitud del tablero --> ");

            int longitud = leer.nextInt();

            if (longitud > 0 && longitud <= 100) {

                int[] tabla = new int[longitud];

                System.out.print("  Ingrese cantidad de bombas --> ");

                int cantidadBombas = leer.nextInt();

                if (cantidadBombas <= longitud && cantidadBombas > 0) {

                    for (int i = 0; i < tabla.length; i++) {

                        tabla[i] = 0;

                    }

                    for (int i = 1; i <= cantidadBombas; i++) {

                        while (true) {

                            int aleatorio = (int) Math.round(Math.random() * (longitud - 1));

                            if (tabla[aleatorio] != bomba) {

                                tabla[aleatorio] = bomba;

                                break;

                            }

                        }

                    }

                    for (int i = 0; i < tabla.length; i++) {

                        if (tabla[i] == bomba) {

                            if (i == 0) {
                                if (tabla[i + 1] != bomba) {
                                    tabla[i + 1] = dos;
                                }
                            } else if (i == longitud - 1) {

                                if (tabla[i - 1] != bomba) {
                                    tabla[i - 1] = dos;
                                }

                            } else {

                                if (tabla[i + 1] != bomba) {
                                    tabla[i + 1] = dos;
                                }

                                if (tabla[i - 1] != bomba) {
                                    tabla[i - 1] = dos;
                                }

                            }

                        }

                    }

                    System.out.print("  ");

                    for (int i = 0; i < longitud; i++) {

                        System.out.printf("[%d]", tabla[i]);

                    }

                } else if (cantidadBombas > longitud) {

                    System.out.println("  La cantidad de bombas no puede ser mayor a la longirud del tablero.");

                } else if (longitud > 100) {

                    System.out.println("  La longitud maxima es de 100.");

                } else{

                    System.out.println("  Ingrese por lo menos una bomba.");

                }

            } else {

                System.out.println("  El la longitud debe ser mayor a cero.");

            }

        } catch (InputMismatchException e) {

            System.out.println("  El valor debe ser numerico.");

        } finally{

            leer.close();
            
        }
    }
}