import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero (maximo 6 digitos): ");
        int numero = entrada.nextInt();

        if (numero <= 999999 && numero >= 0) {

            int digito = 0;
            int contador = 1;
            int cantidad = numero;
            int l = 0;

            for (l = 1; cantidad > 10; l++) {
                cantidad = cantidad / 10;
                contador = contador * 10;
            }

            for (int i = 1; i <= l; i++) {
                digito = (numero / contador) % 10;
                System.out.println(digito);
                contador = contador / 10;
            }
            
        }else if(numero < 0){
            System.out.println("Ingrese un numero que sea positivo.");
            
        }else {
            System.out.println("El numero ingresado supera los 6 digitos.");
        }

    }

}