package VueltadeVacaciones.Estructurabasica.Repetir;

import java.util.ArrayList;
import java.util.Scanner;

public class Felipe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int prioridad=0;
        int duracion=0;
        ArrayList<tareas> tareasfelipe=new ArrayList<>();
        System.out.println("Dime cantidad de tareas");
        int cantidad=sc.nextInt();
        for(int i=0;i<cantidad;i++){
            System.out.println("Prioridad de la tarea");
            prioridad=sc.nextInt();
            System.out.println("Duracion de la tarea");
            duracion= sc.nextInt();
            tareasfelipe.add(new tareas(prioridad,duracion));
        }
        tareasfelipe.sort((tarea1,tarea2)-> Integer.compare(tarea2.getPrioridad(),tarea1.getPrioridad()));
        for(tareas tarea: tareasfelipe){
            System.out.println(tarea.getPrioridad()+" "+tarea.getDuracion());
        }
        System.out.println("---");
    }
}
