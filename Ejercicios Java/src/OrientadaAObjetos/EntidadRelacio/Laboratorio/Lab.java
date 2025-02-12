package OrientadaAObjetos.EntidadRelacio.Laboratorio;

import java.util.List;

public class Lab {
    private String nombre;
    private int taller;
    private int capacidad;
    private int hora;
    private int dia;
    private Profesor profesor;
    private List<Estudiantes>estudiantes;
    public Lab(String nombre,int taller, int capacidad, int hora,int dia, Profesor profesor,List<Estudiantes>estudiantes){
        this.nombre=nombre;
        this.taller=taller;
        this.capacidad=capacidad;
        this.hora=hora;
        this.dia=dia;
        this.profesor=profesor;
        this.estudiantes=estudiantes;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTaller() {
        return taller;
    }

    public void setTaller(int taller) {
        this.taller = taller;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Estudiantes> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiantes> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "Nombre: "+getNombre()+"\nTaller: "+getTaller()+"\nCapacidad: "+getCapacidad()+"\nHora: "+getHora()+"\nDia: "+getDia()+"\nProfesor: "+getProfesor()+"\nEstudiantes: "+getEstudiantes();
    }
}

