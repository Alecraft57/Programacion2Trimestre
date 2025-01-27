package OrientadaAObjetos.Ejercicio5;

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
    public String toString(){
        return "NºDomiciliacio: "+getNumdom();
    }
}
