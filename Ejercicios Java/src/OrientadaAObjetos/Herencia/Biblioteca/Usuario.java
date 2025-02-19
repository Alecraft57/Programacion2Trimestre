package OrientadaAObjetos.Herencia.Biblioteca;

import java.util.ArrayList;

public class Usuario {
    private String nom;
    private ArrayList<String>Favoritos=new ArrayList<>();

    public Usuario(String nom){
        this.nom=nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<String> getFavoritos() {
        return Favoritos;
    }

    public void Favs(String libro){
        Favoritos.add(libro);
    }

    @Override
    public String toString() {
        return "Eres "+getNom()+"\nLibros favortios: "+getFavoritos();
    }
}
