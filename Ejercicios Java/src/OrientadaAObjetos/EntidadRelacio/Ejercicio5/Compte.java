package OrientadaAObjetos.EntidadRelacio.Ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class Compte {
    private int numcc;
    private Sucursal sucursal;
    private Set<Client>clients;
    private Set<Domiciliacio> domiciliacions;

    Compte(int numcc,Sucursal sucursal){
        this.numcc=numcc;
        this.sucursal=sucursal;
        this.clients=new HashSet<>();
        this.domiciliacions=new HashSet<>();
    }
    public int getNumcc() {
        return numcc;
    }
    public void addClient(Client client){
        this.clients.add(client);
    }

    public void addDomiciliacio(Domiciliacio domiciliacio){
        this.domiciliacions.add(domiciliacio);
    }
    @Override
    public String toString(){
        return "NºCompte: "+getNumcc();
    }

}
