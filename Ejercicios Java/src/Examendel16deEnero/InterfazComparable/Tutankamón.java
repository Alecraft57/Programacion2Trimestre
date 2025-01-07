package Examendel16deEnero.InterfazComparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Tutankamón {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nom="";
        int peso=0;
        int valor=0;
        List<objetostutankamón>objetos=new ArrayList<>();
        System.out.println("Cuantos objetos se han encontrado?");
        int encontrados=sc.nextInt();
        for(int i=0;i<encontrados;i++){
            System.out.println("Dime el nombre del objeto");
            nom=sc.next();
            System.out.println("Dime su Valor Historico");
            valor=sc.nextInt();
            System.out.println("Dime su peso");
            peso=sc.nextInt();
            objetos.add(new objetostutankamón(nom,valor,peso));
        }
        objetos.sort((valor1,valor2)->Integer.compare(valor2.getValorhistorico(),valor1.getValorhistorico()));
        for(objetostutankamón obj: objetos){
            System.out.println(obj.getNombre()+" "+obj.getValorhistorico()+" "+obj.getPeso());
    }
}
}
