import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = entrada.nextInt();

        System.out.print("La sucesion Fibonacci es: ");

        long suma = 0;
        long valor1 = 0;
        long valor2 = 1;

        if (numero > 0) {

            System.out.print(valor1);

            if (numero > 1) {
                System.out.print(", " + valor2);
            }

            for (int i = 1; i <= numero - 2; i++) {

                suma = valor1 + valor2;
                System.out.print(", " + suma);
                valor1 = valor2;
                valor2 = suma;
                
            }
            
        } else {
            System.out.println("Ingrese un numero valido.");
        }

    }
}