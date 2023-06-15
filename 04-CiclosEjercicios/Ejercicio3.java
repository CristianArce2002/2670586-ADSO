import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("ingrese una alura. ");

        int altura = entrada.nextInt();

        int espacio = altura;

        int x = 1;

        if (altura > 0) {

            for (int fila = 1; fila <= altura; fila++) {

                for (int i = 1; i <= espacio; i++) {
                    System.out.print(" ");
                }

                espacio = espacio - 1;

                for (int n = 1; n <= x; n++) {

                    System.out.print("x");

                }

                x = x + 2;

                System.out.println();
                
            }
            
        }else{
            System.out.println("Ingrese una altura valida.");         
        }

    }
}