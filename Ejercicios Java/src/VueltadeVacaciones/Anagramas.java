package VueltadeVacaciones;

import com.sun.security.jgss.GSSUtil;

import java.io.*;
import java.util.*;

public class Anagramas {
    public static void main(String[] args) throws IOException {
        Map<String, ArrayList<String>> anagramGroups = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader("C:/Users/aleja/Desktop/spanish-dict.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            //Trabajar con line
            String alfabetizadas = alphabetize(line+"\n");
            anagramGroups.putIfAbsent(alfabetizadas, new ArrayList<>());
            anagramGroups.get(alfabetizadas).add(line);
        }
        reader.close();
        System.out.println(anagramGroups);
    }
    private static String alphabetize(String line) {
        char[] a = line.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}


