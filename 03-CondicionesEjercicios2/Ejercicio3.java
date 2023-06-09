import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = entrada.nextInt();

        if (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println("El numero es Par");
            } else {
                System.out.println("El numero es Impar");
            }
        }else{
            System.out.println("Ingrese un numero diferente a cero, intente otra vez.");

        }

    }
}