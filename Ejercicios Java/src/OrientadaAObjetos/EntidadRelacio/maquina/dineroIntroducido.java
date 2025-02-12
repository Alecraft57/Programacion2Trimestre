package OrientadaAObjetos.EntidadRelacio.maquina;

public class dineroIntroducido {
    private double dinero;

    public dineroIntroducido(double dinero){
        this.dinero=dinero;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Dinero introducido: "+getDinero();
    }
}
