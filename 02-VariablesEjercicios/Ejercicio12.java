import java.util.Scanner;

public class Ejercicio12{
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

    int ancho =  0;

    int alto = 0;

    int resultado = 0;

    System.out.println("Ingrese el ancho del cuadrado:");

    ancho = entrada.nextInt();

    System.out.println("");

    System.out.println("Ingrese el alto del cuadrado:");

    alto = entrada.nextInt();

    System.out.println("");

    resultado = ancho * alto;

    System.out.println("El area del cuadrado es de: " + resultado);

    }

}