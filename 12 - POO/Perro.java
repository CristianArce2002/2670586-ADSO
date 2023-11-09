public class Perro {

    private String nombre;
    private String raza;
    private String propietario;
    private double peso;
    private int edad;
    private int energia;

    public Perro(String nombre, String raza, String propietario, double peso, int edad, int energia) {
        this.nombre = nombre;
        this.raza = raza;
        this.propietario = propietario;
        this.peso = peso;
        this.energia = energia;
        this.edad = edad;
    }

    public void imprimir_detalles(){

        System.out.println("  ------------- Detalles ---------------");
        System.out.println("");
        System.out.println("  nombre: " + nombre);
        System.out.println("  raza: " + raza);
        System.out.println("  propietario: " + propietario);
        System.out.println("  peso: " + peso + " kilos");
        System.out.println("  edad: " + edad + " meses");
        System.out.println("  energia: " + energia + "%");
        System.out.println("  ");
        System.out.println("  ----------------------------");

    }

    public void comer(int gramos){

        peso += ((double) gramos / 1000);

        energia += (gramos / 100);

    }

    public void caminar(int metros){

        double peso_bajado =  metros / 1000;
        int energia_gastada = metros / 50;

        peso -= peso_bajado;
        energia -= energia_gastada;

        System.out.println(" SU pero ha bajado " + peso_bajado);
        System.out.println(" Su perro ha perdidio " + energia_gastada + " de energia.");


    }

    public void morder(int cantidad_mordidas){
        energia -= (cantidad_mordidas / 10);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getPropietario() {
        return this.propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEnergia() {
        return this.energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

}
