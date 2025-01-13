package VueltadeVacaciones.Estructurabasica.Repetir;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<personas>person=new ArrayList<>();
        person.add(new personas("Alejandro","Miralles",1970));
        person.add(new personas("Juan","Arcangel",1982));
        person.add(new personas("Maria","Arnau",1960));

        long empiezapora = person.stream()
                .filter(letra->letra.getApellido().startsWith("A"))
                .count();
        System.out.println(empiezapora);
    }
}
