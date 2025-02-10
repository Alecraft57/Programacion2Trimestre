package OrientadaAObjetos.sistemassubastas;

public class Articulo1 {
    private String nombre;
    private int precio;

    public Articulo1(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
}

