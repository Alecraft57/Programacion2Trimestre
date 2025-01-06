package VueltadeVacaciones;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class PaisCapital {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,String>Paises=new HashMap<>();
        Paises.put("Francia","Paris");
        Paises.put("Espanya","Madrid");
        Paises.put("Italia","Roma");

        System.out.println("Dime un Pais");
        String pais=sc.nextLine();
        System.out.println(Paises.getOrDefault(pais,"No existe este Pais"));

        }
}
