package co.edu.uniquindio.primerTaller.punto6;


import java.util.PriorityQueue;
import java.util.Queue;

public class Punto6 {

    public static void main(String[] args) {


            Queue<Tarea> colaDeTareas = new PriorityQueue<>();


            colaDeTareas.add(new Tarea("Tarea 1", 3));
            colaDeTareas.add(new Tarea("Tarea 2", 1));
            colaDeTareas.add(new Tarea("Tarea 3", 2));


            while (!colaDeTareas.isEmpty()) {

                Tarea tarea = colaDeTareas.poll();
                System.out.println("Procesando: " + tarea);
            }
        }
    }