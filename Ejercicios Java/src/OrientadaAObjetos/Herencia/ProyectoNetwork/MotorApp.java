package OrientadaAObjetos.Herencia.ProyectoNetwork;

import java.util.Scanner;

public class MotorApp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Dime que tipo de publicacion quieres subir");
        System.out.println("1.FOTO       2.TEXTO");
        int tipopublicacion=sc.nextInt();
        if(tipopublicacion==1){


         //FOTOS
        //fotografia1
        Fotografia fotografia1 = new Fotografia(20, "Playa x Playa", "La Pantera", "playa.png");
//        fotografia1.setLikes(0);
        fotografia1.like();
        String coment1 = "Muy chula!!";
        fotografia1.comentarios(coment1);
        System.out.println(fotografia1);
        System.out.println("------------------------------------------------------------------");
        //fotografia2
        Fotografia fotografia2 = new Fotografia(23, "Querida Alma Gemela", "Porta", "T_B.png");
//        fotografia2.setLikes(0);
        for (int i = 0; i < 20; i++) {
            fotografia2.like();
        }
        String coment2 = "TOP1";
        String coment3 = "LO MEJOR DEL AÑO";
        fotografia2.comentarios(coment2);
        fotografia2.comentarios(coment3);
        System.out.println(fotografia2);
        System.out.println("------------------------------------------------------------------");
} else if (tipopublicacion==2) {
            //TEXTO
            //texto1
            PublicacionMensaje pM1 = new PublicacionMensaje(12, "A tope!!", "Matias", "Estoy a tope jefe de equipo");
            for (int i = 0; i < 300; i++) {
                pM1.like();
            }
            String comentpM1_1 = "GRANDE!!";
            String comentpM1_2 = "TOP1";
            String comentpM1_3 = "LO MEJOR DEL AÑO";
            pM1.comentarios(comentpM1_1);
            pM1.comentarios(comentpM1_2);
            pM1.comentarios(comentpM1_3);
            System.out.println(pM1);
        }else{
            throw new RuntimeException("Debe ser o el 1 o el 2");
        }
    }
}

