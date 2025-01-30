package OrientadaAObjetos.Ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class Departament {
    private String departament;
    private Area area;
    private Set<Profesor> profesors;
    private Set<Catedra> catedras;

    Departament(String departament,Area area){
        this.departament=departament;
        this.area=area;
        this.profesors=new HashSet<>();
        this.catedras=new HashSet<>();
    }
    public String getDepartament(){
        return departament;
    }
    public void addProfesors(Profesor profesor){
        this.profesors.add(profesor);
    }
    public void addCatedras(Catedra catedra){
        this.catedras.add(catedra);
    }

    public String toString(){
        return "Departamento: "+getDepartament();
    }

}
