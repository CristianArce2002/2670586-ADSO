//Calcular precio consumo conbustible; 

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Ejercicio4 {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        NumberFormat formato_moneda = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));
        int municipio_parada = 0;
        Double gasolina_kilometro = 0.3;
        double total_gasolina = 0.0;
        double distancia_total = 0.0;

        System.out.println("-----------------Lista de Municipios-----------------");
        System.out.println("");
        System.out.println("  1.  Apía                 8.  Marcella");
        System.out.println("  2.  Balboa               9.  Mistratró");
        System.out.println("  3.  Belén de Umbría      10. Pereira");
        System.out.println("  4.  Dosquebradas         11. Pueblo rico");
        System.out.println("  5.  Guática              12. Quinchía");
        System.out.println("  6.  La Celia             13. Santa Rosa de Cabal");
        System.out.println("  7.  La Virginia          14. Santuario");
        System.out.println("");
        System.out.println("-----------------------------------------------------");

        System.out.print("Ingrese municipio de origen: ");
        int municipio_origen = entrada.nextInt();

        System.out.print("Ingrese cantidad de paradas: ");
        int cantidad_paradas = entrada.nextInt();

        System.out.print("Ingrese el precio de la gasolina (Un litro): ");
        Double precio_gasolina = entrada.nextDouble();

        System.out.println();

        for (int i = 1; i <= cantidad_paradas; i++) {

            System.out.print("ingrese municipio de la parada " + i + ": ");
            municipio_parada = entrada.nextInt();

            Double distancia_recorrida = 0.0;

            if (municipio_origen == 1) {

                switch (municipio_parada) {
                    case 1:
                        distancia_recorrida = 5.0;
                        break;
                    case 2:
                        distancia_recorrida = 39.8;
                        break;
                    case 3:
                        distancia_recorrida = 39.5;
                        break;
                    case 4:
                        distancia_recorrida = 68.9;
                        break;
                    case 5:
                        distancia_recorrida = 58.7;
                        break;
                    case 6:
                        distancia_recorrida = 24.1;
                        break;
                    case 7:
                        distancia_recorrida = 34.9;
                        break;
                    case 8:
                        distancia_recorrida = 88.1;
                        break;
                    case 9:
                        distancia_recorrida = 55.6;
                        break;
                    case 10:
                        distancia_recorrida = 65.7;
                        break;
                    case 11:
                        distancia_recorrida = 26.4;
                        break;
                    case 12:
                        distancia_recorrida = 77.4;
                        break;
                    case 13:
                        distancia_recorrida = 77.8;
                        break;
                    case 14:
                        distancia_recorrida = 15.3;
                        break;
                }

            } else if (municipio_origen == 2) {

                switch (municipio_parada) {
                    case 1:
                        distancia_recorrida = 39.8;
                        break;
                    case 2:
                        distancia_recorrida = 5.0;
                        break;
                    case 3:
                        distancia_recorrida = 56.9;
                        break;
                    case 4:
                        distancia_recorrida = 52.9;
                        break;
                    case 5:
                        distancia_recorrida = 76.1;
                        break;
                    case 6:
                        distancia_recorrida = 13.7;
                        break;
                    case 7:
                        distancia_recorrida = 18.9;
                        break;
                    case 8:
                        distancia_recorrida = 72.1;
                        break;
                    case 9:
                        distancia_recorrida = 73.0;
                        break;
                    case 10:
                        distancia_recorrida = 49.7;
                        break;
                    case 11:
                        distancia_recorrida = 68.8;
                        break;
                    case 12:
                        distancia_recorrida = 94.8;
                        break;
                    case 13:
                        distancia_recorrida = 61.9;
                        break;
                    case 14:
                        distancia_recorrida = 38.3;
                        break;
                }

            } else if (municipio_origen == 3) {

                switch (municipio_parada) {
                    case 1:
                        distancia_recorrida = 39.5;
                        break;
                    case 2:
                        distancia_recorrida = 56.9;
                        break;
                    case 3:
                        distancia_recorrida = 5.0;
                        break;
                    case 4:
                        distancia_recorrida = 74.6;
                        break;
                    case 5:
                        distancia_recorrida = 25.1;
                        break;
                    case 6:
                        distancia_recorrida = 71.9;
                        break;
                    case 7:
                        distancia_recorrida = 40.8;
                        break;
                    case 8:
                        distancia_recorrida = 93.8;
                        break;
                    case 9:
                        distancia_recorrida = 16.3;
                        break;
                    case 10:
                        distancia_recorrida = 71.4;
                        break;
                    case 11:
                        distancia_recorrida = 65.4;
                        break;
                    case 12:
                        distancia_recorrida = 52.4;
                        break;
                    case 13:
                        distancia_recorrida = 83.6;
                        break;
                    case 14:
                        distancia_recorrida = 71.4;
                        break;
                    default:
                        break;
                }

            } else if (municipio_origen == 4) {

                switch (municipio_parada) {
                    case 1:
                        distancia_recorrida = 67.5;
                        break;
                    case 2:
                        distancia_recorrida = 51.5;
                        break;
                    case 3:
                        distancia_recorrida = 73.1;
                        break;
                    case 4:
                        distancia_recorrida = 5.0;
                        break;
                    case 5:
                        distancia_recorrida = 92.3;
                        break;
                    case 6:
                        distancia_recorrida = 66.6;
                        break;
                    case 7:
                        distancia_recorrida = 32.5;
                        break;
                    case 8:
                        distancia_recorrida = 34.4;
                        break;
                    case 9:
                        distancia_recorrida = 89.3;
                        break;
                    case 10:
                        distancia_recorrida = 2.4;
                        break;
                    case 11:
                        distancia_recorrida = 92.5;
                        break;
                    case 12:
                        distancia_recorrida = 93.9;
                        break;
                    case 13:
                        distancia_recorrida = 12.4;
                        break;
                    case 14:
                        distancia_recorrida = 66.0;
                        break;
                }

            } else if (municipio_origen == 5) {

                switch (municipio_parada) {
                    case 1:
                        distancia_recorrida = 58.7;
                        break;
                    case 2:
                        distancia_recorrida = 76.1;
                        break;
                    case 3:
                        distancia_recorrida = 25.1;
                        break;
                    case 4:
                        distancia_recorrida = 93.8;
                        break;
                    case 5:
                        distancia_recorrida = 5.0;
                        break;
                    case 6:
                        distancia_recorrida = 91.1;
                        break;
                    case 7:
                        distancia_recorrida = 60.0;
                        break;
                    case 8:
                        distancia_recorrida = 98.5;
                        break;
                    case 9:
                        distancia_recorrida = 25.1;
                        break;
                    case 10:
                        distancia_recorrida = 90.6;
                        break;
                    case 11:
                        distancia_recorrida = 84.8;
                        break;
                    case 12:
                        distancia_recorrida = 22.9;
                        break;
                    case 13:
                        distancia_recorrida = 85.5;
                        break;
                    case 14:
                        distancia_recorrida = 73.4;
                        break;
                }

            } else if (municipio_origen == 6) {

                switch (municipio_parada) {
                    case 1:
                        distancia_recorrida = 24.1;
                        break;
                    case 2:
                        distancia_recorrida = 13.7;
                        break;
                    case 3:
                        distancia_recorrida = 71.9;
                        break;
                    case 4:
                        distancia_recorrida = 67.9;
                        break;
                    case 5:
                        distancia_recorrida = 91.1;
                        break;
                    case 6:
                        distancia_recorrida = 5.0;
                        break;
                    case 7:
                        distancia_recorrida = 33.9;
                        break;
                    case 8:
                        distancia_recorrida = 87.2;
                        break;
                    case 9:
                        distancia_recorrida = 88.1;
                        break;
                    case 10:
                        distancia_recorrida = 64.7;
                        break;
                    case 11:
                        distancia_recorrida = 49.1;
                        break;
                    case 12:
                        distancia_recorrida = 110.0;
                        break;
                    case 13:
                        distancia_recorrida = 76.9;
                        break;
                    case 14:
                        distancia_recorrida = 22.6;
                        break;
                }

            } else if (municipio_origen == 7) {

                switch (municipio_parada) {
                    case 1:
                        distancia_recorrida = 35.0;
                        break;
                    case 2:
                        distancia_recorrida = 19.0;
                        break;
                    case 3:
                        distancia_recorrida = 40.8;
                        break;
                    case 4:
                        distancia_recorrida = 34.0;
                        break;
                    case 5:
                        distancia_recorrida = 60.0;
                        break;
                    case 6:
                        distancia_recorrida = 34.0;
                        break;
                    case 7:
                        distancia_recorrida = 5.0;
                        break;
                    case 8:
                        distancia_recorrida = 53.3;
                        break;
                    case 9:
                        distancia_recorrida = 56.9;
                        break;
                    case 10:
                        distancia_recorrida = 30.8;
                        break;
                    case 11:
                        distancia_recorrida = 60.0;
                        break;
                    case 12:
                        distancia_recorrida = 78.7;
                        break;
                    case 13:
                        distancia_recorrida = 43.0;
                        break;
                    case 14:
                        distancia_recorrida = 33.5;
                        break;
                }

            } else if (municipio_origen == 8) {

                switch (municipio_parada) {
                    case 1:
                        distancia_recorrida = 88.0;
                        break;
                    case 2:
                        distancia_recorrida = 72.0;
                        break;
                    case 3:
                        distancia_recorrida = 93.6;
                        break;
                    case 4:
                        distancia_recorrida = 35.8;
                        break;
                    case 5:
                        distancia_recorrida = 98.4;
                        break;
                    case 6:
                        distancia_recorrida = 87.0;
                        break;
                    case 7:
                        distancia_recorrida = 53.0;
                        break;
                    case 8:
                        distancia_recorrida = 5.0;
                        break;
                    case 9:
                        distancia_recorrida = 110.0;
                        break;
                    case 10:
                        distancia_recorrida = 32.9;
                        break;
                    case 11:
                        distancia_recorrida = 113.0;
                        break;
                    case 12:
                        distancia_recorrida = 96.6;
                        break;
                    case 13:
                        distancia_recorrida = 44.7;
                        break;
                    case 14:
                        distancia_recorrida = 86.5;
                        break;
                }

            } else if (municipio_origen == 9) {

                switch (municipio_parada) {
                    case 1:
                        distancia_recorrida = 55.7;
                        break;
                    case 2:
                        distancia_recorrida = 73.1;
                        break;
                    case 3:
                        distancia_recorrida = 16.3;
                        break;
                    case 4:
                        distancia_recorrida = 90.8;
                        break;
                    case 5:
                        distancia_recorrida = 25.1;
                        break;
                    case 6:
                        distancia_recorrida = 88.1;
                        break;
                    case 7:
                        distancia_recorrida = 57.0;
                        break;
                    case 8:
                        distancia_recorrida = 110.0;
                        break;
                    case 9:
                        distancia_recorrida = 5.0;
                        break;
                    case 10:
                        distancia_recorrida = 87.6;
                        break;
                    case 11:
                        distancia_recorrida = 81.7;
                        break;
                    case 12:
                        distancia_recorrida = 53.6;
                        break;
                    case 13:
                        distancia_recorrida = 99.8;
                        break;
                    case 14:
                        distancia_recorrida = 70.4;
                        break;
                }

            } else if (municipio_origen == 10) {

                switch (municipio_parada) {
                    case 1:
                        distancia_recorrida = 65.7;
                        break;
                    case 2:
                        distancia_recorrida = 49.8;
                        break;
                    case 3:
                        distancia_recorrida = 71.3;
                        break;
                    case 4:
                        distancia_recorrida = 2.4;
                        break;
                    case 5:
                        distancia_recorrida = 90.5;
                        break;
                    case 6:
                        distancia_recorrida = 64.8;
                        break;
                    case 7:
                        distancia_recorrida = 30.7;
                        break;
                    case 8:
                        distancia_recorrida = 33.0;
                        break;
                    case 9:
                        distancia_recorrida = 87.5;
                        break;
                    case 10:
                        distancia_recorrida = 5.0;
                        break;
                    case 11:
                        distancia_recorrida = 90.7;
                        break;
                    case 12:
                        distancia_recorrida = 95.8;
                        break;
                    case 13:
                        distancia_recorrida = 14.3;
                        break;
                    case 14:
                        distancia_recorrida = 64.2;
                        break;
                }

            } else if (municipio_origen == 11) {

                switch (municipio_parada) {
                    case 1:
                        distancia_recorrida = 26.2;
                        break;
                    case 2:
                        distancia_recorrida = 64.6;
                        break;
                    case 3:
                        distancia_recorrida = 65.5;
                        break;
                    case 4:
                        distancia_recorrida = 93.7;
                        break;
                    case 5:
                        distancia_recorrida = 84.5;
                        break;
                    case 6:
                        distancia_recorrida = 48.9;
                        break;
                    case 7:
                        distancia_recorrida = 59.7;
                        break;
                    case 8:
                        distancia_recorrida = 113.0;
                        break;
                    case 9:
                        distancia_recorrida = 81.5;
                        break;
                    case 10:
                        distancia_recorrida = 90.5;
                        break;
                    case 11:
                        distancia_recorrida = 5.0;
                        break;
                    case 12:
                        distancia_recorrida = 103.0;
                        break;
                    case 13:
                        distancia_recorrida = 103.0;
                        break;
                    case 14:
                        distancia_recorrida = 34.3;
                        break;
                }

            } else if (municipio_origen == 12) {

                switch (municipio_parada) {
                    case 1:
                        distancia_recorrida = 77.4;
                        break;
                    case 2:
                        distancia_recorrida = 94.7;
                        break;
                    case 3:
                        distancia_recorrida = 52.4;
                        break;
                    case 4:
                        distancia_recorrida = 91.9;
                        break;
                    case 5:
                        distancia_recorrida = 22.8;
                        break;
                    case 6:
                        distancia_recorrida = 110.0;
                        break;
                    case 7:
                        distancia_recorrida = 78.7;
                        break;
                    case 8:
                        distancia_recorrida = 96.2;
                        break;
                    case 9:
                        distancia_recorrida = 57.9;
                        break;
                    case 10:
                        distancia_recorrida = 93.8;
                        break;
                    case 11:
                        distancia_recorrida = 103.0;
                        break;
                    case 12:
                        distancia_recorrida = 5.0;
                        break;
                    case 13:
                        distancia_recorrida = 83.2;
                        break;
                    case 14:
                        distancia_recorrida = 109.0;
                        break;
                }

            } else if (municipio_origen == 13) {

                switch (municipio_parada) {
                    case 1:
                        distancia_recorrida = 76.7;
                        break;
                    case 2:
                        distancia_recorrida = 60.8;
                        break;
                    case 3:
                        distancia_recorrida = 82.6;
                        break;
                    case 4:
                        distancia_recorrida = 10.3;
                        break;
                    case 5:
                        distancia_recorrida = 85.4;
                        break;
                    case 6:
                        distancia_recorrida = 75.8;
                        break;
                    case 7:
                        distancia_recorrida = 41.7;
                        break;
                    case 8:
                        distancia_recorrida = 43.6;
                        break;
                    case 9:
                        distancia_recorrida = 98.5;
                        break;
                    case 10:
                        distancia_recorrida = 12.3;
                        break;
                    case 11:
                        distancia_recorrida = 102.0;
                        break;
                    case 12:
                        distancia_recorrida = 83.5;
                        break;
                    case 13:
                        distancia_recorrida = 5.0;
                        break;
                    case 14:
                        distancia_recorrida = 75.2;
                        break;
                }

            } else if (municipio_origen == 14) {

                switch (municipio_parada) {
                    case 1:
                        distancia_recorrida = 15.3;
                        break;
                    case 2:
                        distancia_recorrida = 38.3;
                        break;
                    case 3:
                        distancia_recorrida = 71.4;
                        break;
                    case 4:
                        distancia_recorrida = 67.4;
                        break;
                    case 5:
                        distancia_recorrida = 73.5;
                        break;
                    case 6:
                        distancia_recorrida = 22.6;
                        break;
                    case 7:
                        distancia_recorrida = 33.4;
                        break;
                    case 8:
                        distancia_recorrida = 86.6;
                        break;
                    case 9:
                        distancia_recorrida = 70.5;
                        break;
                    case 10:
                        distancia_recorrida = 64.2;
                        break;
                    case 11:
                        distancia_recorrida = 34.5;
                        break;
                    case 12:
                        distancia_recorrida = 109.0;
                        break;
                    case 13:
                        distancia_recorrida = 76.4;
                        break;
                    case 14:
                        distancia_recorrida = 5.0;
                        break;
                }

            } else {

                System.out.println("Ingrese una opcion valida."); 

            }

            distancia_total = distancia_total + distancia_recorrida;
            municipio_origen = municipio_parada;
        }

        System.out.println();
        total_gasolina = gasolina_kilometro * distancia_total;
        System.out.println("El camion consumirá " + formato_moneda.format(total_gasolina * precio_gasolina) + " pesos en gasolina.");


    }
}
