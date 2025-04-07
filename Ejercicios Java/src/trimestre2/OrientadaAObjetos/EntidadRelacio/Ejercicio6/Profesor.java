package trimestre2.OrientadaAObjetos.EntidadRelacio.Ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class Profesor {
    private String profesor;
    private Departament departament;
    private Set<Catedra>catedras;

    Profesor(String profesor,Departament departament){
        this.profesor=profesor;
        this.departament=departament;
        this.catedras=new HashSet<>();
    }
    public String getProfesor() {
        return profesor;
    }
    public void addCatedras(Catedra catedra){
        this.catedras.add(catedra);
    }

    public String toString() {
        return "Profesor: "+getProfesor();
    }
}
