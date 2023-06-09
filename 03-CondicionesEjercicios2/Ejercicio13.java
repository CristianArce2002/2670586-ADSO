import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numero = entrada.nextInt();

        if (numero % 2 == 0 && numero % 3 == 0 && numero % 5 == 0) {
            System.out.print("El numero ingresado es divisible entre 2, 3 y 5.");
        } else {
            System.out.print("El numero ingresado No es divisible entre 2, 3 y 5.");

        }
    }
}