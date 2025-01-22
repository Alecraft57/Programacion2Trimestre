package OrientadaAObjetos.Ejercicio3;

public class Cuenta {
    private String titular;
    private double cantidad;

    Cuenta(String titular,double cantidad){
        this.titular=titular;
        this.cantidad=cantidad;
    }
    public String getTitular(){
        return titular;
    }
    public double getCantidad(){
        return cantidad;
    }
    public void setCantidad(double cantidad) {
            this.cantidad = cantidad;
    }
    public void ingresar(double ingresos){
        if(ingresos>0)
            this.cantidad+=ingresos;
    }
    public void retirar() {
        double ret=getCantidad();
        if (ret - cantidad < 0) {
            ret = 0;
        } else
            ret -= getCantidad();
    }
    public String toString(){
        return "Eres "+titular+" y tienes "+cantidad;
    }
}
