package co.edu.uniquindio.primerTaller.Punto13;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Punto13 {

    public static Set<Integer> filtrarConjunto(Set<Integer> conjuntoOriginal, Set<Integer> nuevoConjunto) {

        if (conjuntoOriginal.isEmpty()) {
            return nuevoConjunto;
        }


        Iterator<Integer> iterator = conjuntoOriginal.iterator();

        if (iterator.hasNext()) {

            Integer elemento = iterator.next();


            if (elemento % 2 == 0) {
                nuevoConjunto.add(elemento);
            }


            iterator.remove();


            return filtrarConjunto(conjuntoOriginal, nuevoConjunto);
        }

        return nuevoConjunto;
    }


    public static Set<Integer> filtrarConjunto(Set<Integer> conjuntoOriginal) {
        Set<Integer> nuevoConjunto = new HashSet<>();
        return filtrarConjunto(conjuntoOriginal, nuevoConjunto);
    }

    public static void main(String[] args) {

        Set<Integer> conjuntoOriginal = new HashSet<>();
        conjuntoOriginal.add(1);
        conjuntoOriginal.add(2);
        conjuntoOriginal.add(3);
        conjuntoOriginal.add(4);
        conjuntoOriginal.add(5);
        conjuntoOriginal.add(6);


        Set<Integer> conjuntoFiltrado = filtrarConjunto(conjuntoOriginal);


        System.out.println("Conjunto filtrado: " + conjuntoFiltrado);
    }
}
