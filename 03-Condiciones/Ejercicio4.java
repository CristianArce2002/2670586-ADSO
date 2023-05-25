import java.util.Scanner;

public class Ejercicio4{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");

        int numero1 = entrada.nextInt();

        System.out.print("Ingrese el segundo numero: ");

        int numero2 = entrada.nextInt();

        System.out.print("Ingrese el tercer numero: ");

        int numero3 = entrada.nextInt();

        if ( numero1 > numero2 && numero1 > numero3){

            System.out.println("El numero mayor es: " + numero1);

        }else{

            if (numero2 > numero1 && numero2 > numero3){

                System.out.println("El numero mayor es: " + numero2);

            }else{

                if (numero3 > numero1 && numero3 > numero2){

                    System.out.println("El numero mayor es: " + numero3);

                }

            }

        }

        if ( numero1 < numero2 && numero1 < numero3){

            System.out.println("El numero menor es: " + numero1);

        }else{

            if (numero2 < numero1 && numero2 < numero3){

                System.out.println("El numero menor es: " + numero2);

            }else{

                if (numero3 < numero1 && numero3 < numero2){

                    System.out.println("El numero menor es: " + numero3);

                }

            }

        }

    }

}
