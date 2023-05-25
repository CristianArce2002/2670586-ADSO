import java.util.Scanner;

public class Ejercicio01{
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int n1 = 0; 

        int n2 = 0;

        int suma = 0;

        System.out.println("Ingrese el primer numero:");

        n1 = entrada.nextInt();

        System.out.println("Ingrese el segundo numero");

        n2 = entrada.nextInt();

        suma = n1 + n2;

        System.out.println("La suma de ambos es: " + suma);

    }

}