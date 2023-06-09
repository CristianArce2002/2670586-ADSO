import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);

        System.out.print("Ingrese un año: ");
        int año = entrada.nextInt();

        if (año <= 0){
            System.out.println("Ingrese un año válido, intente de nuevo.");
        }else{
            
            if (año % 4 == 0){
                System.out.print("El año ingresado es bisiesto.");
            }else{
                System.out.print("El año ingresado NO es bisiesto.");
            }
        }
    }
}