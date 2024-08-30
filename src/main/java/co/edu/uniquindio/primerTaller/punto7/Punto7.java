package co.edu.uniquindio.primerTaller.punto7;



import java.util.ArrayList;
import java.util.List;

public class Punto7 {public static List<Persona> filtrarMayoresDeEdad(List<Persona> personas) {

    if (personas.isEmpty()) {
        return new ArrayList<>();
    }


    Persona primeraPersona = personas.get(0);


    List<Persona> resto = filtrarMayoresDeEdad(personas.subList(1, personas.size()));


    if (primeraPersona.getEdad() >= 18) {
        resto.add(0, primeraPersona);
    }


    return resto;
}

    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 17));
        personas.add(new Persona("Ana", 21));
        personas.add(new Persona("Luis", 16));
        personas.add(new Persona("María", 22));


        List<Persona> mayoresDeEdad = filtrarMayoresDeEdad(personas);


        System.out.println("Personas mayores de edad:");
        for (Persona p : mayoresDeEdad) {
            System.out.println(p);
        }
    }
}