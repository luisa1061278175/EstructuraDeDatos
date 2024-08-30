package co.edu.uniquindio.primerTaller.Punto16;

import java.util.Stack;

public class FiltrarPila {
    public static <T> Stack<T> filtrarPila(Stack<T> pilaOriginal, Stack<T> nuevaPila, Condicion<T> condicion) {

        if (pilaOriginal.isEmpty()) {
            return nuevaPila;
        }


        T elemento = pilaOriginal.pop();


        if (condicion.cumple(elemento)) {
            nuevaPila.push(elemento);
        }


        return filtrarPila(pilaOriginal, nuevaPila, condicion);
    }


    public static <T> Stack<T> filtrarPila(Stack<T> pilaOriginal, Condicion<T> condicion) {
        Stack<T> nuevaPila = new Stack<>();
        return filtrarPila(pilaOriginal, nuevaPila, condicion);
    }

    public static void main(String[] args) {

        Stack<Integer> pilaOriginal = new Stack<>();
        pilaOriginal.push(1);
        pilaOriginal.push(10);
        pilaOriginal.push(3);
        pilaOriginal.push(7);
        pilaOriginal.push(2);


        Stack<Integer> pilaFiltrada = filtrarPila(pilaOriginal, elemento -> elemento > 5);


        System.out.println("Pila filtrada: " + pilaFiltrada);
    }
}
