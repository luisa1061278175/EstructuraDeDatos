package co.edu.uniquindio.primerTaller.punto4;

import java.util.Stack;



 class PilaTipada {
    private Stack<Object> pila = new Stack<>();
    private Class<?> tipoActual = null;


    public void apilar(Object elemento) {

        if (pila.isEmpty()) {
            tipoActual = elemento.getClass();
            pila.push(elemento);
        } else {

            if (elemento.getClass().equals(tipoActual)) {
                pila.push(elemento);
            } else {
                throw new IllegalArgumentException("Tipo de elemento no coincide con el tipo en la cima de la pila.");
            }
        }
    }


    public Object desapilar() {
        if (!pila.isEmpty()) {
            Object elemento = pila.pop();

            if (!pila.isEmpty()) {
                tipoActual = pila.peek().getClass();
            } else {
                tipoActual = null;
            }
            return elemento;
        }
        throw new IllegalStateException("La pila está vacía.");
    }


    public Object cima() {
        if (!pila.isEmpty()) {
            return pila.peek();
        }
        throw new IllegalStateException("La pila está vacía.");
    }


    public boolean estaVacia() {
        return pila.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {
        PilaTipada pila = new PilaTipada();

        try {
            pila.apilar(10);
            pila.apilar(20);
            pila.desapilar();
            pila.apilar(30);
            System.out.println(pila.cima());

            pila.desapilar();
            pila.desapilar();

            pila.apilar("Hola");
            pila.apilar("Mundo");


            System.out.println(pila.cima());

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}

