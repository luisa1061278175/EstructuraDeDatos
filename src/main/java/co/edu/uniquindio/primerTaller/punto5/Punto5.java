package co.edu.uniquindio.primerTaller.punto5;




import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Punto5 {
    public static void main(String[] args) {

        Set<String> conjunto = new HashSet<>();


        conjunto.add("Elemento 1");
        conjunto.add("Elemento 2");
        conjunto.add("Elemento 3");
        conjunto.add("Elemento 1");


        Iterator<String> iterador = conjunto.iterator();


        System.out.println("Contenido del conjunto:");
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}