package trimestre2.OrientadaAObjetos.Herencia.ProyectoTrabajadores;

public class Empleado {
    private String nombre;

    public Empleado(String nombre){
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
        return "Trabajador: "+getNombre();
    }
}
