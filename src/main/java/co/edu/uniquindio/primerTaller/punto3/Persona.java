package co.edu.uniquindio.primerTaller.punto3;


public class Persona {
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Getters para los atributos de Persona
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return "Persona: " + nombre + " " + apellido;
    }
}
