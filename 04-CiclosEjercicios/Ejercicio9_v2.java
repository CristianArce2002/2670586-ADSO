import java.util.Scanner; 

public class Ejercicio9_v2 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero: "); 
        int numero = entrada.nextInt(); 

        int divisores = 0; 

        for( int i = 1; i <= numero; i++){
            if (numero % i == 0){
                divisores = divisores + 1; 
            }
        }

        if (divisores == 2){
            System.out.println("El numero ingresado es primo"); 
        } else {
            System.out.println("El numero ingresado No es primo"); 
        }
        
    }
}                       