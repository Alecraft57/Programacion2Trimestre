package Examendel16deEnero.InterfazComparable;

import javax.xml.transform.Source;
import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;

public class FelipeImbecil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prioridad = 0;
        int duracion = 0;
        ArrayList<tareasfelipe> tareas = new ArrayList<>();
        System.out.println("Cantidad de tareas");
        int cantidadtareas = sc.nextInt();
        for (int i = 0; i < cantidadtareas; i++) {
            System.out.println("Dime la prioridad de la tarea");
            prioridad = sc.nextInt();
            System.out.println("Dime la duracion de la tarea");
            duracion = sc.nextInt();
            tareas.add(new tareasfelipe(prioridad, duracion));
        }
        tareas.sort((tarea1, tarea2) -> Integer.compare(tarea2.getPrioridad(), tarea1.getPrioridad()));

        for (tareasfelipe tarea : tareas) {
            System.out.println(tarea.getPrioridad() + " " + tarea.getDuracion());
        }
        System.out.println("---");
        tareas.clear();
    }
}
