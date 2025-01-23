package OrientadaAObjetos.Ejercicio5;

public class Prestec {
    private int numpre;

    Prestec(int numpre){
        this.numpre=numpre;
    }
    public int getNumpre() {
        return numpre;
    }
    public String toString(){
        return "NºPrestec: "+getNumpre();
    }
}
