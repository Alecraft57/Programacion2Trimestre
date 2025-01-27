package OrientadaAObjetos.Ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class Catedra {
    private String catedra;
    private Departament departament;
    private Set<Profesor> profesores;
    private Facultat facultat;

    Catedra(String catedra,Departament departament, Facultat facultat){
        this.catedra=catedra;
        this.departament=departament;
        this.profesores=new HashSet<>();
        this.facultat=facultat;
    }
    public String getCatedra(){
        return catedra;
    }
    public void addProfesors(Profesor profesor){
        this.profesores.add(profesor);
    }

}
