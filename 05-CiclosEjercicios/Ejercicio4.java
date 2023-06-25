// Verificar numero palindromo; 

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero (Maximo 6 digitos): ");
        int numero_ingresado = entrada.nextInt();
        entrada.close();

        if (numero_ingresado <= 999999 || numero_ingresado >= -999999) {

            int dividendo = numero_ingresado;
            int numero_invertido = 0;

            for (int i = 1; dividendo > 0; i++) {

                int digito = dividendo % 10;
                numero_invertido = (numero_invertido * 10) + digito;
                dividendo = dividendo / 10;

            }

            String respuesta = (numero_ingresado == numero_invertido) ? "SI" : "NO";
            System.out.println("Respuesta: El numero ingresado " + respuesta + " es palindromo.");

        } else {
            System.out.println("Ingrese un numero valido."); 
        }


    }
}