package co.edu.uniquindio.primerTaller.Punto12;

import java.util.ArrayList;
import java.util.List;

public class ArbolBinario {


    public static void recorridoInOrder(Nodo nodo, List<Integer> lista) {
        if (nodo != null) {

            recorridoInOrder(nodo.izquierda, lista);

            lista.add(nodo.valor);

            recorridoInOrder(nodo.derecha, lista);
        }
    }


    public static List<Integer> obtenerElementosEnOrden(Nodo raiz) {
        List<Integer> lista = new ArrayList<>();
        recorridoInOrder(raiz, lista);
        return lista;
    }

    public static void main(String[] args) {

        Nodo raiz = new Nodo(5);
        raiz.izquierda = new Nodo(3);
        raiz.derecha = new Nodo(7);
        raiz.izquierda.izquierda = new Nodo(2);
        raiz.izquierda.derecha = new Nodo(4);
        raiz.derecha.izquierda = new Nodo(6);
        raiz.derecha.derecha = new Nodo(8);


        List<Integer> elementosEnOrden = obtenerElementosEnOrden(raiz);


        System.out.println("Elementos en orden ascendente: " + elementosEnOrden);
    }
}
