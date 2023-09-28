import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("  Ingrese la longitud del arreglo --> ");
        int[] arreglo = new int [leer.nextInt()];
        leer.close();

        llenar_arreglo(arreglo);

        for (int i = 0; i < arreglo.length; i++){

            System.out.print("["+arreglo[i]+"] ");
            
        }
        
    }

    public static void llenar_arreglo(int[] arreglo){

        for (int i = 0; i < arreglo.length; i++){

            int aleatorio = (int) Math.round( Math.random() * 10);

            arreglo[i] = aleatorio;

        }

    }   
}
