import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = entrada.nextInt();

        System.out.print("El numero correspondiente es: ");

        long suma = 0;
        long valor1 = 0;
        long valor2 = 1;

        if (numero == 1) {
            System.out.print(valor1);

        } else if (numero == 2) {
            System.out.print(valor2);

        } else if (numero > 2) {

            for (int i = 1; i <= numero - 2; i++) {
                suma = valor1 + valor2;
                valor1 = valor2;
                valor2 = suma;
            }

            System.out.print(suma);

        } else {
            System.out.println("Ingrese un numero valido.");
        }

    }
}