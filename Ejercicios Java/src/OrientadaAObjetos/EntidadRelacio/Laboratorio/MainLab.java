package OrientadaAObjetos.EntidadRelacio.Laboratorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainLab {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un profesor");
        String pro=sc.nextLine();
        Profesor profesor =new Profesor(new Personas(pro));
        String al;
        List<Estudiantes>estudiantes=new ArrayList<>();
        do {
            System.out.println("Dime que alumnos asisten");
            al = sc.nextLine();
            Estudiantes alumnos=new Estudiantes(new Personas(al));
            estudiantes.add(alumnos);
        }while (!al.isEmpty());
        Lab ho=new Lab("Laboratorio",2,20,20,2,profesor,estudiantes);
        System.out.println(ho);

    }
}
