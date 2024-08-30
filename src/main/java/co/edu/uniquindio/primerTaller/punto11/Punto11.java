package co.edu.uniquindio.primerTaller.punto11;

import java.util.ArrayList;
import java.util.List;

//Cree una función recursiva que reciba una lista de Productos y los ordene usando el algoritmo de ordenamiento
//quicksort.
public class Punto11 {

    // Función recursiva para ordenar la lista de productos usando Quicksort
    public static List<Producto> quickSort(List<Producto> lista) {
        // Caso base: Si la lista tiene 0 o 1 elemento, ya está ordenada
        if (lista.size() <= 1) {
            return lista;
        }

        // Seleccionamos el pivote (en este caso, el primer elemento de la lista)
        Producto pivote = lista.get(0);

        // Listas para elementos menores, iguales y mayores al pivote
        List<Producto> menores = new ArrayList<>();
        List<Producto> mayores = new ArrayList<>();
        List<Producto> iguales = new ArrayList<>();

        // Clasificar cada elemento en menores, iguales o mayores respecto al pivote
        for (Producto producto : lista) {
            if (producto.getPrecio() < pivote.getPrecio()) {
                menores.add(producto);
            } else if (producto.getPrecio() > pivote.getPrecio()) {
                mayores.add(producto);
            } else {
                iguales.add(producto);
            }
        }

        // Llamadas recursivas para ordenar las sublistas
        menores = quickSort(menores);
        mayores = quickSort(mayores);

        // Unir las listas en un solo resultado ordenado
        List<Producto> resultado = new ArrayList<>();
        resultado.addAll(menores);
        resultado.addAll(iguales);
        resultado.addAll(mayores);

        return resultado;
    }

    public static void main(String[] args) {
        // Crear una lista de ejemplo con algunos productos
        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto("Producto A", 15.0));
        listaProductos.add(new Producto("Producto B", 8.0));
        listaProductos.add(new Producto("Producto C", 5.5));
        listaProductos.add(new Producto("Producto D", 12.3));
        listaProductos.add(new Producto("Producto E", 9.9));

        // Ordenar la lista usando Quicksort
        List<Producto> listaOrdenada = quickSort(listaProductos);

        // Imprimir la lista ordenada
        System.out.println("Productos ordenados por precio:");
        for (Producto producto : listaOrdenada) {
            System.out.println(producto);
        }
    }
}