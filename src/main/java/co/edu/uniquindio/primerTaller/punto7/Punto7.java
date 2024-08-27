package co.edu.uniquindio.primerTaller.punto7;

//Cree una función recursiva que reciba una lista de objetos "Persona" y devuelva una nueva
//lista que contenga solo las personas mayores de edad

import java.util.ArrayList;
import java.util.List;

public class Punto7 {public static List<Persona> filtrarMayoresDeEdad(List<Persona> personas) {
    // Caso base: si la lista está vacía, retornamos una nueva lista vacía
    if (personas.isEmpty()) {
        return new ArrayList<>();
    }

    // Tomamos la primera persona de la lista
    Persona primeraPersona = personas.get(0);

    // Llamada recursiva para procesar el resto de la lista
    List<Persona> resto = filtrarMayoresDeEdad(personas.subList(1, personas.size()));

    // Si la persona es mayor de edad, la agregamos a la lista resultante
    if (primeraPersona.getEdad() >= 18) {
        resto.add(0, primeraPersona);
    }

    // Retornamos la lista filtrada
    return resto;
}

    public static void main(String[] args) {
        // Crear una lista de personas
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 17));
        personas.add(new Persona("Ana", 21));
        personas.add(new Persona("Luis", 16));
        personas.add(new Persona("María", 22));

        // Filtrar las personas mayores de edad
        List<Persona> mayoresDeEdad = filtrarMayoresDeEdad(personas);

        // Imprimir la lista resultante
        System.out.println("Personas mayores de edad:");
        for (Persona p : mayoresDeEdad) {
            System.out.println(p);
        }
    }
}