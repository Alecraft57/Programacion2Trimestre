package Conexion.BasesLocal;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime con que tabla quieres interactuar");
        System.out.println("-1: eventos\n-2: usuarios");
        int tabla=sc.nextInt();
        switch (tabla){
            case 1:
                Eventos e=new Eventos();
                System.out.println("Que quieres hacer?");
                System.out.println("-1: insertar\n-2: eliminar(basandote en un id)\n-3: consulta(basandote en un id)\n-4: actualizar\n-6: Salir");
                int funcion=sc.nextInt();
                switch (funcion){
                    case 1:
                        System.out.println("Dime el id del evento");
                        int evento_id_insertar=sc.nextInt();
                        sc.nextLine();
                        System.out.println("Dime el nombre del evento");
                        String evento_nombre=sc.nextLine();
                        System.out.println("Dime la fecha(en formato (DD/MM/YYYY))");
                        String evento_fecha=sc.nextLine();
                        System.out.println("Dime la hora(solo la hora)");
                        int evento_hora=sc.nextInt();
                        e.insertar(evento_id_insertar,evento_nombre,evento_fecha,evento_hora);
                        break;
                    case 2:
                        System.out.println("Dime el id del evento que quieras eliminar");
                        int evento_id_eliminar=sc.nextInt();
                        e.eliminar(evento_id_eliminar);
                        break;
                    case 3:
                        System.out.println("Dime el id del evento que quieres mostrar");
                        int evento_id_consultar=sc.nextInt();
                        e.consultar(evento_id_consultar);
                        break;
                    case 4:
                        System.out.println("Dime el id que quieres actualizar");
                        int evento_id_actual_actualizar=sc.nextInt();
                        System.out.println("Dime el nuevo id");
                        int evento_id_nuevo_actualizar=sc.nextInt();
                        e.actualizar(evento_id_actual_actualizar,evento_id_nuevo_actualizar);
                        break;
                    case 6:
                        System.out.println("Has salido correctamente");
                        break;
                    default:
                }

        }
   }
}
