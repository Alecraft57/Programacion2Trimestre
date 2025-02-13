package OrientadaAObjetos.Herencia.ProyectoNetwork;

import java.util.ArrayList;

public class PublicacionMensaje extends Publicacion {
    private String mensaje;

    public PublicacionMensaje(int ID, String titulo, String autor,String mensaje) {
        super(ID, titulo, autor);
        this.mensaje=mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Titulo: "+getTitulo()+ "\nEl mensaje es: "+getMensaje()+" de "+getAutor()+"\nTiene "+getLikes()+" like\nComentarios: "+getComents();
    }

}
