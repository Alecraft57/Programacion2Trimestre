package trimestre2.Examendel16deEnero.InterfazComparable;

public class objetostutankamon {
    private String nombre;
    private int valorhistorico;
    private int peso;

    public objetostutankamon(String nombre,int valorhistorico,int peso){
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
