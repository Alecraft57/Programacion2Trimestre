package Examendel16deEnero.Estructurabasica;

import java.util.ArrayList;
import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {
        ArrayList<Double> alumnosaltura = new ArrayList<>();
        int alu=numeroAlumnos();
        System.out.println(leerAlturas(alumnosaltura,alu));
        mostrarResultados(alumnosaltura);

    }

    public static int numeroAlumnos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la cantidad de alumnos que hay");
        int cantidad = sc.nextInt();

        return cantidad;
    }

    public static double leerAlturas(ArrayList<Double> alumnosaltura,int alu) {
        Scanner sc = new Scanner(System.in);
        double altura=0;
        System.out.println("Dime la altura de los alumnos:");
        for(int i=0;i<alu;i++) {
            altura = sc.nextDouble();
            alumnosaltura.add(altura);
        }
        return altura;
    }

    public static double calcularMedia(ArrayList<Double> alumnosaltura) {
        double contador = 0;
        for (int i = 0; i < alumnosaltura.size(); i++) {
            contador = contador + alumnosaltura.get(i);
        }
        double media = contador / alumnosaltura.size();
        return media;
    }

    public static int calcularAlumnosAlturaSuperior(ArrayList<Double> alumnosaltura) {
        int contador = 0;
        for (int i = 0; i < alumnosaltura.size(); i++) {
            if (alumnosaltura.get(i) > calcularMedia(alumnosaltura)) {
                contador++;
            }
        }
        return contador;
    }
    public static int calcularAlumnosAlturaInferior(ArrayList<Double> alumnosaltura){
        int contador=alumnosaltura.size()-calcularAlumnosAlturaSuperior(alumnosaltura);
            return contador;
        }
    public static void mostrarResultados(ArrayList<Double> alumnosaltura){
        for(double alt:alumnosaltura)
        System.out.print(alt+" | ");
        System.out.println("");
        System.out.println("Media altura alumnos:"+ calcularMedia(alumnosaltura));
        System.out.println("Cantidad superior a la media:"+calcularAlumnosAlturaSuperior(alumnosaltura));
        System.out.println("Cantidad inferior a la media:"+calcularAlumnosAlturaInferior(alumnosaltura));
    }
}
