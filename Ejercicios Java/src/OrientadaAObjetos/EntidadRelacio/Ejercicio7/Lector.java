package OrientadaAObjetos.EntidadRelacio.Ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Lector {
    private String dni;
    private int data_p;
    private int data_t;
    private Set<Exemplar>exemplars;

    Lector(String dni,int data_p, int data_t){
        this.dni=dni;
        this.data_p=data_p;
        this.data_t=data_t;
        this.exemplars=new HashSet<>();
    }

    public String getDni() {
        return dni;
    }

    public void addExemplar(Exemplar exemplar){
        this.exemplars.add(exemplar);
    }
    public String toString() {
        return "DNI: "+getDni();
    }


}
