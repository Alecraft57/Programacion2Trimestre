package OrientadaAObjetos.Herencia.ProyectoNetwork;

public abstract class Fotografia extends Publicacion {

    public Fotografia(int ID, String titulo, String autor) {
        super(ID, titulo, autor);
    }

    public void fotografia(){
        System.out.println("");
    }
}
