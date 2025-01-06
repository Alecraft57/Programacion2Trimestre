package Examendel16deEnero.Estructurabasica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TelefonosII {
    public static void main(String[] args) {

        Map<String,ArrayList<String>> guianum=new HashMap<>();

        ArrayList<String> telefonos=new ArrayList<>();

        telefonos.add("123-454");
        telefonos.add("435-654");
        guianum.put("Juan",telefonos);

        telefonos=new ArrayList<>();
        telefonos.add("435-877");
        guianum.put("Alejandro",telefonos);

//        telefonos=new ArrayList<>();
//        telefonos.add("354-767");
//        guianum.put("Maria",telefonos);

        PersonaElegida(guianum,telefonos);
    }

    public static void PersonaElegida(Map<String, ArrayList<String>> guianum, ArrayList<String>telefonos) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un contacto");
        String contacto=sc.nextLine();
        if(guianum.containsKey(contacto)){
            System.out.println("Juan tiene los numeros: "+guianum.get(contacto));
        }
    }
}
