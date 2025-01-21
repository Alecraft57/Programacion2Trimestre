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
            Double ing=sc.nextDouble();
            Double ingresado=primero.getCantidad()+ing;
        }
    }
}
