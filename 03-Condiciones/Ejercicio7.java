import java.util.Scanner;

public class Ejercicio7{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Igrese un numero (Maximo 10 dígitos e inferior a los dos mil millones): ");

        int numero = entrada.nextInt();

        System.out.println("");

        int digito1 = numero / 1000000000;

        int digito2 = (numero % 1000000000) / 100000000;

        int digito3 = (numero % 100000000) /  10000000;

        int digito4 = (numero % 10000000) /   1000000;

        int digito5 = (numero % 1000000) /   100000;

        int digito6 = (numero % 100000) /   10000;

        int digito7 = (numero % 10000) /   1000;

        int digito8 = (numero % 1000) /   100;

        int digito9 = (numero % 100) /   10;

        int digito10 = (numero % 10) /  1;

        if (numero > 1999999999){

            System.out.println("Ingrese un numero que cumpla con lo establecido.");

        }else{

            System.out.println("//----Formato moneda:----//");
            System.out.println("");
            System.out.println("  Moneda: $ " + digito1 + "." + digito2 + digito3 + digito4 + "." + digito5 + digito6 + digito7 + "." + digito8 + digito9 + digito10);
            System.out.println("//-----------------------//");
        }

    }

}
