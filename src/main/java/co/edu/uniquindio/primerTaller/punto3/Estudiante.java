package co.edu.uniquindio.primerTaller.punto3;

public class Estudiante extends Persona{

    private String matricula;

    public Estudiante(String nombre, String apellido, String matricula) {
        super(nombre, apellido);
        this.matricula = matricula;
    }

    // Getter para la matrícula
    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Estudiante: " + getNombre() + " " + getApellido() + ", Matrícula: " + matricula;
    }
}
