import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la primera nota: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        double nota2 = entrada.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        double nota3 = entrada.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("Su promedio es de " + promedio);

        if (promedio >= 7) {
            System.out.println("Usted ha aprobado.");
        } else {
            System.out.println("Usted NO ha aprobado.");
        }
    }
}
