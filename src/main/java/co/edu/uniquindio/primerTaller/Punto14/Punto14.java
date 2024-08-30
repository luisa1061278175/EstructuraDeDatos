package co.edu.uniquindio.primerTaller.Punto14;
import java.util.ArrayList;
import java.util.List;
public class Punto14 {
    // Función recursiva para filtrar la lista
    public static List<String> filtrarLista(List<String> listaOriginal, List<String> nuevaLista) {
        // Condición base: si la lista original está vacía, retornar la nueva lista
        if (listaOriginal.isEmpty()) {
            return nuevaLista;
        }

        // Obtener el primer elemento de la lista original
        String elemento = listaOriginal.get(0);

        // Verificar si el primer carácter es una letra mayúscula
        if (Character.isUpperCase(elemento.charAt(0))) {
            nuevaLista.add(elemento);  // Agregarlo a la nueva lista si cumple la condición
        }

        // Llamada recursiva con el resto de la lista original
        return filtrarLista(listaOriginal.subList(1, listaOriginal.size()), nuevaLista);
    }

    // Función que inicializa la nueva lista y llama a la función recursiva
    public static List<String> filtrarLista(List<String> listaOriginal) {
        List<String> nuevaLista = new ArrayList<>();
        return filtrarLista(listaOriginal, nuevaLista);
    }

    public static void main(String[] args) {
        // Crear una lista de ejemplo
        List<String> listaOriginal = new ArrayList<>();
        listaOriginal.add("Manzana");
        listaOriginal.add("banana");
        listaOriginal.add("Naranja");
        listaOriginal.add("uva");

        // Filtrar la lista
        List<String> listaFiltrada = filtrarLista(listaOriginal);

        // Mostrar el resultado
        System.out.println("Lista filtrada: " + listaFiltrada);
    }
}
