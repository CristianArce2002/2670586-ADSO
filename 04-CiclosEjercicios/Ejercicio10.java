import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero positivo (menor o igual a once): ");

        int n = entrada.nextInt();
        Boolean confirmacion = true;
        int numero = 2;
        int contador = 1;

        System.out.println("Los numeros primos encontrados son:");

        if (n <= 11) {

            for (int z = 1; contador <= (n * n); z++) {

                if (numero % numero == 0 && numero % 1 == 0 && numero > 1) {

                    confirmacion = true;

                    for (int i = 2; i <= Math.sqrt(numero) && confirmacion == true; i++) {

                        if (numero % i == 0) {
                            confirmacion = false;
                        }
                    }

                    if (confirmacion == true) {

                        if (numero < 10) {
                            System.out.print("[00");
                        } else if (numero < 100) {
                            System.out.print("[0");
                        } else if (numero < 1000) {
                            System.out.print("[");
                        }

                        System.out.print(numero + "]   ");

                        if (contador % n == 0) {
                            System.out.println();
                        }

                        contador = contador + 1;
                    }

                }

                numero = numero + 1;
            }

        } else if (n > 11 || n < 1) {
            System.out.println("Ingrese un numero valido");
        }
    }

}
