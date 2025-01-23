package OrientadaAObjetos.Ejercicio5;

public class CliCom {
    private int priv;

    CliCom(int priv){
        this.priv=priv;
    }

    public int getPriv() {
        return priv;
    }
    public String toString(){
        return "Priv: "+getPriv();
    }
}
