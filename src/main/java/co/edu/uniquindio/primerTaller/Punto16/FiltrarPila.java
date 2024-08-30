package co.edu.uniquindio.primerTaller.Punto16;

import java.util.Stack;

public class FiltrarPila { // Función recursiva para filtrar la pila según una condición dada
    public static <T> Stack<T> filtrarPila(Stack<T> pilaOriginal, Stack<T> nuevaPila, Condicion<T> condicion) {
        // Condición base: si la pila original está vacía, retornar la nueva pila
        if (pilaOriginal.isEmpty()) {
            return nuevaPila;
        }

        // Desapilar el elemento de la pila original
        T elemento = pilaOriginal.pop();

        // Verificar si el elemento cumple la condición
        if (condicion.cumple(elemento)) {
            nuevaPila.push(elemento);  // Agregarlo a la nueva pila si cumple la condición
        }

        // Llamada recursiva
        return filtrarPila(pilaOriginal, nuevaPila, condicion);
    }

    // Función que inicializa la pila nueva y llama a la función recursiva
    public static <T> Stack<T> filtrarPila(Stack<T> pilaOriginal, Condicion<T> condicion) {
        Stack<T> nuevaPila = new Stack<>();
        return filtrarPila(pilaOriginal, nuevaPila, condicion);
    }

    public static void main(String[] args) {
        // Crear una pila de ejemplo
        Stack<Integer> pilaOriginal = new Stack<>();
        pilaOriginal.push(1);
        pilaOriginal.push(10);
        pilaOriginal.push(3);
        pilaOriginal.push(7);
        pilaOriginal.push(2);

        // Filtrar la pila con una condición dada: elementos mayores que 5
        Stack<Integer> pilaFiltrada = filtrarPila(pilaOriginal, elemento -> elemento > 5);

        // Mostrar el resultado
        System.out.println("Pila filtrada: " + pilaFiltrada);
    }
}
