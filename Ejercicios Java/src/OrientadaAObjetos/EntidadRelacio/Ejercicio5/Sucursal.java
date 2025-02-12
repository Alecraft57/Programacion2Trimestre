package OrientadaAObjetos.EntidadRelacio.Ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class Sucursal {
    private int numsuc;
    private Banc banc;
    private Set<Prestec> prestecs;
    private Set<Compte> comptes;

    Sucursal(int numsuc,Banc banc){
        this.numsuc=numsuc;
        this.banc=banc;
        this.prestecs=new HashSet<>();
        this.comptes=new HashSet<>();
    }

    public int getNumsuc() {
        return numsuc;
    }

    public void addPrestec(Prestec prestec){
        this.prestecs.add(prestec);
    }

    public void addCompte(Compte compte){
        this.comptes.add(compte);
    }
    @Override
    public String toString(){
        return "NºSucursal: "+getNumsuc();
    }
}
