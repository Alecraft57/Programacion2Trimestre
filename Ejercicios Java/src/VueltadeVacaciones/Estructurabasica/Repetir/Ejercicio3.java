package VueltadeVacaciones.Estructurabasica.Repetir;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio3 {
    public static void main(String[] args) {
        LinkedList<personas>person=new LinkedList<>();
        person.add(new personas("Alejandro","Miralles",1970));
        person.add(new personas("Juan","Arnau",1982));
        person.add(new personas("Juan","Arnau",1960));

        List<String> per = person.stream()
                .map(personas::getApellido)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(per);
    }
}
