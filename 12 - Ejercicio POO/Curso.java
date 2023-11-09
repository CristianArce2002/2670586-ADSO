public class Curso{

    String codigo;
    String nombre;
    String area;
    int duracion;
    int cantidad_temas;
    String[] temas;


    public Curso(String codigo, String nombre, String area, int duracion, int cantidad_temas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.area = area;
        this.duracion = duracion;
        this.cantidad_temas = cantidad_temas;
        this.temas = new String[cantidad_temas];
    }

    public void imprimir_detalles(){

        System.out.println(" ------------ Detalles ------------");
        System.out.println();
        System.out.println("   Codigo: " + codigo);
        System.out.println("   Nombre: " + nombre);
        System.out.println("   Area: " + area);
        System.out.println("   Duracion: " + duracion);
        System.out.println("   Cantidad_temas: " + cantidad_temas);
        System.out.println("   Temas: " + temas);
        System.out.println();
        System.out.println(" ----------------------------------");
        
    }
        
}