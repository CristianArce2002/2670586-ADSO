import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese numero inicial: ");
        int r1 = entrada.nextInt();
        System.out.print("Ingrese numero final: ");
        int r2 = entrada.nextInt();
        int rango = r1; 


        for (rango = r1; rango <= r2; rango ++){
            
            int Factorial = 1; 
    
            System.out.print("Factorial de " + rango + " (" + rango + "!): ");
    
            for (int i = 1; i <= rango; i++) {
                if (rango == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " x ");
                }
                Factorial = Factorial * i; 
            }
    
            System.out.println( "= " + Factorial);             
        }


    }

}
