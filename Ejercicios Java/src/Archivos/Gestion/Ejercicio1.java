package Archivos.Gestion;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File currentDirectory = new File("/");

        while (true) {
            imprimirDirectorio(currentDirectory);
            System.out.print("Introduce una opción (-1 para salir): ");
            int option = Integer.parseInt(reader.readLine());

            if (option == -1) {
                break;
            } else if (option == 0) {
                currentDirectory = currentDirectory.getParentFile();
            } else {
                File[] files = currentDirectory.listFiles();
                if (files != null && option > 0) {
                    File selected = files[option - 1];
                    if (selected.isDirectory() && selected.canRead()) {
                        currentDirectory = selected;
                    } else {
                        System.out.println("No se puede acceder al archivo o directorio.");
                    }
                } else {
                    System.out.println("Opción no válida.");
                }
            }
        }
    }

    private static void imprimirDirectorio(File f) throws IOException {
        if (f.exists() && f.isDirectory()) {
            System.out.println("Lista de ficheros y directorios del directorio: " + f.getCanonicalPath());
            System.out.println("---------------------------------------------------");
            File[] files = f.listFiles();
            if (f.getParentFile() != null) {
                System.out.println("0.- Directorio padre");
            }
            if (files != null) {
                for (int i = 0; i < files.length; i++) {
                    imprimirFichero(files[i],i+1);
                }
            }
        } else {
            System.out.println("No existe el directorio");
        }
    }

    private static void imprimirFichero(File e,int num) {
        if (!e.isHidden()) {
            if (e.isFile()) {

                System.out.println(num+ "."+e.getName() + " " + e.length());
            }
            if (e.isDirectory()){
                System.out.println(num+ "."+e.getName() + " <Directorio>");
            }
        }
    }
}
