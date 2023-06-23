import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = entrada.nextInt();
        int aleatorio = 0;
        int contador = 1;

        for (int i = 0; contador <= numero; i++) {

            aleatorio = (int) Math.floor(Math.random() * 99 + 1);

            int divisores = 0;

            for (int k = 1; k <= aleatorio; k++) {
                if (aleatorio % k == 0) {
                    divisores = divisores + 1;
                }
            }

            if (divisores == 2) {
                System.out.println("Primo " + contador + " generado: " + aleatorio); 
                contador = contador + 1; 
            } 

        }

    }

}
