package VueltadeVacaciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TelefonosII {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<Object, ArrayList<String>> guia =new HashMap<>();
        ArrayList<String>telefonos = new ArrayList<>();
        telefonos.add("345-434");
        telefonos.add("343-453");
        guia.put("Juan",telefonos);

        telefonos=new ArrayList<>();
        telefonos.add("232-535");
        telefonos.add("675-431");
        guia.put("Alejandro",telefonos);

        System.out.println("Dime un contacto");
        String contacto= sc.nextLine();
        if(guia.containsKey(contacto)){
            System.out.println("El contacto tiene estos numeros= "+guia.get(contacto));
        }else{
            System.out.println("El contacto no existe");
        }

    }
}
