package OrientadaAObjetos.EntidadRelacio.MetodosPrivados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String autor="Pardo Bazán, Emilia, Condesa de";
        String archivo = "/home/alemirram3/Escritorio/dataset_bvmc_20220325.csv";
        List<Libro> libros = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] datos = line.split("\",");
                    try {
                        if(datos.length==11) {
                            datos[7].replace(datos[7].charAt(0),' ');
                            System.out.println(datos[7]);//remplazar " por " "
                            libros.add(new Libro(datos[7], datos[5]));
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Error en la linea" + Arrays.toString(datos));
                    }
                }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + e.getMessage());
        }
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}
