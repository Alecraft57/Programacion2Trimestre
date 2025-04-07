package trimestre2.OrientadaAObjetos.EntidadRelacio.sistemassubastas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas subastas vas a hacer");
        int cantsub = sc.nextInt();
        for (int i = 0; i < cantsub; i++) {
            System.out.println("Cuantos lotes vas a hacer");
            int cantlot = sc.nextInt();
            int numlot = 1;
            for (int j = 0; j < cantlot; j++) {
                System.out.println("Dime el articulo");
                String art = sc.next();
                System.out.println("Dime el precio");
                int preu = sc.nextInt();
                System.out.println("Dime el articulo2");
                String art2 = sc.next();
                System.out.println("Dime el precio");
                int preu2 = sc.nextInt();
                Articulo1 articulo1 = new Articulo1(art, preu);
                Articulo1 articulo2 = new Articulo1(art2, preu2);
                sublot lote = new sublot(numlot++, articulo1, articulo2);
                lote.preuInicial();
                System.out.println(lote);
            }
            for (int h = 1; h <= cantlot; h++) {
                System.out.println("Pujas lote " + h + " : ");
                System.out.println("Pujador 1:");
                int cantpuj1 = sc.nextInt();
                System.out.println("Pujador 2:");
                int cantpuj2 = sc.nextInt();
                Pujador pujador1 = new Pujador("Alejandro", cantpuj1);
                Pujador pujador2 = new Pujador("Juan", cantpuj2);
                if (pujador1.getLote() > pujador2.getLote()) {
                    System.out.println("El lote " + h + " es para " + pujador1);
                } else {
                    System.out.println("El lote " + h + " es para: " + pujador2);
                }
            }


        }
    }
}
