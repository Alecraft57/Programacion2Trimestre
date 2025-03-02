package Conexion.Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejecutacion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ResCont;
        article a;
        System.out.println("Que tabla quieres modificar?");
        String tabla=sc.nextLine();
        switch (tabla){
            case "article":
                System.out.println("Quieres insertar o elimiar contenido?");
                ResCont=sc.nextLine();
                switch (ResCont){
                    case "insertar":
                            System.out.println("Dime el codigo autor");
                            String cod_a=sc.next();
                            System.out.println("Dime el la descripcion");
                            String descrip=sc.next();
                            System.out.println("Dime el precio");
                            double preu=sc.nextDouble();
                            System.out.println("Dime el stock");
                            int stock=sc.nextInt();
                            System.out.println("Dime el stock minimo");
                            int stock_min= sc.nextInt();
                            while (stock_min>stock){
                                System.out.println("Error, el stock debe ser mas grande que el stock minimo. Dime el stock");
                                stock= sc.nextInt();
                                System.out.println("Dime el stock_min");
                                stock_min= sc.nextInt();
                            }
                            System.out.println("Dime la categoria");
                            String cod_cat=sc.next();
                            a=new article(cod_a,descrip,preu,stock,stock_min,cod_cat);
                            a.insertar();
                            break;
                    case "eliminar":
                        System.out.println("Dime el codigo del articulo que quieras eliminar");
//                        a.eliminar("K4323");
                }

                break;
        }
    }
}
