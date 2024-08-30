package co.edu.uniquindio.primerTaller.Punto17;
import java.util.TreeMap;
import java.util.Map;

public class TreeM{
    public static void main(String[] args) {

    Map<String, Double> productosTreeMap = new TreeMap<>();


    productosTreeMap.put("Empanada", 2000.0);
    productosTreeMap.put("Panseroti", 4500.0);
    productosTreeMap.put("Arepa con carne", 3500.0);


    System.out.println("TreeMap: " + productosTreeMap);
}
/*
    Orden:
    Ordena los elementos según el orden natural de las claves (o un comparador especificado).
    Velocidad:
    Es más lento en comparación con HashMap y LinkedHashMap para búsquedas, inserciones y eliminaciones, ya que se basa en una estructura de árbol.
    Duplicados:
    No permite claves duplicadas, pero sí valores duplicados.

     */
}
