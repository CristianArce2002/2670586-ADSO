import java.util.Scanner;

public class Ejercicio3{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero para la pocision X: ");

        int x = entrada.nextInt();

        System.out.print("Ingrese un numero entero para la pocision Y: ");

        int y = entrada.nextInt();

        if (x>0 & y>0){

              System.out.print("Usted esta en el primer cuadrante.");

        }else{

            if (x<0 & y>0){

                System.out.print("Usted esta en el segundo cuadrante.");

            }else{

                if (x<0 & y<0){

                    System.out.print("Usted esta en el tercer cuadrante.");

                }else{

                    if (x>0 & y<0){

                        System.out.print("Usted esta en el cuarto cuadrante.");

                    }else{

                        if (x==0 & y==0){

                            System.out.print("Usted esta en el centro de los 4 cuadrantes");

                        }else{

                            if (x!=0 & y==0  || x==0 & y!=0){

                                System.out.print("Usted esta en medio de dos cuadrantes.");

                            }

                        }

                    }

                }

            }

        }

    }

}
