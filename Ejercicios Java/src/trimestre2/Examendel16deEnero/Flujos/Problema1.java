package trimestre2.Examendel16deEnero.Flujos;


import java.util.ArrayList;
import java.util.List;

public class Problema1 {
    public static void main(String[] args) {
        List<Person> personas = new ArrayList<>();
        personas.add(new Person("Alejandro","Miralles",1980));
        personas.add(new Person("Maria","Aiza",1969));
        personas.add(new Person("Alejandro","Antia",1968));
//        for(int i=0;i<personas.size();i++){
//            System.out.println(personas.get(i));
//        }
        long cont = personas.stream()
                .filter(pers -> pers.getBirthYear() >= 1970)
                .count();
        System.out.println("Hay "+cont+" personas con nacidas en 1970 hacia delante");
    }
}