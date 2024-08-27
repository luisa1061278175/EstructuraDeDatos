package co.edu.uniquindio.primerTaller.punto5;


//Crear una lista de elementos que no permite duplicados e imprima el contenido de
// la lista usando iteradores.


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Punto5 {
    public static void main(String[] args) {
        // Crear un conjunto (Set) para almacenar los elementos sin duplicados
        Set<String> conjunto = new HashSet<>();

        // Agregar elementos al conjunto
        conjunto.add("Elemento 1");
        conjunto.add("Elemento 2");
        conjunto.add("Elemento 3");
        conjunto.add("Elemento 1"); // Este elemento no se agregará porque ya existe en el conjunto

        // Crear un iterador para recorrer el conjunto
        Iterator<String> iterador = conjunto.iterator();

        // Imprimir los elementos del conjunto usando el iterador
        System.out.println("Contenido del conjunto:");
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}