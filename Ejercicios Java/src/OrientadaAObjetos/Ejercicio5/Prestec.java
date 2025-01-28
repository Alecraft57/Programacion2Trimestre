package OrientadaAObjetos.Ejercicio5;

public class Prestec {
    private int numpre;
    private Sucursal sucursal;
    private Client client;

    Prestec(int numpre,Sucursal sucursal,Client client){
        this.numpre=numpre;
        this.sucursal= sucursal;
        this.client=client;
    }

    public int getNumpre() {
        return numpre;
    }
    @Override
    public String toString(){
        return "NºPrestec: "+getNumpre();
    }
}
