import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("  Ingrese la longitud del arreglo --> ");
        int longitud = leer.nextInt();
        int[] arreglo = new int[longitud];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("  Ingrese un numero para la posicion " + i + " --> ");
            arreglo[i] = leer.nextInt();
        }

        leer.close();

        double promedio = calcularPromedio(arreglo);

        System.out.println("El promedio del arreglo es: " + promedio);
    }

    public static double calcularPromedio(int[] arreglo) {
        int suma = 0;
        
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }

        double promedio = (double) suma / arreglo.length;

        return promedio;
    }
}