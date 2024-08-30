package co.edu.uniquindio.primerTaller.Punto17;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        // Crear un HashMap
        Map<String, Double> productosHashMap = new java.util.HashMap<>();

        // Agregar productos
        productosHashMap.put("Empanada", 2000.0);
        productosHashMap.put("Panseroti", 4500.0);
        productosHashMap.put("Arepa con carne", 3500.0);

        // Mostrar el HashMap
        System.out.println("HashMap: " + productosHashMap);
    }
    /*Orden:
    No garantiza ningún orden en particular para las claves o valores.
    Velocidad:
    Es muy rápido para búsquedas, inserciones y eliminaciones, ya que utiliza una tabla hash.
    Duplicados:
    No permite claves duplicadas, pero sí valores duplicados.

     */
}