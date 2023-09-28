import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("  Ingrese la longitud del arreglo --> ");
        int[] arreglo = new int[leer.nextInt()];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("  Ingrese numero para la pocicion " + i + " --> ");
            arreglo[i] = leer.nextInt();
        }
        leer.close();

        ordenar_arreglo(arreglo);

        System.out.print("  El arreglo ordenado es: ");

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }

    public static void ordenar_arreglo(int[] arreglo) {

        for (int i = 0; i < arreglo.length - 1; i++) {

            for (int j = i + 1; j < arreglo.length; j++) {

                if (arreglo[i] > arreglo[j]) {

                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;

                }
            }
        }
    }
}