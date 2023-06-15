import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Boolean menu = true;

        while (menu == true) {

            System.out.println("|------------- Bienvenido ------------|");
            System.out.println("| 1. Docente                          |");
            System.out.println("| 2. Estudiante                       |");
            System.out.println("| 3. Salir                            |");
            System.out.println("|-------------------------------------|");
            System.out.println("");
            System.out.print("Ingrese una opcion: ");
            int opcion = entrada.nextInt();

            if (opcion == 1) {

                System.out.print("Ingrese la cantidad de notas: ");
                float cantidad_notas = entrada.nextFloat();

                float suma_notas = 0;

                for (int i = 1; i <= cantidad_notas; i++) {
                    System.out.print("ingrese el valor de la nota " + i + " : ");
                    float valor_nota = entrada.nextFloat();
                    suma_notas = suma_notas + valor_nota;
                }

                System.out.println("El promedio de notas es: " + (suma_notas / cantidad_notas));

            } else if (opcion == 2) {

                System.out.print("Ingrese la cantidad de materias: ");
                Double cantidad_materias = entrada.nextDouble();

                Double total_creditos = 0.0;
                Double suma_nota_por_credito = 0.0;
                Double promedio_semestre = 0.0;

                for (int i = 1; i <= cantidad_materias; i++) {

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

            } else if (opcion == 3) {

                menu = false; 
                
            } else{
                System.out.println("Ingrese una opcion valida.");
            }

        }

    }
}