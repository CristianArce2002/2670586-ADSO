import java.util.Scanner;

public class Ejercicio6{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero de 6 digitos: ");

        int numero = entrada.nextInt();

        System.out.println("");

        int digito1 = numero / 100000; 

        int digito2 = (numero % 100000) / 10000; 

        int digito3 = (numero % 10000) / 1000;

        int digito4 = (numero % 1000) / 100;

        int digito5 = (numero % 100) / 10;

        int digito6 = (numero % 10) / 1;

        if (numero > 999999 || numero < 100000){

            System.out.println("El numero que ingreso no es de 6 digitos, intente de nuevo.");

        }else{

            System.out.println("//--------------------------------------------------------------//");
            
            System.out.println("");

            System.out.println("  Menu:");
            
            System.out.println("");

            System.out.println("  1. Primer Digito.    / 2. Segundo Digito.   / 3. Tercer Digito");

            System.out.println("  4. Cuarto  Digito.   / 5. Quinto Digito.    / 6. Sexto Digito");

            System.out.println("");

            System.out.println("//-------------------------------------------------------------//");

            System.out.println("");
            
            System.out.print("Digite una de las opciones para mostrar en pantalla: ");

            int opcion = entrada.nextInt();

            System.out.println("");

            if (opcion == 1){

                System.out.println("El primer digito es: " + digito1);

            }else{

                 if (opcion == 2){

                    System.out.println("El segundo digito es: " + digito2);

                }else{

                    if (opcion == 3){

                        System.out.println("El tercer digito es: " + digito3);

                    }else{

                        if (opcion == 4){

                            System.out.println("El cuarto digito es: " + digito4);

                        }else{

                           if (opcion == 5){

                                System.out.println("El quinto digito es: " + digito5);

                             }else{

                                if (opcion == 6){

                                    System.out.println("El sexto digito es: " + digito6);

                                }else{

                                    System.out.println("Elija una opcion valida");

                                }
                            
                             }

                        }
                    
                    }
                
                }

            }

        }

    }

}
