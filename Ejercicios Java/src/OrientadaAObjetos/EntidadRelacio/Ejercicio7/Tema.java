package OrientadaAObjetos.EntidadRelacio.Ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Tema {
    private int cod_t;
    private Set<Llibre>llibres;

    Tema(int cod_t){
        this.cod_t=cod_t;
        this.llibres=new HashSet<>();
    }
    public int getCod_t() {
        return cod_t;
    }
    public void addLlibre(Llibre llibre){
        this.llibres.add(llibre);
    }
    public String toString() {
        return "Codigo tema: "+getCod_t();
    }
}
