package Estructurabasica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class botin {
    public static void main(String[] args) {
        int participantes=2;
        int[] billetes = {10, 20, 50, 200, 500};
        System.out.println(RepartoDeBotin(participantes,billetes));
    }
    public static Map<Integer,ArrayList<Integer>> RepartoDeBotin(int participantes,int[]billetes){
        Map<Integer,ArrayList<Integer>>Partybotin=new HashMap<>();
        for (int i = 0; i < participantes; i++) {
            Partybotin.put(i, new ArrayList<>());
        }
        for(int i=0;i<billetes.length;i++){
            int participantesreparto=i%participantes;
            Partybotin.get(participantesreparto).add(billetes[i]);
        }
        return Partybotin;
    }
}