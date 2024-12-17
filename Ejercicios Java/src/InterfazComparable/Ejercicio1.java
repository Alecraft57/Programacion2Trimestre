package InterfazComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<Human>personas=new ArrayList<>();
        personas.add(new Human("Alejandro",2000));
        personas.add(new Human("Maria",1300));
        personas.add(new Human("Juan",2600));
        Collections.sort(personas);
        //Sirve para mostrar el contenido en diferente orden
//        personas.stream().forEach(System.out::println);
        System.out.println(personas);
        System.out.println();

    }


}
