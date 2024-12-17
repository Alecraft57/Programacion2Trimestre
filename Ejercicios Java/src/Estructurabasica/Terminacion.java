package Estructurabasica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Terminacion {
    public static void main(String[] args) {
        ArrayList<String>loterias=new ArrayList<>();
        loterias.add("00004");
        loterias.add("03847");
        loterias.add("39804");
        NumeroGanador(loterias);
    }
    public static void NumeroGanador(ArrayList<String>loterias) {
        Map<Integer,Integer>contadorrepetidos=new HashMap<>();
        for (String loteria : loterias) {
            int terminacion = Character.getNumericValue(loteria.charAt(loteria.length() - 1));
            contadorrepetidos.put(terminacion,contadorrepetidos.getOrDefault(terminacion,0)+1);
        }
        System.out.println(contadorrepetidos);
    }
}
