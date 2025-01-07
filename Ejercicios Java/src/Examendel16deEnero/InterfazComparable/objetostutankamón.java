package Examendel16deEnero.InterfazComparable;

public class objetostutankamón {
    private String nombre;
    private int valorhistorico;
    private int peso;

    public objetostutankamón(String nombre,int valorhistorico,int peso){
        this.nombre=nombre;
        this.valorhistorico=valorhistorico;
        this.peso=peso;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getValorhistorico(){
        return this.valorhistorico;
    }
    public int getPeso(){
        return this.peso;
    }
}
