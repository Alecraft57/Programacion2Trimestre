package OrientadaAObjetos.Laboratorio;

public class Estudiantes extends Personas {
    private String nombre;

    public Estudiantes(String nombre){
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
        return "\n"+getNombre();
    }
}
