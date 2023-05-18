import java.util.Scanner;

import java.text.DecimalFormat;

public class Ejercicio17{
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#.#####");

        int cop = 0; 

        double usd = 0; 

        double eur = 0; 

        double jpy = 0; 

        double gbp = 0; 

        System.out.println("Digite la cantidad de pesos Colombianos que desea convertir:");

        cop = entrada.nextInt();

        usd = cop *  0.00022; 

        eur = cop * 0.00020; 

        jpy = cop * 0.030;

        gbp = cop * 0.00018; 

        System.out.println("Estos son los resultados en diferentes monedas:"); 

        System.out.println("Dolar EE.UU: " + usd); 

        System.out.println("Euro: " + eur);

        System.out.println("Yen Japones: " + jpy);

         System.out.println("Libra Esterlina: " + df.format(gbp));

    }

}