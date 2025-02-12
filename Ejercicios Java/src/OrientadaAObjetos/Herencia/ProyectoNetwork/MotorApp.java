package OrientadaAObjetos.Herencia.ProyectoNetwork;

public class MotorApp {
    private int ID;
    private String titulo;
    private String autor;

    public MotorApp(int ID, String titulo,String autor){
        this.ID=ID;
        this.titulo=titulo;
        this.autor=autor;
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

//    public void Busqueda(String aut){
//        if(aut.equals(autor)){
//            System.out.println(Publicacion);
//        }
//    }
}
