package InterfazComparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Ejercicio2 {
    public static void main(String[] args) throws IOException {
        List<Integer>cantidad=new ArrayList<>();
        BufferedReader read = new BufferedReader(new FileReader("/home/alemirram3/Escritorio/illiterate.csv"));
        String line = read.readLine();
        while((line = read.readLine())!=null){
            String[] lineas = line.split(",");
            String lin = lineas[8];
            cantidad.add(Integer.parseInt(lin));
        }
        Collections.sort(cantidad);
        cantidad.stream().forEach(System.out::println);


    }
}
