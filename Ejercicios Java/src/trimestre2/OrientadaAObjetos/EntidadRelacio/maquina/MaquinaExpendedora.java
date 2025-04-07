package trimestre2.OrientadaAObjetos.EntidadRelacio.maquina;

public class MaquinaExpendedora {
    private int tique;
    private int cerveza;
    private int sopa;


    public MaquinaExpendedora(int tique,int cerveza,int sopa){
        this.tique=tique;
        this.cerveza=cerveza;
        this.sopa=sopa;
    }
    public int getTique() {
        return tique;
    }

    public void setTique(int tique) {
        this.tique = tique;
    }

//    public ArrayList<Integer> getCajon() {
//        return cajon;
//    }
//
//    public void setCajon(ArrayList<Integer> cajon) {
//        this.cajon = cajon;
//    }


    public int getCerveza() {
        return cerveza;
    }

    public void setCerveza(int cerveza) {
        this.cerveza = cerveza;
    }

    public int getSopa() {
        return sopa;
    }

    public void setSopa(int sopa) {
        this.sopa = sopa;
    }

    public void Sacar(int dinero) {
        if (dinero < tique) {
            throw new ArithmeticException("El dinero es menor que lo que vale el tiquet");
        }
        int[] monedas = {200, 100, 50, 20, 10};
        int resto = dinero - tique;
        while (resto > 0) {
            for (int moneda : monedas) {
                if (resto >= moneda) {
                    int cantidad = resto / moneda;
                        resto %= moneda;
                    System.out.printf("Devolviendo " + cantidad + " moneda(s) de " + moneda + "\n");
                }
            }
        }
    }
    @Override
    public String toString() {
        return "Tique ingresado: "+getTique()+" || Cajon de tiquets :"+getCerveza()+" Cervezas || "+getSopa()+" sopas";
    }
}

