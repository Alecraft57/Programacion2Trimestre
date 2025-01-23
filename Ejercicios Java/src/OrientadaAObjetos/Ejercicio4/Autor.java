package OrientadaAObjetos.Ejercicio4;

public class Autor {
    private String nombre;
    private String fecha;

    Autor(String nombre,String fecha){
        this.nombre=nombre;
        this.fecha=fecha;
    }
    public String getNombre(){
        return nombre;
    }
    public String getFecha(){
        return fecha;
    }
    public String toString(){
        return "Autor: "+getNombre()+", nacio en "+getFecha();
    }
}
