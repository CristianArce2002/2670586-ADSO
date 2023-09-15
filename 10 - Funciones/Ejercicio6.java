import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print(" Ingrese el primer numero --> ");
        int n1 = leer.nextInt();

        System.out.print(" Ingrese el segungo numero --> ");
        int n2 = leer.nextInt();

        System.out.print(" Ingrese el tercer numero --> ");
        int n3 = leer.nextInt();

        leer.close();

        System.out.println(" El valor maximo es: " + maximo(n1, n2, n3));

    }

    public static int maximo(int a, int b, int c) {
        
        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }
}
