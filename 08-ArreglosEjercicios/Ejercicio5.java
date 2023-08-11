// Calcular promedio de datos float aleatorios;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("  ¿Cuantos datos desea generar? --> ");

        int cantidadDatos = 0;

        float[] datos;

        try {

            cantidadDatos = leer.nextInt();

            if (cantidadDatos == 0) {
                System.out.println("  La cantidad de datos no puede ser cero.");
            } else {

                datos = new float[cantidadDatos];

                Random aleatorio = new Random();
                float min = 0.0f;
                float max = 10.0f;
                for (int i = 0; i < cantidadDatos; i++) {
                    datos[i] = aleatorio.nextFloat() * (max - min) + min;
                }

                float suma = 0;
                for (int i = 0; i < cantidadDatos; i++) {
                    suma += datos[i];
                }
                float promedio = suma / cantidadDatos;

                System.out.println("  El promedio de los datos es: " + promedio);

            }

        } catch (InputMismatchException e) {

            System.out.println("  La cantidad debe ser un numero.");

        } catch (NegativeArraySizeException e) {

            System.out.println("  La cantidad no puede ser negativa.");

        } finally{

            leer.close();

        }
    }
}