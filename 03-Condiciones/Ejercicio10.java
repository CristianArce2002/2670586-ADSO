import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese nota de Matematicas: ");
        double matematicas = entrada.nextDouble();
        System.out.print("Ingrese nota de Español: ");
        double español = entrada.nextDouble();
        System.out.print("Ingrese nota de Ingles: ");
        double ingles = entrada.nextDouble();
        System.out.print("Ingrese nota de Ciencias Naturales: ");
        double naturales = entrada.nextDouble();
        System.out.print("Ingrese nota de Quimica: ");
        double quimmica = entrada.nextDouble();

        int vericador = 0;
        int contador = 0;

        Double valor1 = matematicas;
        double valor2 = español;
        double valor3 = ingles;
        double valor4 = naturales;
        double valor5 = quimmica;
        double auxiliar;
        double promedio = (valor1 + valor2 + valor3 + valor4 + valor5) / 5;
        Double NotaAprobar = 15 - (promedio * 5);

        if (valor1 < valor2) {
            auxiliar = valor1;
            valor1 = valor2;
            valor2 = auxiliar;
        }
        if (valor2 < valor3) {
            auxiliar = valor2;
            valor2 = valor3;
            valor3 = auxiliar;
        }
        if (valor3 < valor4) {
            auxiliar = valor3;
            valor3 = valor4;
            valor4 = auxiliar;
        }
        if (valor4 < valor5) {
            auxiliar = valor4;
            valor4 = valor5;
            valor5 = auxiliar;
        }
        if (valor1 < valor2) {
            auxiliar = valor1;
            valor1 = valor2;
            valor2 = auxiliar;
        }
        if (valor2 < valor3) {
            auxiliar = valor2;
            valor2 = valor3;
            valor3 = auxiliar;
        }
        if (valor3 < valor4) {
            auxiliar = valor3;
            valor3 = valor4;
            valor4 = auxiliar;
        }
        if (valor4 < valor5) {
            auxiliar = valor4;
            valor4 = valor5;
            valor5 = auxiliar;
        }
        if (valor1 < valor2) {
            auxiliar = valor1;
            valor1 = valor2;
            valor2 = auxiliar;
        }
        if (valor2 < valor3) {
            auxiliar = valor2;
            valor2 = valor3;
            valor3 = auxiliar;
        }
        if (valor3 < valor4) {
            auxiliar = valor3;
            valor3 = valor4;
            valor4 = auxiliar;
        }
        if (valor4 < valor5) {
            auxiliar = valor4;
            valor4 = valor5;
            valor5 = auxiliar;
        }
        if (valor1 < valor2) {
            auxiliar = valor1;
            valor1 = valor2;
            valor2 = auxiliar;
        }
        if (valor2 < valor3) {
            auxiliar = valor2;
            valor2 = valor3;
            valor3 = auxiliar;
        }
        if (valor3 < valor4) {
            auxiliar = valor3;
            valor3 = valor4;
            valor4 = auxiliar;
        }
        if (valor4 < valor5) {
            auxiliar = valor4;
            valor4 = valor5;
            valor5 = auxiliar;
        }
        if (valor1 < valor2) {
            auxiliar = valor1;
            valor1 = valor2;
            valor2 = auxiliar;
        }
        if (valor2 < valor3) {
            auxiliar = valor2;
            valor2 = valor3;
            valor3 = auxiliar;
        }
        if (valor3 < valor4) {
            auxiliar = valor3;
            valor3 = valor4;
            valor4 = auxiliar;
        }
        if (valor4 < valor5) {
            auxiliar = valor4;
            valor4 = valor5;
            valor5 = auxiliar;
        }

        System.out.println();
        System.out.println();
        System.out.println("Informe: ");
        System.out.print("Asignatura con mejor nota: ");

        if (valor1 == matematicas) {

            System.out.print("Matematicas");

            vericador = vericador + 1;

        }

        if (valor1 == español) {

            if (vericador > 0) {

                System.out.print(", ");

            }

            System.out.print("Español");

            vericador = vericador + 1;

        }

        if (valor1 == ingles) {

            if (vericador > 0) {

                System.out.print(", ");

            }

            System.out.print("Ingles");

            vericador = vericador + 1;

        }

        if (valor1 == naturales) {

            if (vericador > 0) {

                System.out.print(", ");

            }

            System.out.print("Ciencias Naturales");

            vericador = vericador + 1;

        }

        if (valor1 == quimmica) {

            if (vericador > 0) {

                System.out.print(", ");

            }

            System.out.print("Quimica");
        }

        System.out.println(".");

        vericador = 0;

        System.out.print("Asignatura con menor nota: ");

        if (valor5 == matematicas) {

            System.out.print("Matematicas");

            vericador = vericador + 1;

            contador = contador + 1;

        }

        if (valor5 == español) {

            if (vericador > 0) {

                System.out.print(", ");

            }

            System.out.print("Español");

            vericador = vericador + 1;

            contador = contador + 1;

        }

        if (valor5 == ingles) {

            if (vericador > 0) {

                System.out.print(", ");

            }

            System.out.print("Ingles");

            vericador = vericador + 1;

            contador = contador + 1;

        }

        if (valor5 == naturales) {

            if (vericador > 0) {

                System.out.print(", ");

            }

            System.out.print("Ciencias Naturales");

            vericador = vericador + 1;

            contador = contador + 1;

        }

        if (valor5 == quimmica) {

            if (vericador > 0) {

                System.out.print(", ");

            }

            System.out.print("Quimica");

            contador = contador + 1;

        }

        System.out.println(".");

        vericador = 0;

        System.out.println("Promedio de notas: " + promedio);

        double notaEsperada = (NotaAprobar / contador) + valor5;

        if  (promedio < 3.0){

            System.out.print("Debio obtner una nota de ");

            if (valor5 == matematicas) {

                System.out.print(notaEsperada + " en ");
    
                System.out.print("Matematicas");
    
                vericador = vericador + 1;
    
            }
    
            if (valor5 == español) {
    
                if (vericador > 0) {
    
                    System.out.print(", ");
    
                }

                System.out.print(notaEsperada + " en ");
    
                System.out.print("Español");
    
                vericador = vericador + 1;
    
            }
    
            if (valor5 == ingles) {
    
                if (vericador > 0) {
    
                    System.out.print(", ");
    
                }

                System.out.print(notaEsperada + " en ");
    
                System.out.print("Ingles");
    
                vericador = vericador + 1;
    
            }
    
            if (valor5 == naturales) {
    
                if (vericador > 0) {
    
                    System.out.print(", ");
    
                }

                System.out.print(notaEsperada + " en ");
    
                System.out.print("Ciencias Naturales");
    
                vericador = vericador + 1;
    
            }
    
            if (valor5 == quimmica) {
    
                if (vericador > 0) {
    
                    System.out.print(", ");
    
                }

                System.out.print(notaEsperada + " en ");
    
                System.out.print("Quimica");
            }

            System.out.print(".");
        
        }

    }

}
