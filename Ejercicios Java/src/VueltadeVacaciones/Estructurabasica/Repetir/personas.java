package VueltadeVacaciones.Estructurabasica.Repetir;

public class personas {
    private String nom;
    private String apellido;
    private int fecha;

    public personas(String nom,String apellido, int fecha){
        this.nom=nom;
        this.apellido=apellido;
        this.fecha=fecha;
    }
    public String getNom(){
        return this.nom;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getFecha(){
        return this.fecha;
    }
}
