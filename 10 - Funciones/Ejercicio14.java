import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("  Ingrese la longitud del arreglo --> ");
        int[] arreglo = new int[leer.nextInt()];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese pocicion " + i + " --> ");
            arreglo[i] = leer.nextInt();
        }

        leer.close();

        if (verficar_orden(arreglo)) {
            System.out.println("El arreglo esta ordenado de forma ascendente");
        } else {
            System.out.println("El arreglo no esta ordenado de forma ascendente");
        }
    }

    public static boolean verficar_orden(int[] arreglo) {

        for (int i = 0; i < arreglo.length - 1; i++) {

            if (arreglo[i] > arreglo[i+1]) {
                return false;
            }

        }

        return true;
        
    }
}