// Arreglo numeros impares;

import java.util.Scanner; 

public class Ejercicio1 {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.print("  Ingrese longitud arreglo: "); 
        int arreglo [] = new int [sc.nextInt()];
        sc.close();

        int contador = 0; 

        for (int i = 0; i < arreglo.length; i++){

            if (contador % 2 != 0){
                arreglo[i] = contador; 
            }else{
                i--;
            }
            contador++; 
            
        }

        for (int i = 0; i < arreglo.length; i++){
            System.out.println("  Contenido posicion " + i + ": " + arreglo[i]);
        }

    }
    
}
