package OrientadaAObjetos.Ejercicio5;

public class Sucursal {
    private int numsuc;

    Sucursal(int numsuc){
        this.numsuc=numsuc;
    }

    public int getNumsuc() {
        return numsuc;
    }
    public String toString(){
        return "NºSucursal: "+getNumsuc();
    }
}
