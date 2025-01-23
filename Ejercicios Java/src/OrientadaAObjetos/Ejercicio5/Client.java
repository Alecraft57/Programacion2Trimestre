package OrientadaAObjetos.Ejercicio5;

public class Client {
    private int DNI;

    Client(int DNI){
        this.DNI=DNI;
    }
    public int getDNI() {
        return DNI;
    }
    public String toString(){
        return "DNI: "+getDNI();
    }
}

