import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print(" Ingrese el primer numero --> ");
        double n1 = leer.nextInt();

        System.out.print(" Ingrese el segungo numero --> ");
        double n2 = leer.nextInt();

        leer.close();

        System.out.println(" La divicion es: " + dividir(n1, n2));

    }

    public static double dividir(double a, double b) {
        return (a / b);
    }
}
