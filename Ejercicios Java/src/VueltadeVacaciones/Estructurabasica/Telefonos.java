package VueltadeVacaciones.Estructurabasica;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefonos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String, String>guia=new HashMap<>();
        guia.put("Alejandro","233-432");
        guia.put("Maria","543-546");
        guia.put("Juan","432-434");

        System.out.println("Dime un contacto");
        String contacto=sc.nextLine();
        System.out.println(guia.getOrDefault(contacto,"No existe el contacto"));
    }
}
