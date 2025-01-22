package OrientadaAObjetos.Ejercicio3;

import java.util.Scanner;

public class uso {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Cuenta primero = new Cuenta("Juan",132.00);
        System.out.println(primero);
        System.out.println("Dime que quieres hacer(ingresar o retirar)");
        String respuesta=sc.nextLine();

        if(respuesta.equals("ingresar")){
            System.out.println("Cuanto quieres ingresar?");
            double ing=sc.nextDouble();
            primero.ingresar(ing);
            System.out.println(primero);

        }else if(respuesta.equals("retirar")){
            System.out.println("Cuanto quieres retirar?");
            double ret = sc.nextDouble();
            primero.setCantidad(ret);
            primero.retirar();
            System.out.println(primero);

        }
    }
}
