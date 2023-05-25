import java.util.Scanner;

import java.text.DecimalFormat;

public class Ejercicio14{
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#.#");

        double matematicas = 0;
        
        double fisica = 0;

        double quimica = 3.7;

        int cm = 3;

        int cf = 4;

        int cq = 2;

        int total_creditos;

        double resultado; 

        System.out.println("Ingrese nota de Matematicas:");

        matematicas = entrada.nextDouble();

        System.out.println("Ingrese nota de Fisica:");

        fisica = entrada.nextDouble();

        System.out.println("Ingrese nota de Quimica:");

        quimica = entrada.nextDouble();

        System.out.println("");

        System.out.println("Ingrese credito de Matematicas:");

        cm = entrada.nextInt();

        System.out.println("Ingrese credito de Fisica:");

        cf = entrada.nextInt();

        System.out.println("Ingrese credito de Quimica:");

        cq = entrada.nextInt();

        total_creditos = cm + cf + cq;

        resultado = (matematicas*cm)+(fisica*cf)+(quimica*cq);

        resultado = resultado / total_creditos; 

        System.out.println("El promedio de notas es : " + df.format(resultado));

    }

}