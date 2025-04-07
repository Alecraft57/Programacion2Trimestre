package trimestre2.OrientadaAObjetos.Herencia.Biblioteca;

public class Digital extends Libros{

    public Digital(String nombre,String autor,int numPag,boolean alquilado){
        super(nombre,autor,numPag,alquilado);
    }

    @Override
     public String toString() {
        return "Este es el libro digital de "+getAutor()+", se llama "+getNombre()+"\nCantidad de Paginas: "
                +getNumPag()+"\nEsta alquilado?: "+estaAlquilado()+"\nComentarios del libro: "+getComentarios();
    }
}
