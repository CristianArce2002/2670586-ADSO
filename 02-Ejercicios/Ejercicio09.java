import java.util.Scanner;

public class Ejercicio09{
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int  numero = 0;

        System.out.println("Digite un numero:");

        numero = entrada.nextInt();

         do {

            System.out.println("Digite un numero valido:");

            numero = entrada.nextInt();

        } while (numero == 0);

        if (numero % 2 == 0){

            System.out.println("El " + numero + " es un numero Par");

        }  else {

            System.out.println("El " + numero + " es un numero Impar");

        }        
        
    }

}