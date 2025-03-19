package OrientadaAObjetos.Herencia.ProyectoNetwork;

import java.util.ArrayList;
import java.util.Scanner;

public class MotorApp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int cont;
        do {
            System.out.println("Dime q autor eres");
            String aut = sc.next();
            ArrayList<String> au = new ArrayList<>();
            sc.nextLine();
            System.out.println("Dime que tipo de publicacion quieres subir");
            System.out.println("1.FOTO       2.TEXTO");
            int tipopublicacion = sc.nextInt();
            if (tipopublicacion == 1) {


                //FOTOS
                //fotografia1
                Fotografia fotografia1 = new Fotografia(20, "Playa x Playa", aut, "playa.png");
//        fotografia1.setLikes(0);

                fotografia1.like();
                String coment1 = "Muy chula!!";
                fotografia1.comentarios(coment1);
                System.out.println(fotografia1);
                if (fotografia1.getAutor().equals(aut)) {
                    au.add(String.valueOf(fotografia1.getTitulo()));
                }
                System.out.println("------------------------------------------------------------------");
                //fotografia2
                Fotografia fotografia2 = new Fotografia(23, "Querida Alma Gemela", aut, "T_B.png");
//        fotografia2.setLikes(0);

                for (int i = 0; i < 20; i++) {
                    fotografia2.like();
                }
                String coment2 = "TOP1";
                String coment3 = "LO MEJOR DEL AÑO";
                fotografia2.comentarios(coment2);
                fotografia2.comentarios(coment3);
                System.out.println(fotografia2);
                System.out.println("Quieres darle like a la segunda publicacion?");
                String res = sc.next();
                if (res.equals("Si") || res.equals("si")) {
                    fotografia2.like();
                    System.out.println(fotografia2);
                } else if (res.equals("No") || res.equals("no")) {
                    System.out.println(fotografia2);
                } else {
                    throw new RuntimeException("La respuesta tiene que ser si o no");
                }
                if (fotografia2.getAutor().equals(aut)) {
                    au.add(String.valueOf(fotografia2.getTitulo()));
                }
                System.out.println("------------------------------------------------------------------");
                System.out.println("Publicaciones de " + aut + "\n" + au);
                System.out.println("------------------------------------------------------------------");
            } else if (tipopublicacion == 2) {
                //TEXTO
                //texto1
                PublicacionMensaje pM1 = new PublicacionMensaje(12, "A tope!!", aut , "Estoy a tope jefe de equipo");
                for (int i = 0; i < 234; i++) {
                    pM1.like();
                }
                String comentpM1_1 = "GRANDE!!";
                String comentpM1_2 = "TOP1";
                String comentpM1_3 = "LO MEJOR DEL AÑO";
                pM1.comentarios(comentpM1_1);
                pM1.comentarios(comentpM1_2);
                pM1.comentarios(comentpM1_3);
                System.out.println(pM1);
                System.out.println("Quieres darle like a la publicacion?");
                String res = sc.next();
                if (res.equals("Si") || res.equals("si")) {
                    pM1.like();
                    System.out.println(pM1);
                } else if (res.equals("No") || res.equals("no")) {
                    System.out.println(pM1);
                } else {
                    throw new RuntimeException("La respuesta tiene que ser si o no");
                }
            } else {
                throw new RuntimeException("Debe ser o el 1 o el 2");
            }
            sc.nextLine();
            System.out.println("Quieres continuar haciendo cosas?");
            cont=sc.nextInt();
        }while(cont!=2);
    }
}

