package co.edu.uniquindio.primerTaller.punto3;

import java.util.HashMap;
import java.util.Map;

public class Punto3 {


    //Cree una clase "Estudiante" que extienda de la clase "Persona" y agregue un atributo
//adicional para la matrícula del estudiante. Crea un mapa que asocie el número de matrícula con el
//objeto Estudiante correspondiente.

    public static void main(String[] args) {


        Estudiante estudiante1 = new Estudiante("Juan", "Perez", "1");
        Estudiante estudiante2 = new Estudiante("María", "Garcia", "2");
        Estudiante estudiante3 = new Estudiante("Dillan", "Buitrago", "3");

        Map<String, Estudiante> mapaEstudiantes = new HashMap<>();

        mapaEstudiantes.put(estudiante1.getMatricula(), estudiante1);
        mapaEstudiantes.put(estudiante2.getMatricula(), estudiante2);
        mapaEstudiantes.put(estudiante3.getMatricula(), estudiante3);

        String matriculaBuscada = "2";

        Estudiante estudianteBuscado = mapaEstudiantes.get(matriculaBuscada);

        if (estudianteBuscado != null) {
            System.out.println("Estudiante encontrado: " + estudianteBuscado);
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }
}




