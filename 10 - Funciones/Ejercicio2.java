import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print(" Ingrese el primer numero --> ");
        int n1 = leer.nextInt();

        System.out.print(" Ingrese el segungo numero --> ");
        int n2 = leer.nextInt();

        leer.close();

        System.out.println(" La resta es: " +  restar(n1, n2));

    }

    public static int restar(int a, int b){
        return (a - b);
    }
}

