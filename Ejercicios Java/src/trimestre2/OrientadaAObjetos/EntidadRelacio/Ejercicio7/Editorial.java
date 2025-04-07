package trimestre2.OrientadaAObjetos.EntidadRelacio.Ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Editorial {
    private int cod_ed;
    private Set<Llibre>llibres;

    Editorial(int cod_ed){
        this.cod_ed=cod_ed;
        this.llibres=new HashSet<>();
    }

    public int getCod_ed() {
        return cod_ed;
    }

    public void addLlibre(Llibre llibre){
        this.llibres.add(llibre);
    }

    public String toString() {
        return "Codigo Editorial: "+getCod_ed();
    }
}
