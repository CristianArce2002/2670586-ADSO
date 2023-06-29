
// Dividir sueldo por cantidad de pagos; 

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        NumberFormat formato_moneda = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));
        System.out.print("    => Ingrese un sueldo Total: ");
        double sueldo_total = entrada.nextDouble();

        if (sueldo_total > 0) {

            System.out.print("    => Cantidad de Pagos: ");
            int cantidad_pagos = entrada.nextInt();

            if (cantidad_pagos > 0) {

                System.out.println("    -------------- FORMAS DE PAGO -----------------");
                System.out.println("            1. Pagos de igual valor");
                System.out.println("            2. Primer pago diferente.");
                System.out.println("            3. Ultimo pago diferente.");
                System.out.println("            4. Primer y Ultimo pago diferente.");

                System.out.print("    => Ingrese forma de Pago: ");
                int opcion = entrada.nextInt();

                System.out.println("    ------------- SUS PAGOS SERAN ------------------");

                if (cantidad_pagos == 1) {
                    System.out.println("            Mes 1 : " + formato_moneda.format(sueldo_total));
                } else {

                    if (opcion == 1) {
                        for (int i = 1; i <= cantidad_pagos; i++) {
                            System.out.println("            Mes " + i + ": " + formato_moneda.format(sueldo_total / cantidad_pagos));
                        }
                    } else if (opcion == 2) {

                        Double pago_diferente = sueldo_total / (cantidad_pagos + 1);
                        sueldo_total = sueldo_total - pago_diferente;

                        for (int i = 1; i <= cantidad_pagos; i++) {
                            if (i == 1) {
                                System.out.println("            Mes " + i + ": " + formato_moneda.format(pago_diferente));
                            } else {
                                System.out.println("            Mes " + i + ": " + formato_moneda.format(sueldo_total / (cantidad_pagos - 1)));
                            }
                        }

                    } else if (opcion == 3) {

                        Double pago_diferente = sueldo_total / (cantidad_pagos + 1);
                        sueldo_total = sueldo_total - pago_diferente;

                        for (int i = 1; i <= cantidad_pagos; i++) {
                            if (i == cantidad_pagos) {
                                System.out.println("            Mes " + i + ": " + formato_moneda.format(pago_diferente));
                            } else {
                                System.out.println("            Mes " + i + ": " + formato_moneda.format(sueldo_total / (cantidad_pagos - 1)));
                            }
                        }

                    } else if (opcion == 4) {

                        Double inicio_diferente = sueldo_total / (cantidad_pagos + 1);
                        sueldo_total = sueldo_total - inicio_diferente;
                        double final_diferente;

                        if (cantidad_pagos == 2) {
                            final_diferente = sueldo_total;
                        } else {
                            final_diferente = sueldo_total / (cantidad_pagos + 1);
                            sueldo_total = sueldo_total - final_diferente;
                        }

                        for (int i = 1; i <= cantidad_pagos; i++) {

                            if (i == 1) {
                                System.out.println("            Mes " + i + ": " + formato_moneda.format(inicio_diferente));
                            } else if (i == cantidad_pagos) {
                                System.out.println("            Mes " + i + ": " + formato_moneda.format(final_diferente));
                            } else {
                                System.out.println("            Mes " + i + ": " + formato_moneda.format(sueldo_total / (cantidad_pagos - 2)));
                            }
                        }
                    } else {
                        System.out.println("    Ingrese una opcion valida.");
                    }

                }

            } else {
                System.out.println("    Ingrese una cantidad de pagos valida.");
            }

        } else {
            System.out.println("    Ingrese un sueldo valido.");
        }


    }
}