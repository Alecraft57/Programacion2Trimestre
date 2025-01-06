package VueltadeVacaciones.Estructurabasica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Terminacion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String>Boletos=new ArrayList<>();
        Boletos.add("00004");
        Boletos.add("08437");
        Boletos.add("39804");
        BoletosRepetidos(Boletos);

    }
    public static void BoletosRepetidos(ArrayList<String>Boletos){
        Map<Integer,Integer>boletosrep=new HashMap<>();
        for(String boleto:Boletos){
            int terminacion=Character.getNumericValue(boleto.charAt(boleto.length()-1));
            boletosrep.put(terminacion,boletosrep.getOrDefault(terminacion,0)+1);
        }
        System.out.println(boletosrep);
    }
}
