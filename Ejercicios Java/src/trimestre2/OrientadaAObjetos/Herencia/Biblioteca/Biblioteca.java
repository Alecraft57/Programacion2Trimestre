package trimestre2.OrientadaAObjetos.Herencia.Biblioteca;

import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime tu Usuario");
        String us=sc.next();
        Usuario user1= new Usuario(us);
        System.out.println("Bienvenido "+us);
        Digital dg =new Digital("Patrulleros","Juan Ortega",200,true);
        dg.alquilar();
        dg.comentarios("El libro es una pasada y muy interesante");
        System.out.println(dg);
        dg.devolver();
        System.out.println("Quieres añadir este libro a favortios?(S/N)");
        String resfav=sc.next();
        if(resfav.equals("S")){
            user1.Favs(dg.getNombre());
            System.out.println(user1);
        }else{
            System.out.println("Aqui tienes tu informacion\n"+user1);
        }
    }
}
