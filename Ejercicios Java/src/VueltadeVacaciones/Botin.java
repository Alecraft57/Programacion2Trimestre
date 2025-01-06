package VueltadeVacaciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Botin {
    public static void main(String[] args) {
    int participantes=3;
    int[]botin={10, 20, 50, 200, 500};
        System.out.println(RepartodeBotin(participantes,botin));
    }
    public static Map<Integer,ArrayList<Integer>> RepartodeBotin(int participantes,int[]botin){
        Map<Integer, ArrayList<Integer>>botinrepartido=new HashMap<>();
        for(int i=0;i<participantes;i++){
            botinrepartido.put(i,new ArrayList<>());
        }
        for(int i=0;i<botin.length;i++){
            botinrepartido.get(i%participantes).add(botin[i]);
        }
        return botinrepartido;
    }
}
