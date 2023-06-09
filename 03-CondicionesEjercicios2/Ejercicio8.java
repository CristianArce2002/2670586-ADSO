import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);

        System.out.print("Ingrese el valor de la base: ");
        double base = entrada.nextDouble();

        System.out.print("Ingrese el valor del alto: ");
        double alto = entrada.nextDouble();

        double area = (base * alto) / 2;

        if (base > 0 && alto > 0){
            System.out.print("El area del triangulo es: " + area);

        }else{
            System.out.print("El area del triangulo no puede ser negativa, intente otra vez");

        }

    }
}