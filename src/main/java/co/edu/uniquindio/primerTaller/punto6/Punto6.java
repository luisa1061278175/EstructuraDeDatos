package co.edu.uniquindio.primerTaller.punto6;

//6.
//Cree una cola (Queue) que almacene objetos de tipo "Tarea" que tengan una prioridad asociada.
//Implemente la cola usando un PriorityQueue y defina la prioridad de cada tarea según su importancia.

import java.util.PriorityQueue;
import java.util.Queue;

public class Punto6 {

    public static void main(String[] args) {

            // Crear una PriorityQueue para almacenar objetos de tipo Tarea
            Queue<Tarea> colaDeTareas = new PriorityQueue<>();

            // Agregar tareas a la cola con diferentes prioridades
            colaDeTareas.add(new Tarea("Tarea 1", 3)); // Prioridad 3
            colaDeTareas.add(new Tarea("Tarea 2", 1)); // Prioridad 1 (mayor prioridad)
            colaDeTareas.add(new Tarea("Tarea 3", 2)); // Prioridad 2

            // Procesar las tareas en orden de prioridad
            while (!colaDeTareas.isEmpty()) {
                // Obtener y remover la tarea con la mayor prioridad (menor valor de prioridad)
                Tarea tarea = colaDeTareas.poll();
                System.out.println("Procesando: " + tarea);
            }
        }
    }