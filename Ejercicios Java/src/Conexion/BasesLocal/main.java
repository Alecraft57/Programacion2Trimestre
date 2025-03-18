package Conexion.BasesLocal;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String re = "s";
        while (re.equals("s")) {
        System.out.println("Dime con que tabla quieres interactuar");
        System.out.println("-1: eventos\n-2: usuarios\n-3: ubicacion\n-4: reservas\n-5: pagado\n-6: salir");
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
                            int usuario_id_consultar = sc.nextInt();
                            us.consultar(usuario_id_consultar);
                            break;
                        case 5:
                            System.out.println("Dime el id que quieras actualizar");
                            int usuario_id_actual_actualizar = sc.nextInt();
                            System.out.println("Dime el nuevo id");
                            int usuario_id_nuevo_actualizar = sc.nextInt();
                            us.actualizar(usuario_id_actual_actualizar, usuario_id_nuevo_actualizar);
                            break;
                        case 6:
                            us.consultartodo();
                            System.out.println("Aqui tienes la tabla !!");
                            break;
                        case 7:
                            System.out.println("Has salido correctamente");
                            re = "n";
                            break;
                        default:
                            System.out.println("Saliendo al menu");
                    }
                    break;
                case 3:
                    ubicacion ub=new ubicacion();
                    System.out.println("Que quieres hacer?");
                    System.out.println("-1: Crear(Ya esta hecha)\n-2: insertar\n-3: eliminar(basandote en un id)\n-4: consulta(basandote en un id)\n-5: actualizar zona\n-6: consulta todas las tablas\n-7: Salir");
                    int ub_funcion = sc.nextInt();
                    switch (ub_funcion) {
                        case 1:
                            System.out.println("Creando tabla...");
                            ub.creartabla();
                            break;
                        case 2:
                            System.out.println("Dime el id de la ubicacion");
                            int ubicacion_id_insertar=sc.nextInt();
                            System.out.println("Dime el id del evento");
                            int ubicacion_evento_insertar=sc.nextInt();
                            sc.nextLine();
                            System.out.println("Dime la zona");
                            String ubicacion_zona_insertar=sc.nextLine();
                            System.out.println("Dime la capacidad de la zona");
                            int ubicacion_capacidad_insertar= sc.nextInt();
                            ub.insertar(ubicacion_id_insertar,ubicacion_evento_insertar,ubicacion_zona_insertar,ubicacion_capacidad_insertar);
                            break;
                        case 3:
                            System.out.println("Dime el id de la ubicacion");
                            int ubicacion_id_eliminar=sc.nextInt();
                            ub.eliminar(ubicacion_id_eliminar);
                            break;
                        case 4:
                            System.out.println("Dime el id de la ubicacion para consultarla");
                            int ubicacion_id_consultar=sc.nextInt();
                            ub.consultar(ubicacion_id_consultar);
                            break;
                        case 5:
                            System.out.println("Dime el id que quieras actualizar");
                            int ubicacion_id_actual_actualizar = sc.nextInt();
                            System.out.println("Dime la nueva zona");
                            String ubicacion_zona_actualizar = sc.nextLine();
                            ub.actualizar_zona(ubicacion_id_actual_actualizar, ubicacion_zona_actualizar);
                            break;
                        case 6:
                            ub.consultartodo();
                            System.out.println("Aqui tienes la tabla !!");
                            break;
                        case 7:
                            System.out.println("Has salido correctamente");
                            re = "n";
                            break;
                        default:
                            System.out.println("Saliendo al menu");
                    }
                    break;
                case 4:
                    Reservas rs=new Reservas();
                    System.out.println("Que quieres hacer?");
                    System.out.println("-1: Crear(Ya esta hecha)\n-2: crear reserva\n-3: eliminar(basandote en un id)\n-4: consulta(basandote en un id)\n-5: actualizar fecha\n-6: consulta todas las tablas\n-7:Imprimir por id\n-8: Salir");
                    int rs_funcion=sc.nextInt();
                    switch (rs_funcion){
                        case 1:
                            rs.creartabla();
                            break;
                        case 2:
                            System.out.println("Dime el id de la reserva");
                            int reserva_id_insertar=sc.nextInt();
                            System.out.println("Dime el id usuario");
                            int reserva_usuario_insertar=sc.nextInt();
                            System.out.println("Dime el id del evento");
                            int reserva_evento_insertar=sc.nextInt();
                            sc.nextLine();
                            System.out.println("Dime la fecha");
                            String reserva_fecha_insertar=sc.nextLine();
                            rs.insertar(reserva_id_insertar,reserva_usuario_insertar,reserva_evento_insertar,reserva_fecha_insertar);
                            break;
                        case 3:
                            System.out.println("Dime el id de la reserva que quieres eliminar");
                            int reserva_id_eliminar=sc.nextInt();
                            rs.eliminar(reserva_id_eliminar);
                            break;
                        case 4:
                            System.out.println("Dime el id de la reserva para hacer una consulta");
                            int reserva_id_consultar=sc.nextInt();
                            rs.consultarid(reserva_id_consultar);
                            break;
                        case 5:
                            System.out.println("Dime el id de la reserva para hacer una actualizacion en fecha");
                            int reserva_id_actualizar=sc.nextInt();
                            sc.nextLine();
                            System.out.println("Dime la nueva fecha");
                            String reserva_fecha_actualzar=sc.nextLine();
                            rs.actualizar(reserva_id_actualizar,reserva_fecha_actualzar);
                            break;
                        case 6:
                            rs.consultartodo();
                            System.out.println("Aqui tienes todo!!");
                            break;
                        case 7:
                            System.out.println("Dime el id para la reserva");
                            int reserva_id_imprimir=sc.nextInt();
                            rs.imprimirreservaporid(reserva_id_imprimir);
                            break;
                        case 8:
                            System.out.println("Has salido correctamente");
                            re = "n";
                            break;
                        default:
                            System.out.println("Saliendo al menu");
                    }
                    break;
                case 5:
                    pagado p=new pagado();
                    System.out.println("Que quieres hacer?");
                    System.out.println("-1: Crear(Ya esta hecha)\n-2: Crear pago\n-3: eliminar(basandote en un id)\n-4: consulta(basandote en un id)\n-5: actualizar estado\n-6: consulta todas las tablas\n-7: Salir");
                    int p_funcion=sc.nextInt();
                    switch (p_funcion){
                        case 1:
                            p.creartabla();
                            break;
                        case 2:
                            System.out.println("Dime el id de el pago");
                            int pagado_id_insertar=sc.nextInt();
                            System.out.println("Dime el id de la reserva");
                            int pagado_reserva_insertar=sc.nextInt();
                            sc.nextLine();
                            System.out.println("Dime el estado(Pagado-No Pagado)");
                            String pagado_estado_insertar=sc.nextLine();
                            p.insertar(pagado_id_insertar,pagado_reserva_insertar,pagado_estado_insertar);
                            break;
                        case 3:
                            System.out.println("Dime el id del pago que quieres eliminar");
                            int pagado_id_eliminar=sc.nextInt();
                            p.eliminar(pagado_id_eliminar);
                            break;
                        case 4:
                            System.out.println("Dime el id del pago para hacer una consulta");
                            int pagado_id_consultar=sc.nextInt();
                            p.consultar(pagado_id_consultar);
                            break;
                        case 5:
                            System.out.println("Dime el id de el pago para cambiarle el estado");
                            int pagado_id_actualizar=sc.nextInt();
                            sc.nextLine();
                            System.out.println("Dime el nuevo estado del pago");
                            String pagado_estado_actualizar=sc.nextLine();
                            p.actualizar(pagado_id_actualizar,pagado_estado_actualizar);
                            break;
                        case 6:
                            p.consultartodo();
                            System.out.println("Aqui tienes todos los pagos!!");
                            break;
                        case 7:
                            System.out.println("Has salido correctamente");
                            re = "n";
                            break;
                        default:
                            System.out.println("Saliendo al menu");
                    }
                    break;
                case 6:
                    System.out.println("Has salido correctamente");
                    re = "n";
                    break;
                default:
                    System.out.println("Apagando Conexion...");
                    re="n";
            }
        }
    }
}
