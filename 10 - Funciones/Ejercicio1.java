import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print(" Ingrese el primer numero --> ");
        int n1 = leer.nextInt();

        System.out.print(" Ingrese el segungo numero --> ");
        int n2 = leer.nextInt();

        leer.close();

        System.out.println(" La suma es: " +  sumar(n1, n2));

    }

    public static int sumar(int a, int b){
        return (a + b);
    }
}

