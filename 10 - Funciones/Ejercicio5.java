import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print(" Ingrese el primer numero --> ");
        int n1 = leer.nextInt();

        System.out.print(" Ingrese el segungo numero --> ");
        int n2 = leer.nextInt();

        leer.close();

        System.out.println(" La potencia es: " + potenciar(n1, n2));

    }

    public static int potenciar(int a, int b) {
        int resultado = a; 
        for (int i = 1; i < b; i++ ){
            resultado = resultado * a;
        }
        return resultado;
    }
}
