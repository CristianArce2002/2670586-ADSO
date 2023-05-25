import java.util.Scanner;

public class Ejercicio2{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero de 3 digitos: ");

        int numero = entrada.nextInt();

        if (numero > 999 || numero < 100){

                System.out.print("El numero que ha ingresado no es de 3 digitos.");

        }else{

            if (numero % 2 == 0){

                System.out.print("El numero ingresado es Par.");

            }else{

                System.out.print("El numero ingresado es Impar.");
            }

        }

    }

}
