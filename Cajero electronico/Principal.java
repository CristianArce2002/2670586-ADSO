import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Banco daviplata = new Banco(100000000, 500000, 40, 110, 70, 40, new String[100], "Davivienda", "Cristian", "hola");

        Banco roboplata = new Banco(1000000000, "HOLA MUNDO", "Pancracio", "contraseña");

        daviplata.imprimirDatos();
        roboplata.imprimirDatos();
        
        roboplata.abastecer_banco(10, 10, 10, 10);
        roboplata.abastecer_banco(1000, 1000, 1000, 100000);
        roboplata.imprimirDatos();
        
        // sobrecarga de metodos

    }
}