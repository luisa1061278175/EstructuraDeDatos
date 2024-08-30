package co.edu.uniquindio.primerTaller.punto1;

import java.util.ArrayList;
import java.util.Collections;

public class Punto1 {



public static void main(String[] args) {


    ArrayList<Persona> arreglo= new ArrayList<>();
    arreglo.add(new Persona("Luisa","Osorio","300"));
    arreglo.add(new Persona("Dillan","Buitrago","301"));
    arreglo.add(new Persona("Maria","Giraldo","302"));

    Collections.sort(arreglo);
    System.out.println("Ordenado por nombres: \n "+arreglo);

}



}
