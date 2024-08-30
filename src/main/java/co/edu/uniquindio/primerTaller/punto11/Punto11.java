package co.edu.uniquindio.primerTaller.punto11;

import java.util.ArrayList;
import java.util.List;


public class Punto11 {


    public static List<Producto> quickSort(List<Producto> lista) {

        if (lista.size() <= 1) {
            return lista;
        }


        Producto pivote = lista.get(0);


        List<Producto> menores = new ArrayList<>();
        List<Producto> mayores = new ArrayList<>();
        List<Producto> iguales = new ArrayList<>();


        for (Producto producto : lista) {
            if (producto.getPrecio() < pivote.getPrecio()) {
                menores.add(producto);
            } else if (producto.getPrecio() > pivote.getPrecio()) {
                mayores.add(producto);
            } else {
                iguales.add(producto);
            }
        }


        menores = quickSort(menores);
        mayores = quickSort(mayores);


        List<Producto> resultado = new ArrayList<>();
        resultado.addAll(menores);
        resultado.addAll(iguales);
        resultado.addAll(mayores);

        return resultado;
    }

    public static void main(String[] args) {

        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto("Producto A", 15.0));
        listaProductos.add(new Producto("Producto B", 8.0));
        listaProductos.add(new Producto("Producto C", 5.5));
        listaProductos.add(new Producto("Producto D", 12.3));
        listaProductos.add(new Producto("Producto E", 9.9));


        List<Producto> listaOrdenada = quickSort(listaProductos);


        System.out.println("Productos ordenados por precio:");
        for (Producto producto : listaOrdenada) {
            System.out.println(producto);
        }
    }
}