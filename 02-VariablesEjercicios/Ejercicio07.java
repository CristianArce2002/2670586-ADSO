import java.util.Scanner;

public class Ejercicio07{

    public static void main(String[] args ){

        Scanner entrada = new Scanner(System.in);

        int precio = 0; 

        int porcentaje = 0;

        double resultado = 0;

        System.out.println("Ingrese el precio del producto:");

        precio = entrada.nextInt();

        System.out.println("");

        System.out.println("Ingrese el descuento que desea:");

        porcentaje = entrada.nextInt();

        System.out.println("");

        resultado = precio * porcentaje / 100; 

        resultado = precio - resultado;

        System.out.println("este es el precio final: " + resultado);

    }

}