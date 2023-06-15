import java.util.Scanner; 

public class Ejercicio1 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de notas: ");
        float cantidad_notas = entrada.nextFloat();

        float suma_notas = 0;
        
        for ( int i = 1; i <= cantidad_notas; i++ ){
            System.out.print("ingrese el valor de la nota " + i + " : ");
            float valor_nota = entrada.nextFloat();
            suma_notas = suma_notas + valor_nota;
        }

        System.out.println("El promedio de notas es: " + (suma_notas / cantidad_notas));

    }
}                       