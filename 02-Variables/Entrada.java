import java.util.Scanner;

public class Entrada{

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);


        byte turno;
        short loteria_risaralda;
        int saldo_bancario;
        long cedula;
        float nota;
        double pi;
        boolean bandera;


        System.out.println("Ingrese el numero de turno");
        turno = teclado.nextByte();

        System.out.println("Ingrese el numero de loteria");
        loteria_risaralda = teclado.nextShort();
        
        System.out.println("Ingrese saldo bancario");
        saldo_bancario = teclado.nextInt();

        System.out.println("Ingrese numero de cedula");
        cedula = teclado.nextLong();

        System.out.println("Ingrese la nota");
        nota = teclado.nextFloat();

        System.out.println("Ingrese el numero PI");
        pi = teclado.nextDouble();

        System.out.println("Ingrese true o false");
        bandera = teclado.nextBoolean();

        System.out.println("");

        System.out.println("Estos son sus datos:");
        System.out.println("");
        System.out.println("numero de turno: "+turno);
        System.out.println("Numero de loteria: "+loteria_risaralda);
        System.out.println("Saldo bancario: "+saldo_bancario);
        System.out.println("Cedula: "+cedula);
        System.out.println("Nota: "+nota);
        System.out.println("Numero PI"+pi);
        System.out.println("Verdadero o falso: "+bandera);


    }

}