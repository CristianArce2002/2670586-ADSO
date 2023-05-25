import java.util.Scanner;

public class Ejercicio1{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("hola, ¿cual es su edad?: ");

        int edad = entrada.nextInt();

        if (edad < 18){

            System.out.print("Usted recibe un auxilio de $ 800.000");

        }else{

            System.out.print("Usted recibe un auxilio de $ 200.000");

        }    

    }
}