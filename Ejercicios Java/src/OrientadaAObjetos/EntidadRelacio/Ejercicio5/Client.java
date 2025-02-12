package OrientadaAObjetos.EntidadRelacio.Ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class Client {
    private int DNI;
    private Set<Prestec>prestecs;
    private Set<Compte>comptes;

    Client(int DNI){
        this.DNI=DNI;
        this.prestecs=new HashSet<>();
        this.comptes=new HashSet<>();
    }
    public int getDNI() {
        return DNI;
    }
    public void Prestec(Prestec prestec){
        this.prestecs.add(prestec);
    }
    public void Comptes(Compte Compte){
        this.comptes.add(Compte);
    }
    @Override
    public String toString(){
        return "DNI: "+getDNI();
    }
}

