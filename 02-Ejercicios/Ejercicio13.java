import java.util.Scanner;

public class Ejercicio13{
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int segundos = 0;

        int minutos = 0;

        int horas = 0;

        System.out.println("DIgite el numero de segundos:");

        segundos = entrada.nextInt();

        minutos = segundos / 60;

        horas = minutos / 60;

        System.out.println("Esta cantidad corresponde a:");

        System.out.println("Horas: " + horas + " / Minutos: "  + minutos % 60 + " / Segundos: " + segundos % 60);

    }

}