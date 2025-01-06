package VueltadeVacaciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Coches {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> coches=new ArrayList<>();
        System.out.println("Dime marcas de coches");
        while(true){
            String marcas = sc.nextLine();
            if(marcas.isEmpty()){
                break;
            }
            coches.add(marcas);
        }
        Collections.sort(coches);
        for(String marca:coches){
            System.out.println(marca);
        }
        }
    }

