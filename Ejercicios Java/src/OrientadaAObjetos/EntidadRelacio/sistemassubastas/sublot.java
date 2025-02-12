package OrientadaAObjetos.EntidadRelacio.sistemassubastas;
public class sublot {
    private int numero;
    private int preuin;
    private Articulo1 articulo1; // Referencia al primer artículo
    private Articulo1 articulo2;

    public sublot(int numero, Articulo1 articulo1,Articulo1 articulo2) {
        this.numero = numero;
        this.articulo1 = articulo1;
        this.articulo2 = articulo2;
        this.preuin = 0;
    }

    public void preuInicial() {
        this.preuin = articulo1.getPrecio() + articulo2.getPrecio();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPreuin() {
        return preuin;
    }

    public void setPreuin(int preuin) {
        this.preuin = preuin;
    }

    @Override
    public String toString() {
        return "Numero de lote: " + getNumero() + "\nPrecio inicial: " + getPreuin();
    }
}