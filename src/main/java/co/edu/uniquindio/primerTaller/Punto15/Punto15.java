package co.edu.uniquindio.primerTaller.Punto15;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
public class Punto15 {

    public static Map<String, Integer> filtrarMapa(Map<String, Integer> mapaOriginal, Map<String, Integer> nuevoMapa) {

        if (mapaOriginal.isEmpty()) {
            return nuevoMapa;
        }


        Iterator<Map.Entry<String, Integer>> iterator = mapaOriginal.entrySet().iterator();

        if (iterator.hasNext()) {

            Map.Entry<String, Integer> entrada = iterator.next();


            if (Character.isLowerCase(entrada.getKey().charAt(0))) {

                nuevoMapa.put(entrada.getKey(), entrada.getValue());
            }


            iterator.remove();


            return filtrarMapa(mapaOriginal, nuevoMapa);
        }

        return nuevoMapa;
    }


    public static Map<String, Integer> filtrarMapa(Map<String, Integer> mapaOriginal) {
        Map<String, Integer> nuevoMapa = new HashMap<>();
        return filtrarMapa(mapaOriginal, nuevoMapa);
    }

    public static void main(String[] args) {

        Map<String, Integer> mapaOriginal = new HashMap<>();
        mapaOriginal.put("manzana", 10);
        mapaOriginal.put("Banana", 20);
        mapaOriginal.put("naranja", 30);
        mapaOriginal.put("Uva", 40);


        Map<String, Integer> mapaFiltrado = filtrarMapa(mapaOriginal);


        System.out.println("Mapa filtrado: " + mapaFiltrado);
    }
}
