package VueltadeVacaciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frecuency {
    public static void main(String[] args) {
        String num="";
        Scanner sc=new Scanner(System.in);
        ArrayList<String>numeros=new ArrayList<>();
        System.out.println("Dime numeros");
        while(true){
            num= sc.nextLine();
            if(num.isEmpty()){
                break;
            }
            numeros.add(num);
        }
        System.out.println(NumRep(numeros));
    }
    public static Map<String,Integer> NumRep(ArrayList<String>numeros){
        Map<String,Integer>repeticiones=new HashMap<>();
        for(String nums:numeros){
            repeticiones.put(nums,repeticiones.getOrDefault(nums,0)+1);
        }
        return repeticiones;
    }
}
