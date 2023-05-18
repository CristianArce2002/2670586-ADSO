import java.util.Scanner;

public class Ejercicio10{
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int n1 = 0;
         
        int n2 = 0;

        double resultado = 0;

        double residuo = 0;

        System.out.println("Ingrese el primer numero:");

        n1 = entrada.nextInt();

        System.out.println("");
        
        System.out.println("Ingrese el segundo numero:");

        n2 = entrada.nextInt();

        System.out.println("");

        resultado = n1 / n2; 

        residuo = n1 % n2; 

        System.out.println("El resultado es:");

        System.out.println(resultado);

        System.out.println("");

        System.out.println("El residuo de la divicion es:");

        System.out.println(residuo);    

    }

}