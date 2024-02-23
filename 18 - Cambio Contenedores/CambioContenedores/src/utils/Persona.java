package utils;

public class Persona {
    
    String cedula;
    String nombres;
    String telefono;
    String email;

    public Persona(String cedula, String nombres, String telefono, String email) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.telefono = telefono;
        this.email = email;
    }

    public String getCedula() {
        return cedula;
    }

    public void setDocumento(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setCorreo(String email) {
        this.email = email;
    }
    
}
