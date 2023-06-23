import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("ingrese un numero Impar. ");
        int altura = entrada.nextInt();

        if (altura % 2 != 0) {

            altura = altura / 2;
            int espacio = altura;
            int x = 1;

            for (int fila = 1; fila <= altura + 1; fila++) {
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
            
            espacio = 1;
            x = altura + (altura - 1);

            for (int fila = 1; fila <= altura; fila++) {
                for (int h = 1; h <= espacio; h++) {
                    System.out.print(" ");
                }
                espacio = espacio + 1;
                for (int l = 1; l <= x; l++) {
                    System.out.print("x");
                }
                x = x - 2;
                System.out.println();
            }
        }else if( altura < 1){
            System.out.println("No ingrese numeros negativos, intente otra vez."); 
        }else{
            System.out.println("Ingrese un numeor valido."); 
        }
    }
}
