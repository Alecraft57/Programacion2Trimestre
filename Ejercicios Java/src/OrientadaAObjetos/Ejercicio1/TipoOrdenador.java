package OrientadaAObjetos.Ejercicio1;

public class TipoOrdenador {
    private String CPU;
    private int cantidadRam;
    private int espacio;

    TipoOrdenador(String CPU, int cantidadRam,int espacio){
        this.CPU=CPU;
        this.cantidadRam=cantidadRam;
        this.espacio=espacio;
    }
    public String getCPU(){
        return CPU;
    }
    public int getCantidadRam(){
        return cantidadRam;
    }
    public int getEspacio(){
        return espacio;
    }
    public String toString(){
        return getCPU()+ ", " + getCantidadRam()+" de RAM, "+getEspacio()+" de almacenamiento";
    }
}
