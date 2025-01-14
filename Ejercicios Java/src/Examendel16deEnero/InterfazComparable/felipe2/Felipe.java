package Examendel16deEnero.InterfazComparable.felipe2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class Felipe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int prioridad=0;
        int duracion=0;
        while (true){
        System.out.println("Tareas de felipe");
        int cantidad = sc.nextInt();
        if(cantidad==0){
            break;
        }
            ArrayList<tareasfelipe2>tareas=new ArrayList<>();
            for(int i=0;i<cantidad;i++){
            System.out.println("Prioridad");
            prioridad= sc.nextInt();
            System.out.println("Duracion");
            duracion=sc.nextInt();
            tareas.add(new tareasfelipe2(prioridad,duracion));
        }
        tareas.sort((tarea1,tarea2) -> Integer.compare(tarea2.getPrioridad(),tarea1.getPrioridad()));

        for(tareasfelipe2 tarea : tareas){
            System.out.println(tarea.getPrioridad()+" "+tarea.getDuracion());
        }
        System.out.println("---");

    }
        }
}
