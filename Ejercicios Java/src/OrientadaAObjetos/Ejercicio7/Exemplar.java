package OrientadaAObjetos.Ejercicio7;

public class Exemplar {
    private int n_reg;
    private Llibre llibre;
    private Lector lector;

    Exemplar(int n_reg,Llibre llibre, Lector lector){
        this.n_reg=n_reg;
        this.llibre=llibre;
        this.lector=lector;
    }

    public int getN_reg() {
        return n_reg;
    }

    public String toString() {
        return "Exemplar: "+getN_reg();
    }

}
