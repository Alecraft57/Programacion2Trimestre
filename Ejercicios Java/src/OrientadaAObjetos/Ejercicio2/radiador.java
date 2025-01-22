package OrientadaAObjetos.Ejercicio2;

import java.util.Scanner;

public class radiador {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Radiadores primero = new Radiadores("gewg",20,10,15);
        System.out.println(primero);
        System.out.println("Quieres subir o bajar los grados?");
        String respuesta=sc.nextLine();
        if(respuesta.equals("subir")){
            primero.subir();
        }else if(respuesta.equals("bajar")){
            primero.bajar();
        }
        System.out.println(primero);
    }
}
