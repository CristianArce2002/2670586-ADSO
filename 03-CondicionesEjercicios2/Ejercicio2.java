import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int n1 = entrada.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int n2 = entrada.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        int n3 = entrada.nextInt();

        System.out.print("Ingrese el cuarto numero: ");
        int n4 = entrada.nextInt();

        if (n1 > n2 && n1 > n3 && n1 > n4) {
            System.out.println("El numero mayor es: " + n1);

        } else if (n2 > n1 && n2 > n3 && n2 > n4) {
            System.out.println("El numero mayor es: " + n2);

        } else if (n3 > n1 && n3 > n2 && n3 > n4) {
            System.out.println("El numero mayor es: " + n3);

        } else if (n4 > n1 && n4 > n2 && n4 > n3) {
            System.out.println("El numero mayor es: " + n4);
        }

    }
}