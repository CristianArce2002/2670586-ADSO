//Calcular intereses totales;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad todal financiada: ");
        Double total_financiado = entrada.nextDouble();

        System.out.print("Ingrese cantidad de cuotas pagadas: ");
        Double cantidad_cuotas = entrada.nextDouble();
        double total_cuota = 0.0; 

        for (int i = 1; i <= cantidad_cuotas; i++){
            System.out.print("Ingrese el valor de la cuota " + i + ": ");
            Double valor_cuota = entrada.nextDouble();
            total_cuota = total_cuota + valor_cuota; 
        }

        Double interes_pagado = ((total_cuota - total_financiado) / total_financiado) * 100;
        System.out.println("El total de interes pagados es de " + interes_pagado + " %.");


    }
}
