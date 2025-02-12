package OrientadaAObjetos.EntidadRelacio.Ejercicio5;

public class CliCom {
    private int priv;
    private Compte compte;
    private Client client;

    CliCom(int priv,Compte compte,Client client){
        this.priv=priv;
        this.compte=compte;
        this.client=client;
    }

    public int getPriv() {
        return priv;
    }
    public String toString(){
        return "Priv: "+getPriv();
    }
}
