package OrientadaAObjetos.Herencia.Biblioteca;

import java.util.ArrayList;

public class Libros {
    private String nombre;
    private String autor;
    private int numPag;
    private boolean alquilado;
    private ArrayList<String>comentarios=new ArrayList<>();

    public Libros(String nombre, String autor, int numPag, boolean alquilado) {
        this.nombre = nombre;
        this.autor = autor;
        this.numPag = numPag;
        this.alquilado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<String> comentarios) {
        this.comentarios = comentarios;
    }

    public void alquilar() {
        if (alquilado) {
            System.out.println("Has alquilado el libro !!");
            this.alquilado = false;
        } else {
            System.out.println("El libro ya esta alquila, lo siento!!");
        }
    }

    public void devolver() {
        if (!alquilado) {
            System.out.println("Gracias por devolver el libro!!");
            this.alquilado = true;
        } else {
            System.out.println("El libro no esta alquilado, no lo puedes devolver");
        }
    }

    public String estaAlquilado() {
        String res;
        if (!alquilado) {
            return res = "Si";
        } else {
            return res = "No";
        }
    }
    public void comentarios(String comentario){
        comentarios.add(comentario);
    }
    @Override
    public String toString() {
        return "Este es el libro de "+getAutor()+", se llama "+getNombre()+"\nCantidad de Paginas: "
                +getNumPag()+"\nEsta alquilado?: "+estaAlquilado()+"\nComentarios del libro: "+getComentarios();
    }

}
