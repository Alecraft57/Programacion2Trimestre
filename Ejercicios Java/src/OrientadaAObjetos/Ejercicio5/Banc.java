package OrientadaAObjetos.Ejercicio5;

public class Banc {
    private int entidad;

    Banc(int entidad){
        this.entidad=entidad;
    }
    public int getEntidad() {
        return entidad;
    }

    @Override
    public String toString() {
        return "NºEntidad: "+getEntidad();
    }
}
