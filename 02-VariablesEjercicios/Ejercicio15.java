import java.util.Scanner;

import java.text.DecimalFormat;

public class Ejercicio15{
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#.####");

        int metros = 0;

        int centimetros = 0; 

        double pulgadas = 0;

        double pies = 0;

        System.out.println("Digite la cantidad de metros que desea convertir:");
        
        metros = entrada.nextInt();

        centimetros = metros * 100;

        pulgadas = metros * 39.3701;

        pies = metros * 3.28084;

        System.out.println("Estos son los resultados:");

        System.out.println("Centimetros: " + centimetros + " / Pulgadas: " + df.format(pulgadas) + " / Pies: " + df.format(pies));

    }

}