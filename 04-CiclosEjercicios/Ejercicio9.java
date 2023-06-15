import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        boolean confirmacion = true;

        System.out.print("Ingrese un numero: ");
        int numero = entrada.nextInt();

        if (numero % numero == 0 && numero % 1 == 0 && numero > 1) {

            for (int i = 2; i <= Math.sqrt(numero) && confirmacion == true; i++) {
                if (numero % i == 0) {
                    confirmacion = false;
                }
            }

            if (confirmacion == true) {
                System.out.print("El " + numero + " es un numero primo");
            }

            if (confirmacion == false) {
                System.out.print("El " + numero + " No es un numero primo");
            }

        }else{
            System.out.println("ingrese un numero valido");
        }

    }

}