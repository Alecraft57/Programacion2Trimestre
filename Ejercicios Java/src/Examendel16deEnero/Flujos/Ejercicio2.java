package Examendel16deEnero.Flujos;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Person> personas = new ArrayList<>();
        personas.add(new Person("Alejandro","Miralles",1980));
        personas.add(new Person("Maria","Aiza",1969));
        personas.add(new Person("Alejandro","Antia",1968));
        long cont = personas.stream()
                .filter(pers -> pers.getLastName().substring(0).startsWith("A"))
                .count();
        System.out.println("Hay "+cont+" personas que su apellido empieza por la letra ");
    }
}
