import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("  Ingrese la longitud del arreglo --> ");
        int longitud = leer.nextInt();
        int[] arreglo = new int[longitud];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("  Ingrese un número para la posicion " + i + " --> ");
            arreglo[i] = leer.nextInt();
        }

        leer.close();

        int minimo = valor_minimo(arreglo);

        System.out.println("  El valor minimo del arreglo es: " + minimo);
    }

    public static int valor_minimo(int[] arreglo) {

        int minimo = arreglo[0];

        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < minimo) {
                minimo = arreglo[i];
            }
        }

        return minimo;
    }
}