import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);

        System.out.print("Ingrese su edad: ");
        int edad = entrada.nextInt();

        if (edad >= 18){
            System.out.print("Usted puede votar.");
        }else{
            System.out.print("Usted NO puede votar.");

        }
    }
}