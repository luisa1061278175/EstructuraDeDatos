package co.edu.uniquindio.primerTaller.punto9;


import java.util.Stack;

//Cree una función recursiva que reciba una pila de objetos y devuelva una nueva pila que contenga solo
//los elementos que cumplen con cierta condición (por ejemplo, aquellos cuyo valor es mayor que 5).
public class Punto9 {

    // Función recursiva para filtrar la pila
    public static Stack<Integer> filtrarPila(Stack<Integer> pilaOriginal, Stack<Integer> nuevaPila) {
        // Condición base: si la pila original está vacía, retornar la nueva pila
        if (pilaOriginal.isEmpty()) {
            return nuevaPila;
        }

        // Desapilar el elemento de la pila original
        int elemento = pilaOriginal.pop();

        // Verificar si el elemento cumple la condición (mayor que 5 en este caso)
        if (elemento > 5) {
            nuevaPila.push(elemento);  // Agregarlo a la nueva pila si cumple la condición
        }

        // Llamada recursiva
        return filtrarPila(pilaOriginal, nuevaPila);
    }

    // Función que inicializa la pila nueva y llama a la función recursiva
    public static Stack<Integer> filtrarPila(Stack<Integer> pilaOriginal) {
        Stack<Integer> nuevaPila = new Stack<>();
        return filtrarPila(pilaOriginal, nuevaPila);
    }

    public static void main(String[] args) {
        // Crear una pila de ejemplo
        Stack<Integer> pilaOriginal = new Stack<>();
        pilaOriginal.push(1);
        pilaOriginal.push(10);
        pilaOriginal.push(3);
        pilaOriginal.push(7);
        pilaOriginal.push(2);

        // Filtrar la pila
        Stack<Integer> pilaFiltrada = filtrarPila(pilaOriginal);

        // Mostrar el resultado
        System.out.println("Pila filtrada: " + pilaFiltrada);
    }
}
