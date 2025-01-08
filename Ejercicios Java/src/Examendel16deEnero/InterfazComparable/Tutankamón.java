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
        int encontrados=0;
        List<objetostutankamon>objetos=new ArrayList<>();
        System.out.println("Cuantos objetos se han encontrado?");
        encontrados=sc.nextInt();
        while(encontrados>100 || encontrados<0){
            System.out.println("Dime una cantidad entre 1 y 100");
            encontrados=sc.nextInt();
        }
        for(int i=0;i<encontrados;i++){
            System.out.println("Dime el nombre del objeto");
            nom=sc.next();
            while(nom.length()>10){
                System.out.println("Dime el nombre del objeto(Tiene que ser de 10 letras maximo)");
                nom=sc.next();
            }
            System.out.println("Dime su Valor Historico");
            valor=sc.nextInt();
            System.out.println("Dime su peso");
            peso=sc.nextInt();
            while(valor>1000 || peso>1000){
                System.out.println("Dime su Valor Historico(Tiene que ser entre 1 y 1000)");
                valor=sc.nextInt();
                System.out.println("Dime su peso(Tiene que ser entre 1 y 1000)");
                peso=sc.nextInt();
            }
            objetos.add(new objetostutankamon(nom,valor,peso));
        }
        objetos.sort((valor1,valor2)->Integer.compare(valor2.getValorhistorico(),valor1.getValorhistorico()));
        for(objetostutankamon obj: objetos){
            System.out.println(obj.getNombre()+" "+obj.getValorhistorico()+" "+obj.getPeso());
    }
}
}
