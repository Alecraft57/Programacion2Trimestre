package trimestre2.OrientadaAObjetos.EntidadRelacio.Laboratorio;

public class Personas {
    private String nombre;

    public Personas(String nombre) {
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
        return "Nombre: "+getNombre();
    }
}
