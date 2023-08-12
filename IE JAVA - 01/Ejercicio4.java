// Calcular consumo de gasolina;

import java.util.InputMismatchException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double[][] tabla = {
                { 5.0, 81.7, 53.6, 99.8, 70.4 },
                { 81.5, 5.0, 103.0, 103.0, 34.3 },
                { 57.9, 103.0, 5.0, 83.2, 109.0 },
                { 98.5, 102.0, 83.5, 5.0, 75.2 },
                { 70.5, 34.5, 109.0, 76.4, 5.0 }
        };

        String[] nombres = { "Mistrato", "Pueblo Rico", "Quinchia", "Santa Rosa de Cabal", "Santuario" };

        System.out.println("  ============= MENÚ =============");

        for (int i = 0; i < nombres.length; i++) {

            System.out.println("  " + (i + 1) + ". " + nombres[i]);

        }

        System.out.println("  ==============================");

        System.out.print("  Ingrese cantidad de paradas --> ");

        Double kilometrosRecorridos = 0.0;

        try {

            int paradas = leer.nextInt();

            if (paradas > 0) {

                System.out.print("  Ingrese municipio de origen --> ");

                int municipioOringen = leer.nextInt() - 1;

                if (municipioOringen >= 0 && municipioOringen < 5) {

                    for (int i = 1; i <= paradas; i++) {

                        System.out.println("  Estas en " + nombres[municipioOringen]);

                        System.out.print("  Ingrese parada " + i + " --> ");

                        int destino = leer.nextInt() - 1;

                        kilometrosRecorridos += tabla[municipioOringen][destino];

                        municipioOringen = destino;

                    }

                    System.out.print("  Ingrese consumo de combustible (km/galon) --> ");
                    double consumo = leer.nextDouble();

                    System.out.print("  Ingrese precio de combustible (galon) --> ");
                    double precio = leer.nextDouble();

                    System.out.println("  El reccorrido tiene " + kilometrosRecorridos + " kilometros.");

                    double galonesUsados = consumo * kilometrosRecorridos;

                    String formato = String.format("%.2f", galonesUsados); 
                    System.out.println("  Se necesitan " + formato + " galones de combustible.");

                    Locale peso = new Locale("es", "CO");
                    NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(peso);

                    System.out.println("  El valor en pesos es: " + formatoMoneda.format(galonesUsados * precio));

                } else {

                    System.out.println("  Ingrese una opcion valida.");
                }

            }else{

                System.out.println("  La cantidad de paradas debe ser minimo una.");

            }

        } catch (InputMismatchException e) {

            System.out.println("  El valor a ingresar debe ser numerico.");

        } finally {

            leer.close();

        }
    }
}