package OrientadaAObjetos.MetodosPrivados;

public class Libro {
    private String datos;
    private String autor;

    Libro(String datos, String autor){
        this.autor=autor;
        this.datos=datos;
    }

    public String getAutor() {
        return autor;
    }

    public String getDatos() {
        return datos;
    }

    @Override
    public String toString() {
        return "Autor: "+getAutor()+" | Datos: "+getDatos()+"\n";
    }
}
