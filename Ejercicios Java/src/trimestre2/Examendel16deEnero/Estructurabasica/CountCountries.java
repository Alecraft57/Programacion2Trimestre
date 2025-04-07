package trimestre2.Examendel16deEnero.Estructurabasica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CountCountries {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Dime un pais");
//        String paiselegido = sc.nextLine();
        String paiselegido="España";
        System.out.println(CountCountries());
        System.out.println(CountCountries().get(paiselegido));

    }
    public static Map<String,Integer>CountCountries()throws IOException{
        Map<String, Integer>map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader("/home/alemirram3/Escritorio/Colfuturo-Seleccionados.csv"));
        String line;
        while ((line = reader.readLine()) != null) {
            //Trabajar con line
            String[] datos = line.split(",");
            String pais = datos[6].trim(); // Campo 7 es el país
            // Actualizar el conteo para el país utilizando la lógica solicitada
            Integer freq = map.get(pais);
            if (freq == null)
                map.put(pais, 1);
            else
                map.put(pais, freq + 1);
        }
        reader.close();
//Cogemos el campo 7 de la línea
        return map;
    }
}
