import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entre 1 y 6: ");
        int numero_ingresado = entrada.nextInt();
        int numero_contruido = 0;

        if (numero_ingresado > 0 && numero_ingresado <= 6) {

            for (int i = 1; i <= numero_ingresado; i++) {
                int aleatorio = (int) Math.floor(Math.random() * 10);
                if (i == 1 && aleatorio == 0 && numero_ingresado != 1) {
                    i = i - 1;
                } else {
                    numero_contruido = (numero_contruido * 10) + aleatorio;
                }
            }

            System.out.println("El numero construido es: " + numero_contruido);
            System.out.println("Resultado producto: " + numero_contruido * 2);

        } else {
            System.out.println("Ingrese un numero validio.");
        }
    }
}