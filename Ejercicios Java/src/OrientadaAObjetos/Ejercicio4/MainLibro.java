package OrientadaAObjetos.Ejercicio4;

public class MainLibro {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Juan","12-01-1979");
        Autor autor2 = new Autor("Maria","23-05-2000");
        Libro libro1 = new Libro("PelucasLocas",autor1.getNombre(),120);
        Libro libro2 = new Libro("XumeloEnterate",autor2.getNombre(),12323);
        Tema tema1 = new Tema("Peluca");
        Tema tema2 = new Tema("XumeloYaTocaEnterarse");
        System.out.println(autor1);
        System.out.println(autor2);

    }
}
