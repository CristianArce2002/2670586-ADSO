import java.util.Scanner;

public class Ejercicio10_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese su fecha de nacimiento:");
        System.out.print("Día: ");
        int dia_nacimiento = entrada.nextInt();
        System.out.print("Mes: ");
        int mes_nacimiento = entrada.nextInt();
        System.out.print("anno: ");
        int anno_nacimiento = entrada.nextInt();

        System.out.println("ingrese la fecha actual:");
        System.out.print("Día: ");
        int dia_actual = entrada.nextInt();
        System.out.print("Mes: ");
        int mes_actual = entrada.nextInt();
        System.out.print("anno: ");
        int anno_actual = entrada.nextInt();

        if (anno_actual - anno_nacimiento == 18) {

            if (mes_actual == mes_nacimiento) {

                if (dia_actual < dia_nacimiento) {
                    System.out.println("Usted es menor de edad.");
                } else {
                    System.out.println("Usted es mayor de edad.");
                }

            } else if (dia_actual > dia_nacimiento) {
                System.out.println("Usted es mayor de edad.");
            } else if (dia_actual < dia_nacimiento) {
                System.out.println("Usted es menor de edad.");
            }

        } else if (anno_actual - anno_nacimiento > 18) {
            System.out.println("Usted es mayor de edad.");
        } else if (anno_actual - anno_nacimiento < 18) {
            System.out.println("Usted es menor de edad.");
        }

    }
}
