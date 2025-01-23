package OrientadaAObjetos.Ejercicio5;

public class Compte {
    private int numcc;

    Compte(int numcc){
        this.numcc=numcc;
    }
    public int getNumcc() {
        return numcc;
    }
    public String toString(){
        return "NºCompte: "+getNumcc();
    }
}
