package VueltadeVacaciones.Estructurabasica.Repetir;

import java.util.ArrayList;
public class Problema1 {
    public static void main(String[] args) {
        ArrayList<personas>person=new ArrayList<>();
        person.add(new personas("Alejandro","Miralles",1974));
        person.add(new personas("Juan","Ortiz",1969));
        person.add(new personas("Marta","Arnau",1982));

        long mayor = person.stream()
                .filter(edad->edad.getFecha() >= 1970)
                .count();
        System.out.println(mayor);
    }
}
