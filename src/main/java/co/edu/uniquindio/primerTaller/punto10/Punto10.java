package co.edu.uniquindio.primerTaller.punto10;

import java.util.LinkedList;
import java.util.Queue;

public class Punto10 {


    public static Queue<Producto> filtrarCola(Queue<Producto> cola, Condicion<Producto> condicion) {
        // Caso base: si la cola está vacía, retornamos una nueva cola vacía
        if (cola.isEmpty()) {
            return new LinkedList<>();
        }


        Producto producto = cola.poll();


        Queue<Producto> colaFiltrada = filtrarCola(cola, condicion);


        if (condicion.cumple(producto)) {
            colaFiltrada.offer(producto);
        }


        return colaFiltrada;
    }

    public static void main(String[] args) {

        Queue<Producto> cola = new LinkedList<>();
        cola.offer(new Producto("Producto A", 1000.0));
        cola.offer(new Producto("Producto B", 200.0));
        cola.offer(new Producto("Producto C", 5000.5));
        cola.offer(new Producto("Producto D", 1200.3));
        cola.offer(new Producto("Producto E", 9000.9));


        Condicion<Producto> condicion = producto -> producto.getPrecio() < 4000.0;


        Queue<Producto> colaFiltrada = filtrarCola(cola, condicion);


        System.out.println("Productos con precio menor que 4000:");
        while (!colaFiltrada.isEmpty()) {
            System.out.println(colaFiltrada.poll());
        }
    }
}


interface Condicion<T> {
    boolean cumple(T elemento);}

