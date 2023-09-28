import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("  Ingrese un numero entero --> ");
        int numero = leer.nextInt();
        leer.close();

        boolean es_primo = verificar_primo(numero);

        if (es_primo) {
            System.out.println("  El " + numero + " es un numero primo.");
        } else {
            System.out.println("  El " + numero + " no es un numero primo.");
        }
    }

    public static boolean verificar_primo(int numero) {

        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}