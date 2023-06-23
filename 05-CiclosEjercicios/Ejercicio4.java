import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero de maximo 6 digitos.");
        int numero = entrada.nextInt();

        int cantidad_digitos = 0; 

        for (int i = numero; i > 1; cantidad_digitos ++){
            i = i / 10; 
        }

        int digito1 = numero / 100000;
        int digito2 = (numero % 100000) / 10000;
        int digito3 = (numero % 10000) / 1000;
        int digito4 = (numero % 1000) / 100;
        int digito5 = (numero % 100) / 10;
        int digito6 = (numero % 10) / 1;

        if (numero < 1000000 && numero > -1000000) {

            if (numero >= 0 && numero < 10) {
                System.out.println("El numero ingresado SI es un palindromo.");
            }

            if (numero > 9 && numero < 100) {
                if (digito5 == digito6) {
                    System.out.println("El numero ingresado SI es un palindromo.");
                } else {
                    System.out.println("El numero ingresado NO es un palindromo.");
                }
            }

            if (numero > 99 && numero < 1000) {
                if (digito4 == digito6) {
                    System.out.println("El numero ingresado SI es un palindromo.");
                } else {
                    System.out.println("El numero ingresado NO es un palindromo.");
                }
            }

            if (numero > 999 && numero < 10000) {
                if (digito3 == digito6 && digito4 == digito5) {
                    System.out.println("El numero ingresado SI es un palindromo.");
                } else {
                    System.out.println("El numero ingresado NO es un palindromo.");

                }
            }

            if (numero > 9999 && numero < 100000) {
                if (digito2 == digito6 && digito3 == digito5) {
                    System.out.println("El numero ingresado SI es un palindromo.");
                } else {
                    System.out.println("El numero ingresado NO es un palindromo.");
                }
            }

            if (numero > 99999 && numero < 1000000) {
                if (digito1 == digito6 && digito2 == digito5 && digito3 == digito4) {
                    System.out.println("El numero ingresado SI es un palindromo.");
                } else {
                    System.out.println("El numero ingresado NO es un palindromo.");

                }
            }

        }

    }

}
