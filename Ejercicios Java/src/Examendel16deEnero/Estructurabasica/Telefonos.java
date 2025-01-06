package Examendel16deEnero.Estructurabasica;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefonos {
    public static void main(String[] args) {
        Map<String,String>guianum=new HashMap<>();
        guianum.put("Juan","123-454");
        guianum.put("Alejandro","234-564");
        guianum.put("Maria","354-767");
        PersonaElegida(guianum);
    }
    public static void PersonaElegida(Map<String,String>guianum){
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un contacto y te digo su numero");
        String contacto=sc.nextLine();
        if(guianum.containsKey(contacto)){
            System.out.println("El numero de telefono de "+contacto+" es "+guianum.get(contacto));
        }else{
            System.out.println("El contacto "+contacto+" no existe");
        }
    }
}
