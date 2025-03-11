package Conexion.BasesLocal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Eventos {
    private int eventos;
    private String nombre_evento;
    private int fecha;
    private int hora;

    public void insertar(int id_eventos,String nombre_evento,String fecha, int hora){
        String url="jdbc:sqlite:Concierto.db";
        Connection con=null;
        PreparedStatement st=null;
        String sql="insert into eventos (id_eventos,nombre_evento,fecha,hora) values(?,?,?,?)";
        try {
            con= DriverManager.getConnection(url);
            System.out.println("La conexion ha sido exitosa(evento)");
            st=con.prepareStatement(sql);
            System.out.println("Detectado");
            st.setInt(1,id_eventos);
            st.setString(2,nombre_evento);
            st.setString(3,fecha);
            st.setInt(4,hora);
            st.executeUpdate();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            if(con!=null && con.isClosed()){
                con.close();
                System.out.println("Conexion cerrada");
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        try {
            if(st!=null && st.isClosed()){
                st.close();
                System.out.println("Conexion cerrada");
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
