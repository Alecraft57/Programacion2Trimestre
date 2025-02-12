package OrientadaAObjetos.EntidadRelacio.Ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class Facultat {
    private String facultat;
    private Set<Catedra> catedras;

    Facultat(String facultat){
        this.facultat=facultat;
        this.catedras=new HashSet<>();
    }
    public String getFacultat(){
        return facultat;
    }
    public void addCatedras(Catedra catedra){
        this.catedras.add(catedra);
    }
    public String toString(){
        return "Facultat: "+getFacultat();
    }

}
