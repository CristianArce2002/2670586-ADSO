
public class Materia {

    private String materia;
    private double creditos;
    private double nota;

    public Materia(String materia, Double creditos, double nota) {
        this.materia = materia;
        this.creditos = creditos;
        this.nota = nota;
    }

    public String getMateria() {
        return this.materia;
    }

    public double getCreditos() {
        return this.creditos;
    }

    public double getNota() {
        return this.nota;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setCreditos(double creditos) {
        this.creditos = creditos;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

}