import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el salario por hora: ");
        double salario = entrada.nextDouble();

        System.out.print("Ingrese las horas trabajadas: ");
        double horas = entrada.nextDouble();

        if (horas > 40){
            
            Double salarioExtra = (horas - 40) * (salario / 2);
            Double SalarioFinal = (horas * salario) + salarioExtra;
            System.out.println("El salario con horas extra es de: $ " + SalarioFinal);

        }else if(horas <= 40){
            System.out.println("El salario es de: $ " + (salario * horas));
        }
    }
}