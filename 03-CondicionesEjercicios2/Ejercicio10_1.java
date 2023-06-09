import java.util.Scanner;

public class Ejercicio10_1{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese su fecha de nacimiento:");
        System.out.print("Dia: ");
        int dia_nacimiento = entrada.nextInt();
        System.out.print("Mes: ");
        int mes_nacimiento = entrada.nextInt();
        System.out.print("anno: ");
        int anno_nacimiento = entrada.nextInt();

        int anno_nacimiento_dias = anno_nacimiento * 365;
        int mes_nacimiento_dias = mes_nacimiento * 30;

        System.out.println("ingrese la fecha actual:");
        System.out.print("Dia: ");
        int dia_actual = entrada.nextInt();
        System.out.print("Mes: ");
        int mes_actual = entrada.nextInt();
        System.out.print("anno: ");
        int anno_actual = entrada.nextInt();

        int anno_actual_dias = anno_actual * 365;
        int mes_actual_dias = mes_actual * 30;

        int edad_dias = anno_nacimiento_dias + mes_nacimiento_dias + dia_nacimiento;
        int fecha_actual_dias = anno_actual_dias + mes_actual_dias + dia_actual;

        if (fecha_actual_dias - edad_dias >= 6570) {
            System.out.print("Usted es mayor de edad.");
        } else {
            System.out.print("Usted es menor de edad.");
        }
    }
}