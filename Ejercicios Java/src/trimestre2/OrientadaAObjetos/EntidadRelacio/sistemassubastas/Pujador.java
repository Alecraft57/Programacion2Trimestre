package trimestre2.OrientadaAObjetos.EntidadRelacio.sistemassubastas;

public class Pujador {
    private String nombre;
    private int lote;

    public Pujador(String nombre,int lote){
        this.nombre=nombre;
        this.lote=lote;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    @Override
    public String toString() {
        return "el pujador: "+getNombre();
    }
}
