package co.edu.uniquindio.primerTaller.punto8;

import java.util.HashMap;
import java.util.Map;

//Implemente una función recursiva que reciba un mapa que asocie números enteros con cadenas de caracteres
//y devuelve una nuevo mapa que contenga solo las entradas cuyas claves son números pares.
public class Punto8 {
    public static Map<Integer, String> filtrarClavesPares(Map<Integer, String> mapa) {
        // Caso base: si el mapa está vacío, retornamos un nuevo mapa vacío
        if (mapa.isEmpty()) {
            return new HashMap<>();
        }

        // Obtener una entrada (par clave-valor) del mapa
        Map.Entry<Integer, String> entrada = mapa.entrySet().iterator().next();

        // Remover la entrada del mapa original para evitar modificar la colección mientras iteramos
        mapa.remove(entrada.getKey());

        // Llamada recursiva para procesar el resto del mapa
        Map<Integer, String> resultado = filtrarClavesPares(mapa);

        // Si la clave es un número par, la agregamos al mapa resultante
        if (entrada.getKey() % 2 == 0) {
            resultado.put(entrada.getKey(), entrada.getValue());
        }

        // Retornamos el mapa filtrado
        return resultado;
    }

    public static void main(String[] args) {
        // Crear un mapa de ejemplo que asocia números enteros con cadenas de caracteres
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Uno");
        mapa.put(2, "Dos");
        mapa.put(3, "Tres");
        mapa.put(4, "Cuatro");
        mapa.put(5, "Cinco");

        // Filtrar las entradas cuyas claves son números pares
        Map<Integer, String> mapaFiltrado = filtrarClavesPares(mapa);

        // Imprimir el mapa resultante
        System.out.println("Entradas con claves pares:");
        for (Map.Entry<Integer, String> entrada : mapaFiltrado.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue());
        }
    }
}

