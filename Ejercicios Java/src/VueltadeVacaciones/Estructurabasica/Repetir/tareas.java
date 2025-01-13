package VueltadeVacaciones.Estructurabasica.Repetir;

public class tareas {
    private int prioridad;
    private int duracion;

    public tareas(int prioridad, int duracion) {
        this.prioridad= prioridad;
        this.duracion= duracion;
    }

    public int getPrioridad() {
        return prioridad;
    }
    public int getDuracion(){
        return duracion;
    }
}

