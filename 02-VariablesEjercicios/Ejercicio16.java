import java.util.Scanner;

public class Ejercicio16{
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int inversion = 0;

        int tasa_interes = 0; 

        int periodo = 0; 

        double monto_total = 0; 

        System.out.println("Digite la cantidad de su inversion:"); 
        
        inversion = entrada.nextInt();

        System.out.println("Digite una taza de interes:");

        tasa_interes = entrada.nextInt();

        System.out.println("Ingresa el periodo que desea (años):");

        periodo = entrada.nextInt();

        monto_total = inversion * Math.pow(1 + tasa_interes, periodo);

        System.out.println("La ganancia de su inversion es de: " + monto_total);

    }

}