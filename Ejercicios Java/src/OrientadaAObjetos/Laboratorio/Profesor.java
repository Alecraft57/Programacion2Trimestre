package OrientadaAObjetos.Laboratorio;

import java.util.List;

public class Profesor extends Personas {
    private String nombre;
    private Lab imparte;

    public Profesor(String nombre){
        super(nombre);
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "\nNombre: "+getNombre();
    }
}
