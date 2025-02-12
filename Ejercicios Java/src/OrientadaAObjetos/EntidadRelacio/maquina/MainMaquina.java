package OrientadaAObjetos.EntidadRelacio.maquina;

import java.util.Scanner;

public class MainMaquina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eleccion=0;
        int cerveza = 120;
        int sopa = 300;
        int sop=0;
        int cer=0;
        int ele=0;
        while (eleccion==0) {
        System.out.println("Dime que quieres: 1 Cerveza, 2 Sopa");
            eleccion = sc.nextInt();
            System.out.println("Cuanto ingresas:");
            int ingreso=sc.nextInt();
            MaquinaExpendedora n1 = new MaquinaExpendedora(cerveza, cer,sop);
            if (eleccion==1) {
                n1.setTique(cerveza);
                cer++;
                n1.setCerveza(cer);
                eleccion=0;
            } else if (eleccion==2) {
                n1.setTique(sopa);
                sop++;
                n1.setSopa(sop);
                eleccion=0;
            }
            n1.Sacar(ingreso);
            System.out.println(n1);

        }

    }
}
