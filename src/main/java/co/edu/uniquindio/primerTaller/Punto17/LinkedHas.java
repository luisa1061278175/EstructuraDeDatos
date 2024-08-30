package co.edu.uniquindio.primerTaller.Punto17;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHas {
    public static void main(String[] args) {

    Map<String, Double> productosLinkedHashMap = new LinkedHashMap<>();


    productosLinkedHashMap.put("Empanada", 2000.0);
    productosLinkedHashMap.put("Panseroti", 4500.0);
    productosLinkedHashMap.put("Arepa con carne", 3500.0);


    System.out.println("LinkedHashMap: " + productosLinkedHashMap);
}
    /*Orden:
    Mantiene el orden de inserción de los elementos, lo que significa que los elementos se iteran en el mismo orden en que fueron insertados.
    Velocidad:
    Es un poco más lento que HashMap debido a que mantiene una lista de enlaces que asegura el orden de los elementos.
    Duplicados:
    No permite claves duplicadas, pero sí valores duplicados.

     */
}
