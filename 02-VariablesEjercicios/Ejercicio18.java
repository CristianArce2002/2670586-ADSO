import java.util.Scanner;

import java.text.DecimalFormat;

public class Ejercicio18{
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#.#");

        double peso =  0;

        double altura = 0; 

        double imc = 0;

        System.out.println("Ingrese su peso (kg):");

        peso = entrada.nextDouble();

        System.out.println("Ingrese su altura (m):");

        altura = entrada.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("Su indice se masa corporal es: " + df.format(imc));
        
    }

}   