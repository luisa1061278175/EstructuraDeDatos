package co.edu.uniquindio.primerTaller.punto2;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class Punto2 {

    //Crear la lista de productos en una clase empresa utilizando treeset, se debe realizar un método que
    //busque un producto por su código.


    //El TreeSet es especial para ordenamiento, no se permiten datos repetidos,
    //operaciones eficientes para busqueda, eliminar...

    public static TreeSet<Producto> productos = new TreeSet<>();

    public static void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public static Producto buscarProductoPorCodigo(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;
    }

    public static void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public static void main(String[] args) {

        productos = new TreeSet<>();

        Producto p1 = new Producto("Papas","090","Mecato");
        Producto p2 = new Producto("Manzana","93829","Frutas");
        Producto p3 = new Producto("Leche", "3283","Lacteos");

        agregarProducto(p1);
        agregarProducto(p2);
        agregarProducto(p3);


        Producto encontrado = buscarProductoPorCodigo("090");
        if (encontrado != null) {
            System.out.println("Producto encontrado: " + encontrado);
        } else {
            System.out.println("Producto no encontrado.");
        }

    }
}






