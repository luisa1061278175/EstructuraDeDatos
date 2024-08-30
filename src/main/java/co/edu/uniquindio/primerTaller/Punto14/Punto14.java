package co.edu.uniquindio.primerTaller.Punto14;
import java.util.ArrayList;
import java.util.List;
public class Punto14 {

    public static List<String> filtrarLista(List<String> listaOriginal, List<String> nuevaLista) {

        if (listaOriginal.isEmpty()) {
            return nuevaLista;
        }


        String elemento = listaOriginal.get(0);


        if (Character.isUpperCase(elemento.charAt(0))) {
            nuevaLista.add(elemento);
        }


        return filtrarLista(listaOriginal.subList(1, listaOriginal.size()), nuevaLista);
    }


    public static List<String> filtrarLista(List<String> listaOriginal) {
        List<String> nuevaLista = new ArrayList<>();
        return filtrarLista(listaOriginal, nuevaLista);
    }

    public static void main(String[] args) {

        List<String> listaOriginal = new ArrayList<>();
        listaOriginal.add("Manzana");
        listaOriginal.add("banana");
        listaOriginal.add("Naranja");
        listaOriginal.add("uva");


        List<String> listaFiltrada = filtrarLista(listaOriginal);


        System.out.println("Lista filtrada: " + listaFiltrada);
    }
}
