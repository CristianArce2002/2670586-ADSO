import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: "); 
        int numero = entrada.nextInt(); 
        int contador = 1; 

        
        for (int f = 1; f <= numero; f++){
            for (int c = 1; c <= numero; c++){
                if(f == 2 && contador == 0){
                    System.out.print(numero); 
                }else{
                    System.out.print(contador); 
                }
                contador = contador + 1; 
                if (contador > numero){
                    contador = 1; 
                }
            }
            contador = contador - 1; 
            System.out.println(); 
        }


    }
}