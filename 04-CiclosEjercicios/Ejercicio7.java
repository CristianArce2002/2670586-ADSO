import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int valor1 = entrada.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int valor2 = entrada.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int valor3 = entrada.nextInt();

        boolean confirmacion = false;
        int multiplo = 0;

        if (valor1 > 0 && valor2 > 0 && valor3 > 0) {

            for (int i = 1; confirmacion == false; i++) {

                multiplo = valor1 * i;

                if (multiplo % valor2 == 0 && multiplo % valor3 == 0) {
                    confirmacion = true;
                }

            }

            System.out.println("El MCM es " + multiplo);

        } else {
            System.out.println("Ingrese valores validos.");
        }

    }

}