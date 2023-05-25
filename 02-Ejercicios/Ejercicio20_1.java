import java.util.Scanner;

public class Ejercicio20_1 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero (maximo 5 digitos): ");

        int numero = entrada.nextInt();

        int digito_1 = numero%10;

        int digito_2 = (numero%100)/10;

        int digito_3 = (numero%1000)/100;

        int digito_4 = (numero%10000)/1000;

        int digito_5 = numero/10000;

        int suma = digito_1 + digito_2 + digito_3 + digito_4 + digito_5;

        System.out.println("Esta es la suma de los digitos: " + suma);

    }

}
