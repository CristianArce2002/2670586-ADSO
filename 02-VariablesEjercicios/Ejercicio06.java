import java.util.Scanner;

public class Ejercicio06{
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int n1 = 0;

        int n2 = 0;

        int n3 = 0;

        int n4 = 0;

        int promedio = 0;

        System.out.println("Digite el primer valor:");

        n1 = entrada.nextInt();

        System.out.println("Digite el segundo valor:");

        n2 = entrada.nextInt();

        System.out.println("Digite el tercer valor:");

        n3 = entrada.nextInt();

        System.out.println("Digite el cuarto valor:");

        n4 = entrada.nextInt();

        promedio = (n1 + n2 + n3 + n4) / 4;

        System.out.println("El promedio entre los valores es: " + promedio);

    }

}