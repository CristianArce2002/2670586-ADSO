import java.util.Scanner;

public class Ejercicio1 {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Inngrese un numero: ");
    int numero = entrada.nextInt();

    if (numero == 0) {
      System.out.println("Ingrese un numero diferente a cero");
    } else {
      if (numero > 0) {
        System.out.println("Este numero es positivo");
      } else {
        System.out.println("Este numero es negativo");
      }
    }

  }
}
