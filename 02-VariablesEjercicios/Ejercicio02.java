import java.util.Scanner;

public class Ejercicio02{
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        double celsius = 0;

        double fahrenheit = 0;

        System.out.println("Ingrese los grados celsius");

        celsius = entrada.nextDouble();

        fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("En grados fahrenheit equivale a: " + fahrenheit);

    }

}