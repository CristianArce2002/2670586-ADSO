import java.util.Scanner;

public class Ejercicio05{
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int base = 0;

        int altura = 0;

        int area = 0;

        System.out.println("Ingrese la base del triandulo:");

        base = entrada.nextInt();

        System.out.println("Ingrese la altura del triangulo:");

        altura = entrada.nextInt();

        area = (base * altura) / 2;

        System.out.println("El area del triangulo es: " + area);

    }

}