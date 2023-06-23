import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = entrada.nextInt();
        int Factorial = 1; 

        System.out.println("Factorial: ");

        for (int i = 1; i <= numero; i++) {
            if (numero == i) {
                System.out.print(i + " ");
            } else {
                System.out.print(i + " x ");
            }
            Factorial = Factorial * i; 
        }

        System.out.print( " = " + Factorial); 

    }

}
