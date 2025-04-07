package trimestre2.OrientadaAObjetos.Herencia.ProyectoNetwork;

import java.util.ArrayList;

public class Publicacion {

    private int ID;
    private String titulo;
    private String autor;
    private int likes;
    private ArrayList<String> coments=new ArrayList<>();

    public Publicacion(int ID, String titulo, String autor) {
        this.ID = ID;
        this.titulo = titulo;
        this.autor = autor;
        setLikes(0);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void like(){
        likes++;
    }

    public ArrayList<String> getComents() {
        return coments;
    }

    public void setComents(ArrayList<String> coments) {
        this.coments = coments;
    }

    public void comentarios(String comentario){
        coments.add(comentario);
    }
}

