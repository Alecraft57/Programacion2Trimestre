package trimestre2.OrientadaAObjetos.EntidadRelacio.Ejercicio7;

public class Biblioteca {
    public static void main(String[] args) {
        Autor autor1=new Autor(203);
        Tema tema1=new Tema(20);
        Editorial editorial1=new Editorial(213);
        Llibre llibre1=new Llibre(2,tema1,editorial1);
        Lector lector1=new Lector("2053543J",20,23);
        Exemplar exemplar1=new Exemplar(3,llibre1,lector1);
        System.out.println(autor1);
        System.out.println(tema1);
        System.out.println(editorial1);
        System.out.println(llibre1);
        System.out.println(lector1);
    }
}
