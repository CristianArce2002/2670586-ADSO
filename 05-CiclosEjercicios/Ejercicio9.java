// Calcular raiz digital; 

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero natural: ");
        int numero_ingresado = entrada.nextInt();
        entrada.close();
        
        if (numero_ingresado >= 0) {
            
            int n = numero_ingresado;
            System.out.println("Raiz digital: ");

            for (int x = 1; n > 9; x++) {

                int divisor = 1;
                String texto = String.valueOf(n);
                int cantidad_digitos = texto.length();
                int suma = 0;

                for (int i = 1; i < cantidad_digitos; i++) {
                    divisor = divisor * 10;
                }

                for (int i = 1; i <= cantidad_digitos; i++) {

                    int digito = n / divisor;
                    
                    if (i > 1) {
                        System.out.print(" + ");
                    }

                    System.out.print(digito);
                    suma = suma + digito;
                    n = n % divisor;
                    divisor = divisor / 10;

                }

                System.out.println(" = " + suma);
                n = suma;

            }

            System.out.println("La Raiz Digital de " + numero_ingresado + " es: " + n);

        } else {
            System.out.println("Ingrese un numero valido."); 
        }


    }
}
