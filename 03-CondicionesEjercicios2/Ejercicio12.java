import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        int precio = entrada.nextInt();

        System.out.print("Ingrese el descuento (de 0 a 100): ");
        int descuento = entrada.nextInt();

        if (descuento >= 0 && descuento <= 100) {

            int descuento_agrado = (precio * descuento) / 100;
            System.out.print("El precio final es de: " + (precio - descuento_agrado));

        }

    }
}