package co.edu.uniquindio.primerTaller.Punto15;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
public class Punto15 {
    // Función recursiva para filtrar el mapa
    public static Map<String, Integer> filtrarMapa(Map<String, Integer> mapaOriginal, Map<String, Integer> nuevoMapa) {
        // Condición base: si el mapa original está vacío, retornar el nuevo mapa
        if (mapaOriginal.isEmpty()) {
            return nuevoMapa;
        }

        // Usar un iterador para recorrer las entradas del mapa original
        Iterator<Map.Entry<String, Integer>> iterator = mapaOriginal.entrySet().iterator();

        if (iterator.hasNext()) {
            // Obtener la primera entrada
            Map.Entry<String, Integer> entrada = iterator.next();

            // Verificar si la clave comienza con una letra minúscula
            if (Character.isLowerCase(entrada.getKey().charAt(0))) {
                // Agregar la entrada al nuevo mapa si cumple la condición
                nuevoMapa.put(entrada.getKey(), entrada.getValue());
            }

            // Eliminar la entrada procesada del mapa original
            iterator.remove();

            // Llamada recursiva
            return filtrarMapa(mapaOriginal, nuevoMapa);
        }

        return nuevoMapa;
    }

    // Función que inicializa el nuevo mapa y llama a la función recursiva
    public static Map<String, Integer> filtrarMapa(Map<String, Integer> mapaOriginal) {
        Map<String, Integer> nuevoMapa = new HashMap<>();
        return filtrarMapa(mapaOriginal, nuevoMapa);
    }

    public static void main(String[] args) {
        // Crear un mapa de ejemplo
        Map<String, Integer> mapaOriginal = new HashMap<>();
        mapaOriginal.put("manzana", 10);
        mapaOriginal.put("Banana", 20);
        mapaOriginal.put("naranja", 30);
        mapaOriginal.put("Uva", 40);

        // Filtrar el mapa
        Map<String, Integer> mapaFiltrado = filtrarMapa(mapaOriginal);

        // Mostrar el resultado
        System.out.println("Mapa filtrado: " + mapaFiltrado);
    }
}
