package co.edu.uniquindio.primerTaller.punto4;

import java.util.Stack;

//Cree una pila (Stack) que pueda almacenar objetos de diferentes tipos y que solo permite insertar elementos
// si el tipo
//del objeto coincide con el tipo del elemento en la cima de la pila.

public class Punto4 {

    private Stack<Object> pila;
    private Class<?> tipoCima; // Mantiene el tipo del objeto en la cima de la pila

    public Punto4() {
        this.pila = new Stack<>();
        this.tipoCima = null; // Al principio, no hay ningún tipo en la cima
    }

    public void apilar(Object item) throws IllegalArgumentException {
        if (pila.isEmpty()) {
            // Si la pila está vacía, aceptamos cualquier tipo
            tipoCima = item.getClass();
        } else if (!item.getClass().equals(tipoCima)) {
            // Si el tipo del nuevo elemento no coincide con el de la cima, lanzamos una excepción
            throw new IllegalArgumentException("El tipo del objeto no coincide con el tipo del elemento en la cima de la pila.");
        }
        pila.push(item);
    }

    public Object desapilar() {
        Object item = pila.pop();
        // Actualizamos el tipo de la cima de la pila después de hacer un pop
        tipoCima = pila.isEmpty() ? null : pila.peek().getClass();
        return item;
    }

    public Object mirar() {
        return pila.peek();
    }

    public boolean estaVacia() {
        return pila.isEmpty();
    }

    public int tamano() {
        return pila.size();
    }

    public static void main(String[] args) {
        PilaTipada pilaTipada = new PilaTipada();

        try {
            // Ejemplo de uso
            pilaTipada.apilar("Hola");
            pilaTipada.apilar("Mundo"); // Ok
            // pilaTipada.apilar(42); // Esto lanzará una excepción porque el tipo no coincide

            System.out.println(pilaTipada.desapilar()); // Mundo
            pilaTipada.apilar(42); // Ahora es permitido porque la pila está vacía
            pilaTipada.apilar(7); // Ok
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}