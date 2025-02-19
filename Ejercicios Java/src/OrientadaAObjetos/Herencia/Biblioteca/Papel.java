package OrientadaAObjetos.Herencia.Biblioteca;

public class Papel extends Libros {
    public Papel(String nombre,String autor,int numPag,boolean alquilado){
        super(nombre,autor,numPag,alquilado);
    }

    @Override
    public String toString() {
        return "Este es el libro fisico de "+getAutor()+", se llama "+getNombre()+"\nCantidad de Paginas: "
                +getNumPag()+"\nEsta alquilado?: "+estaAlquilado()+"\nComentarios del libro: "+getComentarios();
    }
}
