package OrientadaAObjetos.EntidadRelacio.Ejercicio4;

public class Tema {
    private String nomtema;

    Tema(String nomtema){
        this.nomtema=nomtema;
    }
    public String getNomtema(){
        return nomtema;
    }
    public String toString(){
        return "Nombre tema: "+getNomtema();
    }
}
