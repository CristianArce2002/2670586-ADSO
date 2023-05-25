import java.util.Scanner;

public class Ejercicio5{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");

        int numero1 = entrada.nextInt();

        System.out.print("Ingrese el segundo numero: ");

        int numero2 = entrada.nextInt();

        System.out.print("Ingrese el tercer numero: ");

        int numero3 = entrada.nextInt();    
        
        if (numero1 < numero2 && numero2 < numero3){

            System.out.println("Los numeros fueron ingresados en orden ascendente.");

        }else{

            System.out.println("Los numeros N0 fueron ingresados en orden ascendente.");
        }

    }

}
