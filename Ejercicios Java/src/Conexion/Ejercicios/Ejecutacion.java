package Conexion.Ejercicios;

import java.util.Scanner;

public class Ejecutacion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ResCont;
        System.out.println("En que tabla quieres modificas?");
        String tabla=sc.nextLine();

        switch (tabla){
            case "article":
                System.out.println("Quieres insertar o elimiar contenido?");
                ResCont=sc.nextLine();
                switch (ResCont){
                    case "insertar":
                        System.out.println("Dime un codigo de articulo");
                    case "eliminar":
                        System.out.println("Dime el codigo del articulo que quieras eliminar");
                }

                break;
        }
    }
}
