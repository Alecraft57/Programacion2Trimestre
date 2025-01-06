package VueltadeVacaciones.Estructurabasica;

import java.util.ArrayList;
import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {
        int numalu = numeroAlumnos();
        ArrayList<Double> alturalu = new ArrayList<>();
        System.out.println(leerAlturas(alturalu,numalu));
        mostrarResultados(alturalu);
    }

    public static int numeroAlumnos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el numero de alumnos de la clase");
        int numalu = sc.nextInt();
        return numalu;
    }

    public static double leerAlturas(ArrayList<Double> alturalu, int numalu) {
        double alt=0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numalu; i++) {
            System.out.println("Dime la altura de los alumnos");
            alt = sc.nextDouble();
            alturalu.add(alt);
        }
        return alt;
    }

    public static Double calcularMedia(ArrayList<Double> alturalu) {
        double med = 0;
        for (int i = 0; i < alturalu.size(); i++) {
            med = med + alturalu.get(i);
        }
        double media = med / alturalu.size();
        return media;
    }

    public static int calcularAlumnosAlturaSuperior(ArrayList<Double> alturalu) {
        int contadorsupmedia = 0;
        for (int i = 0; i < alturalu.size(); i++) {
            if (alturalu.get(i) > calcularMedia(alturalu)) {
                contadorsupmedia++;
            }
        }
        return contadorsupmedia;
    }
    public static int calcularAlumnosAlturaInferior(ArrayList<Double> alturalu){
        int contadorinfmedia = 0;
        for (int i = 0; i < alturalu.size(); i++) {
            if (alturalu.get(i) < calcularMedia(alturalu)) {
                contadorinfmedia++;
            }
        }
        return contadorinfmedia;
    }
    public static void mostrarResultados(ArrayList<Double> alturalu){
        for(double alt:alturalu){
            System.out.println(alt);
        }
        System.out.println("La media de altura de los alumnos es " + calcularMedia(alturalu));
        System.out.println("Los alumnos con altura superior a la media son " + calcularAlumnosAlturaSuperior(alturalu));
        System.out.println("Los alumnos con altura inferior a la media son " + calcularAlumnosAlturaInferior(alturalu));
    }
}
