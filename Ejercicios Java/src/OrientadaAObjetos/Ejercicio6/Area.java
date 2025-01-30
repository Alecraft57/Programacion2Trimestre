package OrientadaAObjetos.Ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class Area {
    private String area;
    private Set<Departament>departaments;

    Area(String area){
        this.area=area;
        this.departaments=new HashSet<>();
    }
    public String getArea(){
        return area;
    }
    public void addDepartament(Departament departament){
        this.departaments.add(departament);
    }
    public String toString() {
        return "Area: "+getArea();
    }
}
