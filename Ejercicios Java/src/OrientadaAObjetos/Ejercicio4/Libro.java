package OrientadaAObjetos.Ejercicio4;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;

    Libro(String titulo,String autor, int paginas){
        this.titulo=titulo;
        this.autor=autor;
        this.paginas=paginas;
    }
    public String getTitulo(){
        return titulo;
    }
    public String  getAutor(){
        return autor;
    }
    public int getPaginas(){
        return paginas;
    }
    public String toString(){
        return "Titulo: "+getTitulo()+", Autor: "+getAutor()+", Cantidad de paginas: "+getPaginas();
    }
}
