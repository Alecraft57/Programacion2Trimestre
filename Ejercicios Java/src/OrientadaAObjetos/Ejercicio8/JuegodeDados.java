package OrientadaAObjetos.Ejercicio8;

public class JuegodeDados {
    public static void main(String[] args) {
        Dado primerdado = new Dado();
        Dado segundodado = new Dado();
        Dado tercerdado = new Dado();

        int contador = 0;

        String total1=" ";
        String total2=" ";
        do {
            primerdado.roll();
            total1 = primerdado.dado1+"-"+primerdado.dado2+"-"+primerdado.dado3;
            System.out.println(total1);
//            segundodado.roll();
//            total2 = segundodado.dado1+"-"+segundodado.dado2+"-"+segundodado.dado3;
//            System.out.println(total2);
            contador++;
        } while (primerdado.dado1!= primerdado.dado2 || primerdado.dado2!= primerdado.dado3);
        System.out.println("Han coincidido en "+contador+" tiradas");

    }
}
