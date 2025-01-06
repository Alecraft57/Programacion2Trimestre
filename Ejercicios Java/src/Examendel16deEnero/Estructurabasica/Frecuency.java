package Examendel16deEnero.Estructurabasica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Frecuency {
    public static void main(String[] args) {
        ArrayList<String>numeros=new ArrayList<>();
        numeros.add("uno");
        numeros.add("dos");
        numeros.add("dos");
        System.out.println(NumerosCont(numeros));
    }
    public static Map<String,Integer>NumerosCont(ArrayList<String>numeros){
        Map<String,Integer>nums=new HashMap<>();
        for(String numerines:numeros){
            nums.put(numerines,nums.getOrDefault(numerines,0)+1);
        }
        return nums;
    }
}
