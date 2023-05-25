import java.util.Scanner;

public class Ejercicio03{
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int n1 = 0;

        int n2 = 0;

        int auxiliar = 0;

        System.out.println("Dame el primer valor:");

        n1 = entrada.nextInt();

        System.out.println("Dame el segundo valor");

        n2 = entrada.nextInt(); 

        auxiliar = n1;

        n1 = n2;

        n2 = auxiliar;

        System.out.println("Este es el resultado al invertir los valores:");

        System.out.println("Primer valor: " +  n1 + " / Segundo valor: " + n2);


    }

}