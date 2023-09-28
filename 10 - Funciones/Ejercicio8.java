import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("  Ingrese la longitud del arreglo --> ");
        int[] arreglo = new int [leer.nextInt()];
        
        for (int i = 0; i < arreglo.length; i++){
            System.out.print("  Ingrese numero para la pocicion " + i + " --> ");
            arreglo[i] = leer.nextInt();
        }

        leer.close();

        mostrar_arreglo(arreglo);
        
    }

    public static void mostrar_arreglo(int[] arreglo){

        for (int i = 0; i < arreglo.length; i++){

            System.out.print("["+arreglo[i]+"] ");
            
        }
    }
}
