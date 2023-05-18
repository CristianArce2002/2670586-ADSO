import java.util.Scanner;

public class Ejercicio11{
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        double radio = 0;

        double area = 0;

        double perimetro = 0;

        System.out.println("Digite el radio del circulo:");

        radio = entrada.nextDouble();

        System.out.println("");

        perimetro = 2 * Math.PI * radio;

        System.out.println("El perimetro del circulo es de: " + perimetro);

        System.out.println("");

        area = Math.PI * (radio * radio);

        System.out.println("El area del circulo es de: " + area);

    }

}