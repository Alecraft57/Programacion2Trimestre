package OrientadaAObjetos.EntidadRelacio.Ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Llibre {
    private int isbn;
    private Set<Autor>autors;
    private Tema tema;
    private Editorial editorial;
    private Set<Exemplar>exemplars;
    private String aut;

    Llibre(int isbn,Tema tema,Editorial editorial){
        this.isbn=isbn;
        this.autors=new HashSet<>();
        this.tema=tema;
        this.editorial=editorial;
        this.exemplars=new HashSet<>();
    }

    public int getIsbn() {
        return isbn;
    }

    public void addAutor(Autor autor){
        this.autors.add(autor);
    }

    public void addExemplar(Exemplar exemplar){
        this.exemplars.add(exemplar);
    }

    public String toString() {
        return "ISBN: "+getIsbn();
    }

}
