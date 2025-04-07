package trimestre2.OrientadaAObjetos.EntidadRelacio.Ejercicio6;

public class MainInsti {
    public static void main(String[] args) {
        Area area1 = new Area("Area1");
        Departament departament1 = new Departament("Departament1",area1);
        Profesor profesor1 = new Profesor("Vicastello",departament1);
        Facultat facultat1 = new Facultat("Facultat1");
        Catedra catedra1 = new Catedra("Catedra1",departament1,facultat1);
        System.out.println(area1);
        System.out.println(departament1);
        System.out.println(profesor1);
        System.out.println(facultat1);
        System.out.println(catedra1);
    }
}
