package OrientadaAObjetos.EntidadRelacio.Ejercicio5;

public class Domiciliacio {
    private int numdom;
    private Compte compte;
    Domiciliacio(int numdom,Compte compte){
        this.numdom=numdom;
        this.compte=compte;
    }
    public int getNumdom() {
        return numdom;
    }
    @Override
    public String toString(){
        return "NºDomiciliacio: "+getNumdom();
    }
}
