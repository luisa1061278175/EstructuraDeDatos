package co.edu.uniquindio.primerTaller.punto9;


import java.util.Stack;


public class Punto9 {


    public static Stack<Integer> filtrarPila(Stack<Integer> pilaOriginal, Stack<Integer> nuevaPila) {

        if (pilaOriginal.isEmpty()) {
            return nuevaPila;
        }


        int elemento = pilaOriginal.pop();


        if (elemento > 5) {
            nuevaPila.push(elemento);
        }


        return filtrarPila(pilaOriginal, nuevaPila);
    }


    public static Stack<Integer> filtrarPila(Stack<Integer> pilaOriginal) {
        Stack<Integer> nuevaPila = new Stack<>();
        return filtrarPila(pilaOriginal, nuevaPila);
    }

    public static void main(String[] args) {

        Stack<Integer> pilaOriginal = new Stack<>();
        pilaOriginal.push(1);
        pilaOriginal.push(10);
        pilaOriginal.push(3);
        pilaOriginal.push(7);
        pilaOriginal.push(2);


        Stack<Integer> pilaFiltrada = filtrarPila(pilaOriginal);


        System.out.println("Pila filtrada: " + pilaFiltrada);
    }
}
