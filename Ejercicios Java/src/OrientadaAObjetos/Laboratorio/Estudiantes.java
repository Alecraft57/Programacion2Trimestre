package OrientadaAObjetos.Laboratorio;

public class Estudiantes extends Personas {
    private Personas personas;

    public Estudiantes(Personas personas){
            super(personas.getNombre());
            this.personas=personas;
        }

    public Personas getPersonas() {
        return personas;
    }

    public void setNombre(String nombre) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return "\n"+getPersonas();
    }
}
