// Detectar numero palindromo;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("  Ingrese un numero (maximo 6 digitos) --> ");

        String numero = leer.next();

        try {

            Integer.parseInt(numero);

            String numeroInvertido = "";

            for (int i = numero.length() - 1; i >= 0; i--) {
                numeroInvertido += numero.charAt(i);
            }

            if (numero.equals(numeroInvertido)) {

                System.out.println("  El numero ingresado es palindromo.");

            } else {

                System.out.println("  El numero ingresado no es palindromo.");

            }

        } catch (NumberFormatException e) {

            System.out.println("  Ingrese unicamente numeros.");

        } finally {

            leer.close();

        }
    }
}