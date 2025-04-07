package JSON;
import java.io.Serializable;

public class Empleado implements Serializable {

    /**
     * Versión 1. serialVersionUID sirve para asegurarnos que serializamos/deserializamos
     * objetos de la misma versión (puede que entre versiones haya cambiado la signatura de la
     * clase y nos dé errores. Cuando cambia la signatura se debe modificar este valor
     */
    private static final long serialVersionUID = 1L;
    private int num=0;
    private String nombre=null;
    private int departamento=0;
    private double sueldo=0.0;


    public Empleado(int num, String nombre, int departamento, double sueldo){

        this.num = num;
        this.nombre = nombre;
        this.departamento = departamento;
        this.sueldo = sueldo;

    }

    public int getNum(){
        return this.num;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getDepartamento(){
        return this.departamento;
    }

    public double getSueldo(){
        return this.sueldo;
    }

    public void display() {
        
    }
}
