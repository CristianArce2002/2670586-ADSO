//Calcular interes fijo con amortizacion al capital; 

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        

        Scanner entrada = new Scanner(System.in);
        NumberFormat formato_moneda = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));
        System.out.print("Ingrese el valor total a financiar: ");
        double valor_total = entrada.nextDouble();
        System.out.print("Ingrese la tasa de interés anual: ");
        double tasa_anual = entrada.nextDouble();
        System.out.print("Ingrese la cantidad de cuotas: ");
        int cantidad_cuotas = entrada.nextInt();

        double tasa_mensual = tasa_anual / 12.0;
        double cuota_mensual = valor_total * tasa_mensual / (1 - Math.pow(1 + tasa_mensual, -cantidad_cuotas));

        System.out.println("Detalle de cada cuota:");
        for (int i = 1; i <= cantidad_cuotas; i++) {
            double interes_mensual = valor_total * tasa_mensual;
            double abono_capital = cuota_mensual - interes_mensual;
            valor_total -= abono_capital;
            System.out.println("Cuota " + i + ":");
            System.out.println("- Valor de la cuota:          " + formato_moneda.format(cuota_mensual));
            System.out.println("- Valor del interés:          " + formato_moneda.format(interes_mensual));
            System.out.println("- Valor del abono a capital:  " + formato_moneda.format(abono_capital));
            System.out.println("- Deuda total:                " + formato_moneda.format(valor_total));
            System.out.println();
        }

    }
}