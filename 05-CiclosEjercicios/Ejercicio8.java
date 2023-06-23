import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("ingrese un numero: ");
        int numero_ingresado = entrada.nextInt();

        if (numero_ingresado > 0) {

            int salto_de_linea = numero_ingresado;
            numero_ingresado = (numero_ingresado * numero_ingresado) / 2;

            int cantidad_no_primos = 1;

            int a = 0; // este será el rango maximo de numeros NO primos. 

            for (a = 1; cantidad_no_primos <= numero_ingresado; a++) {

                int divisores = 0;

                for (int b = 1; b <= a; b++) {
                    if (a % b == 0) {
                        divisores = divisores + 1;
                    }
                }
                if (divisores != 2) {
                    cantidad_no_primos = cantidad_no_primos + 1;
                }
            }

            int contador_primo = 1;
            int contador_no_primo = a - 1;

            for (int cuadricula = 1; cuadricula <= numero_ingresado; cuadricula++) {

                boolean v1 = false; // confirmar que se imprimio un numero primo.
                boolean v2 = false; // confirmar que se imprimio un numero NO primo.

                while (v1 == false) {

                    int divisores = 0;

                    for (int c = 1; c <= contador_primo; c++) {
                        if (contador_primo % c == 0) {
                            divisores = divisores + 1;
                        }
                    }
                    if (divisores == 2) {
                        v1 = true;
                        System.out.print(" | " + contador_primo);
                        if (contador_primo < 100 && contador_primo > 9) {
                            System.out.print(" ");
                        } else if (contador_primo < 10) {
                            System.out.print("  ");
                        }
                    }
                    contador_primo = contador_primo + 1;
                }

                while (v2 == false) {

                    int divisores = 0;

                    for (int i = 1; i <= contador_no_primo; i++) {
                        if (contador_no_primo % i == 0) {
                            divisores = divisores + 1;
                        }
                    }
                    if (divisores != 2) {
                        v2 = true;
                        System.out.print(" | " + contador_no_primo);
                        if (contador_no_primo < 100 && contador_no_primo > 9) {
                            System.out.print(" ");
                        } else if (contador_no_primo < 10) {
                            System.out.print("  ");
                        }
                    }
                    contador_no_primo = contador_no_primo - 1;
                }

                if (cuadricula % salto_de_linea == 0) {
                    System.out.println(" |");
                }
            }

        } else {
            System.out.println("Ingrese un numero valido.");
        }

    }

}
