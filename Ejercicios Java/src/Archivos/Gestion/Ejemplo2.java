package Archivos.Gestion;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejemplo2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Introduce un directorio:");
//            String ent = new BufferedReader(new InputStreamReader(System.in)).readLine();
        File dir = new File("/home/alemirram3/");
        File f = new File(dir, ".");
        System.out.println("Lista de ficheros y directorios del directorio: ");
        System.out.println("---------------------------------------------------");
        for (String e : f.list()) {
            System.out.println(e);
        }
    }
}