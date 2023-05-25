import java.util.Scanner;

public class Ejercicio08{

    public static void main(String[] args ){

        Scanner entrada = new Scanner(System.in);

        String cadena1 = "";

        String cadena2 = "";

        System.out.println("Ingrese texto para la cadena 1:");

        cadena1 = entrada.nextLine();

        System.out.println("");

        System.out.println("Ingrese texto para la cadena 2:");

        cadena2 = entrada.nextLine();

        System.out.println("");

        System.out.println("Este es el texto concatenado:");

        System.out.println(cadena1 + " " + cadena2);

    }

}