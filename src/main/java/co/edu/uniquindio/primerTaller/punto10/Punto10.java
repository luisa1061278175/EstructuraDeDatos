package co.edu.uniquindio.primerTaller.punto10;

import java.util.LinkedList;
import java.util.Queue;

public class Punto10 {

    // Función recursiva para filtrar productos según una condición
    public static Queue<Producto> filtrarCola(Queue<Producto> cola, Condicion<Producto> condicion) {
        // Caso base: si la cola está vacía, retornamos una nueva cola vacía
        if (cola.isEmpty()) {
            return new LinkedList<>();
        }

        // Tomar el primer elemento de la cola
        Producto producto = cola.poll();

        // Llamada recursiva para procesar el resto de la cola
        Queue<Producto> colaFiltrada = filtrarCola(cola, condicion);

        // Si el producto cumple la condición, lo agregamos a la cola filtrada
        if (condicion.cumple(producto)) {
            colaFiltrada.offer(producto);
        }

        // Retornamos la cola filtrada
        return colaFiltrada;
    }

    public static void main(String[] args) {
        // Crear una cola de ejemplo con algunos productos
        Queue<Producto> cola = new LinkedList<>();
        cola.offer(new Producto("Producto A", 15.0));
        cola.offer(new Producto("Producto B", 8.0));
        cola.offer(new Producto("Producto C", 5.5));
        cola.offer(new Producto("Producto D", 12.3));
        cola.offer(new Producto("Producto E", 9.9));

        // Definir la condición (por ejemplo, productos con precio menor que 10)
        Condicion<Producto> condicion = producto -> producto.getPrecio() < 10.0;

        // Filtrar la cola
        Queue<Producto> colaFiltrada = filtrarCola(cola, condicion);

        // Imprimir la cola resultante
        System.out.println("Productos con precio menor que 10:");
        while (!colaFiltrada.isEmpty()) {
            System.out.println(colaFiltrada.poll());
        }
    }
}

// Interfaz funcional que define la condición
interface Condicion<T> {
    boolean cumple(T elemento);}

