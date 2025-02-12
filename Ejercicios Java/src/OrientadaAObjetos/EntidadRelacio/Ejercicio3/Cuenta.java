package OrientadaAObjetos.EntidadRelacio.Ejercicio3;

public class Cuenta {
    private String titular;
    private double cantidad;

    Cuenta(String titular,double cantidad){
        this.titular=titular;
        this.cantidad=cantidad;
    }
    Cuenta(String titular){
        this(titular,0.0);
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
            cantidad+=ingresos;
    }
    public void retirar(double retirar) {
        if (cantidad - retirar < 0) {
            cantidad = 0;
        } else
            this.cantidad=cantidad-retirar;
    }
    public String toString(){
        return "Eres "+titular+" y tienes "+cantidad+"€ ";
    }
}
