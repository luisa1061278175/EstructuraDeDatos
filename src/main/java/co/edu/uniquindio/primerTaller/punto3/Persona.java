package co.edu.uniquindio.primerTaller.punto3;

//Cree una clase "Estudiante" que extienda de la clase "Persona" y agregue un atributo
//adicional para la matrícula del estudiante. Crea un mapa que asocie el número de matrícula con el
//objeto Estudiante correspondiente.
public class Persona {
    private String nombre;
    private String apellido;
    private String codigo;

    public Persona(String nombre, String apellido, String codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
