package OrientadaAObjetos.Herencia.ProyectoNetwork;

import java.util.ArrayList;

public class Fotografia extends Publicacion {
    private String imagen;

    public Fotografia(int ID, String titulo, String autor,String imagen) {
        super(ID, titulo, autor);
        this.imagen=imagen;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Titulo: "+getTitulo()+"\nLa imagen: "+getImagen()+" de "+getAutor()+"\nTiene "+getLikes()+" like\nComentarios: "+getComents();
    }
}
