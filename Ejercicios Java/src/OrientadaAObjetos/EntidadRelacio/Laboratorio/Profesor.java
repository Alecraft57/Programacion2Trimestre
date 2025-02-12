package OrientadaAObjetos.EntidadRelacio.Laboratorio;

public class Profesor extends Personas {
    private Personas personas;
    private Lab imparte;

    public Profesor(Personas personas){
        super(personas.getNombre());
        this.personas=personas;
    }

    public Personas getPersonas() {
        return personas;
    }

    public void setPersonas(Personas personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return "\nNombre: "+getPersonas();
    }
}
