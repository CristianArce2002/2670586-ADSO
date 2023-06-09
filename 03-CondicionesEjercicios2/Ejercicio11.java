import java.util.Scanner;
import java.lang.Integer;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la primer número: ");
        String cadena1 = entrada.next();

        System.out.print("Ingrese el segundo número: ");
        String cadena2 = entrada.next();

        String cadena_unida = cadena1 + cadena2;

        long cadena_numerica = Long.parseLong(cadena_unida);

        System.out.println("La cadena ingresada es :" + cadena_numerica);

        if (cadena_numerica != 0) {

            if (cadena_numerica % 2 == 0) {
                System.out.println("La cadena ingresada es Par");
            } else {
                System.out.println("La cadena ingresada es Impar");
            }

        } else {
            System.out.println("Ingrese una cadena diferente a cero, intente otra vez.");
        }

    }
}