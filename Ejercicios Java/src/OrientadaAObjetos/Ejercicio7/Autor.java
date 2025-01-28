package OrientadaAObjetos.Ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Autor {
    private int cod_autor;
    private Set<Llibre>llibres;

    Autor(int cod_autor){
        this.cod_autor=cod_autor;
        this.llibres=new HashSet<>();
    }
    public int getCod_autor(){
        return cod_autor;
    }
    public void addLlibre(Llibre llibre){
        this.llibres.add(llibre);
    }
    public String toString() {
        return "Codigo Autor: "+getCod_autor();
    }
}
