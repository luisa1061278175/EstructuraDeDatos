package co.edu.uniquindio.primerTaller.punto3;

import java.util.HashMap;
import java.util.Map;

public class Punto3 {

    public static void main(String[] args) {


        Estudiante estudiante1 = new Estudiante("Juan", "Pérez", "MAT001");
        Estudiante estudiante2 = new Estudiante("Ana", "Gómez", "MAT002");
        Estudiante estudiante3 = new Estudiante("Luis", "Martínez", "MAT003");


        Map<String, Estudiante> mapaEstudiantes = new HashMap<>();
        mapaEstudiantes.put(estudiante1.getMatricula(), estudiante1);
        mapaEstudiantes.put(estudiante2.getMatricula(), estudiante2);
        mapaEstudiantes.put(estudiante3.getMatricula(), estudiante3);


        for (Map.Entry<String, Estudiante> entry : mapaEstudiantes.entrySet()) {
            System.out.println("Matrícula: " + entry.getKey() + ", " + entry.getValue());
        }
    }
}




