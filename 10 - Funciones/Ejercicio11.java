import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("  Ingrese un numero entero --> ");
        int numero = leer.nextInt();

        leer.close();

        long factorial = calcular_factorial(numero);

        System.out.println("  El factorial de " + numero + " es: " + factorial);
    }

    public static long calcular_factorial(int numero) {
        long factorial = 1;
        
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        return factorial;
    }
}