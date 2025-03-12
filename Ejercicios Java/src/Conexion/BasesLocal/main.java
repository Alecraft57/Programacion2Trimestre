package Conexion.BasesLocal;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String re = "s";
        while (re.equals("s")) {
        System.out.println("Dime con que tabla quieres interactuar");
        System.out.println("-1: eventos\n-2: usuarios\n-3: salir");
        int tabla = sc.nextInt();
            switch (tabla) {
                case 1:
                    Eventos e = new Eventos();
                    System.out.println("Que quieres hacer?");
                    System.out.println("-1: insertar\n-2: eliminar(basandote en un id)\n-3: consulta(basandote en un id)\n-4: actualizar\n-5: consulta todas las tablas\n-6: Salir");
                    int eventos_funcion = sc.nextInt();
                    switch (eventos_funcion) {
                        case 1:
                            System.out.println("Dime el id del evento");
                            int evento_id_insertar = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Dime el nombre del evento");
                            String evento_nombre = sc.nextLine();
                            System.out.println("Dime la fecha(en formato (DD/MM/YYYY))");
                            String evento_fecha = sc.nextLine();
                            System.out.println("Dime la hora(solo la hora)");
                            int evento_hora = sc.nextInt();
                            e.insertar(evento_id_insertar, evento_nombre, evento_fecha, evento_hora);
                            break;
                        case 2:
                            System.out.println("Dime el id del evento que quieras eliminar");
                            int evento_id_eliminar = sc.nextInt();
                            e.eliminar(evento_id_eliminar);
                            break;
                        case 3:
                            System.out.println("Dime el id del evento que quieres mostrar");
                            int evento_id_consultar = sc.nextInt();
                            e.consultar(evento_id_consultar);
                            break;
                        case 4:
                            System.out.println("Dime el id que quieres actualizar");
                            int evento_id_actual_actualizar = sc.nextInt();
                            System.out.println("Dime el nuevo id");
                            int evento_id_nuevo_actualizar = sc.nextInt();
                            e.actualizar(evento_id_actual_actualizar, evento_id_nuevo_actualizar);
                            break;
                        case 5:
                            e.consultar_todo();
                            break;
                        case 6:
                            System.out.println("Has salido correctamente");
                            re = "n";
                            break;
                        default:
                            System.out.println("Saliendo al menu");
                    }
                    break;
                case 2:
                    usuarios us = new usuarios();
                    System.out.println("Que quieres hacer?");
                    System.out.println("-1: Crear(Ya esta hecha)\n-2: insertar\n-3: eliminar(basandote en un id)\n-4: consulta(basandote en un id)\n-5: actualizar\n-6: consulta todas las tablas\n-7: Salir");
                    int usuarios_funcion = sc.nextInt();
                    switch (usuarios_funcion) {
                        case 1:
                            System.out.println("Creando tabla...");
                            us.creartabla();
                            break;
                        case 2:
                            System.out.println("Dime el id del usuario");
                            int usuario_id_insertar = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Dime el nombre del usuario");
                            String usuario_nombre = sc.nextLine();
                            System.out.println("Dime el numero de telefono(en formato XXX-XXX-XXX))");
                            String usuario_TF = sc.nextLine();
                            System.out.println("Dime el tipo usuario");
                            String usuario_tipo_usuario = sc.nextLine();
                            us.insertar(usuario_id_insertar, usuario_nombre, usuario_TF, usuario_tipo_usuario);
                            break;

                        case 3:
                            System.out.println("Dime el id del usuario que quieres eliminar");
                            int usuario_id_eliminar = sc.nextInt();
                            us.eliminar(usuario_id_eliminar);
                            break;
                        case 4:
                            System.out.println("Dime el id para consultar el usuario");
                            int usuario_id_consultar=sc.nextInt();
                            us.consultar(usuario_id_consultar);
                            break;
                        case 5:
                            System.out.println("Dime el id que quieras actualizar");
                            int usuario_id_actual_actualizar = sc.nextInt();
                            System.out.println("Dime el nuevo id");
                            int usuario_id_nuevo_actualizar = sc.nextInt();
                            us.actualizar(usuario_id_actual_actualizar,usuario_id_nuevo_actualizar);
                            break;
                        case 6:
                            us.consultartodo();
                            System.out.println("Aqui tienes la tabla !!");
                        case 7:
                            System.out.println("Has salido correctamente");
                            re = "n";
                    }
                    break;
                case 3:
                    System.out.println("Has salido correctamente");
                    re = "n";
            }
        }
    }
}
