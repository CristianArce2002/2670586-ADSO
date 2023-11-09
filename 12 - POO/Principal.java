public class Principal {

    public static void main(String[] args) {

        Perro[] listado = new Perro[10];

        listado[0] = new Perro("Erick", "Dalmata", "diosito", 12, 35, 100);
        listado[1] = new Perro("Miguel", "Rottweiler", "diosito", 5, 35, 100);
        listado[2] = new Perro("Jimenez", "Caniche", "diosito", 7, 35, 100);
        listado[3] = new Perro("Bustamante", "Sabueso", "diosito", 5, 35, 100);
        listado[4] = new Perro("Juanito", "Gran danez", "diosito", 90, 35, 100);

        double peso = 0;
        String nombre = "";
        
        for (int i = 0; i < listado.length; i++){
            
            if (listado[i] != null){

                if (listado[i].getPeso() > peso){

                    peso = listado[i].getPeso();
                    nombre = listado[i].getNombre();

                }

               listado[i].imprimir_detalles();

            }

        }

        System.out.println("El perro más pesado es " + nombre + ", que pesa " + peso);

    }
    
}
