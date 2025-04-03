package Archivos.Gestion;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.util.Locale;

public class Ejercicio2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File directorio = new File("/");

        while (true) {
            imprimirDirectorio(directorio);
            System.out.print("Introduce una opción \n0 Acceder\n-1 Para salir\n-2 Para cambiar permisos\n-3 Contar por extension\n-4 Mostrar ruta del archivo:\n-5 Crear directorio\n-6 Borrar archivo/directorio\n ");

            int opcion = Integer.parseInt(reader.readLine());

            if (opcion == -1) {
                break;
            }else if(opcion == -2) {
                System.out.println("Dime el archivo/directorio(el numero)");
                int res=Integer.parseInt(reader.readLine());
                File[] files = directorio.listFiles();
                File elegido = files[res - 1];
                System.out.println("Dime que permiso quieres cambiar");
                String per = reader.readLine();
                if (per.equals("r")) {
                    elegido.setReadable(false);
                } else if (!per.equals("r")){
                    elegido.setReadable(true);
                }
                if (per.equals("w")) {
                    elegido.setReadable(false);
                } else if (!per.equals("w")){
                    elegido.setReadable(true);
                }
                if (per.equals("x")) {
                    elegido.setReadable(false);
                } else if (!per.equals("x")){
                    elegido.setReadable(true);
                }
            }else if(opcion==-3){
                File[] files = directorio.listFiles();
                System.out.println("Dime que extension quieres contar");
                String res= reader.readLine();
                int cant_ext=0;
                for(int i=0;i<files.length;i++){
                    if(files[i].getName().endsWith(res)){
                        cant_ext++;
                    }
                }
                System.out.println("Hay "+cant_ext+ " archivos con esta extension");

            }else if(opcion == -4){
                File[] files = directorio.listFiles();
                System.out.println("Dime que archivo quieres ver");
                String res= reader.readLine();
                for(int i=0;i<files.length;i++){
                    if(files[i].getName().equals(res)){
                        System.out.println(files[i].getAbsolutePath());
                    }
                }
            }else if(opcion == -5){
                System.out.println("Dime el nombre del directorio que quieres crear");
                String res= reader.readLine();
                File nuevodirectorio=new File(directorio,res);
                if(nuevodirectorio.mkdir()){
                    System.out.println("Directorio "+res+" creado correctamente");
                }else{
                    System.out.println("Error al crear el directorio");
                }
            }else if(opcion == -6){
                System.out.println("Dime el nombre del directorio que quieres eliminar");
                String res= reader.readLine();
                File nuevodirectorio=new File(directorio,res);
                if(nuevodirectorio.delete()){
                    System.out.println("Directorio o archivo" +res+" eliminado correctamente");
                }else{
                    System.out.println("Error al eliminar el directorio/archivo");
                }
            }else if (opcion == 0) {
                directorio = directorio.getParentFile();
            } else {
                File[] files = directorio.listFiles();
                if (files != null && opcion > 0) {
                    File elegido = files[opcion - 1];
                    if (elegido.isDirectory() && elegido.canRead()) {
                        directorio = elegido;
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
            File[] ficheros = f.listFiles();
            if (f.getParentFile() != null) {
                System.out.println("0.- Directorio padre");
            }
            if (ficheros != null) {
                for (int i = 0; i < ficheros.length; i++) {
                    imprimirFichero(ficheros[i], i + 1);
                }
            }
        } else {
            System.out.println("No existe el directorio");
        }
    }

    private static void imprimirFichero(File e, int num) {
        DateFormat formatter;
        formatter = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, Locale.getDefault());
        if (!e.isHidden()) {
            if (e.isFile()) {
                String read;
                String write;
                String execute;
                if (e.canRead()) {
                    read = "r";
                } else {
                    read = "-";
                }
                if (e.canWrite()) {
                    write = "w";
                } else {
                    write = "-";
                }
                if (e.canRead()) {
                    execute = "x";
                } else {
                    execute = "-";
                }
                System.out.println(num + "." + e.getName() + "<Archivo> " + e.length() + "\t" + formatter.format(e.lastModified()) + " " + read + write + execute);
            }
        }
        if (e.isDirectory()) {
            String read;
            String write;
            String execute;
            if (e.canRead()) {
                read = "r";
            } else {
                read = "-";
            }
            if (e.canWrite()) {
                write = "w";
            } else {
                write = "-";
            }
            if (e.canRead()) {
                execute = "x";
            } else {
                execute = "-";
            }
            System.out.println(num + "." + e.getName() + " <Directorio>" + e.length() + "bytes\t" + formatter.format(e.lastModified()) + " " + read + write + execute);
        }
    }
}
