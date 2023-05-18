import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String numero = "";

        int suma = 0;

        char digito = 0;

        int valor_digito = 0;

        System.out.print("Ingresa un número entero:");

        numero = entrada.nextLine();

        int cantidad = numero.length();

        for (int i = 0; i < cantidad; i++) {

            digito = numero.charAt(i);

            valor_digito = Character.getNumericValue(digito);

            suma = suma + valor_digito;

        }

        System.out.println("La suma de los dígitos es: " + suma);
        
    }

}