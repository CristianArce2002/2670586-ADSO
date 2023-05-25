import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número entero (5 digitos maximo):");

        int numero = entrada.nextInt();

        int digito1 = numero / 10000;
        int digito2 = (numero % 10000) / 1000;
        int digito3 = (numero % 1000) / 100;
        int digito4 = (numero % 100) / 10;
        int digito5 = (numero % 10) / 1;

        int suma = digito1 + digito2 + digito3 + digito4 + digito5;

        System.out.println("la suma de los 5 digitos es: " + suma);
        
    }

}