package Estructurabasica;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PaisCapital {
    public static void main(String[]args) {
        Map<String, String> PaisCapital = new HashMap<>();
        PaisCapital.put("España","Madrid");
        PaisCapital.put("Francia","Paris");
        PaisCapital.put("Italia","Roma");
        PaisElegido(PaisCapital);
    }
    public static void PaisElegido(Map<String,String>PaisCapital) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un pais");
        String pais = sc.nextLine();
        if (PaisCapital.containsKey(pais)) {
            System.out.println("La capital de " + pais + " es " + PaisCapital.get(pais) + ".");
       }
    }
}
