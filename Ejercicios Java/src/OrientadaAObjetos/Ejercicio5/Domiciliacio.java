package OrientadaAObjetos.Ejercicio5;

public class Domiciliacio {
    private int numdom;

    Domiciliacio(int numdom){
        this.numdom=numdom;
    }
    public int getNumdom() {
        return numdom;
    }
    public String toString(){
        return "NºDomiciliacio: "+getNumdom();
    }
}
