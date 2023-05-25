import java.util.Scanner;

public class Ejercicio19{
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        String nombre = "";

        int edad = 0;

        long salario = 0; 

        System.out.println("Ingrese su nombre:");

        nombre = entrada.nextLine();

        System.out.println("Ingrese su edad");

        edad = entrada.nextInt();

        System.out.println("Ingrese su salario:");

        salario = entrada.nextInt();
        
        System.out.println("Estos son los datos guardados:");

        System.out.println("Nombre: " + nombre + " / Edad: " + edad + " / Salario: " + salario);

    }

}