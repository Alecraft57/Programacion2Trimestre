package trimestre2.Examendel16deEnero.Flujos;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<Person> personas = new ArrayList<>();
        personas.add(new Person("Alejandro","Miralles",1980));
        personas.add(new Person("Maria","Aiza",1969));
        personas.add(new Person("Juan","Antia",1968));
        List<String> unicos = personas.stream()
                .map(Person::getLastName)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(unicos);
    }

}
