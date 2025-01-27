package OrientadaAObjetos.Ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class Banc {
    private int entidad;
    private Set<Sucursal> sucursales;

    Banc(int entidad){
        this.entidad=entidad;
        this.sucursales=new HashSet<>();
    }
    public int getEntidad() {
        return entidad;
    }
    public void addSucursal(Sucursal sucursal){
        this.sucursales.add(sucursal);
    }
    @Override
    public String toString() {
        return " "+getEntidad();
    }
}
