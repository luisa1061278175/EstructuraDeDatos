package co.edu.uniquindio.primerTaller.punto3;
//Cree una clase "Estudiante" que extienda de la clase "Persona" y agregue un atributo
//adicional para la matrícula del estudiante. Crea un mapa que asocie el número de matrícula con el
//objeto Estudiante correspondiente.

public class Estudiante extends Persona{

    private String matricula;

    public Estudiante(String nombre, String apellido, String codigo, String matricula) {
        super(nombre, apellido, codigo);
        this.matricula = matricula;
    }

    public Estudiante(String nombre, String apellido, String codigo) {
        super(nombre, apellido, codigo);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
