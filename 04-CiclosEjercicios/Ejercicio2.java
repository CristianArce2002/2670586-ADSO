import java.util.Scanner; 

public class Ejercicio2 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de materias: ");
        Double cantidad_materias = entrada.nextDouble();

        Double total_creditos = 0.0;
        Double suma_nota_por_credito = 0.0;
        Double promedio_semestre = 0.0; 
        
        for ( int i = 1; i <= cantidad_materias; i++ ){

            System.out.print("Ingrese la nota de la materia " + i + " : ");
            Double valor_nota = entrada.nextDouble();

            System.out.print("Ingrese el credito de la materia " + i + " : ");
            Double valor_credito = entrada.nextDouble();

            suma_nota_por_credito = suma_nota_por_credito + (valor_nota * valor_credito);
            total_creditos = total_creditos + valor_credito;
           
        }

        promedio_semestre = suma_nota_por_credito / total_creditos;

        System.out.println("El total de creditos es: " + total_creditos);
        System.out.println("El promedio del semestre es: " + promedio_semestre);

    }
}