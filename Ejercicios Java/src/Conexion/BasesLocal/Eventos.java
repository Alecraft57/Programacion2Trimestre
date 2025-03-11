package Conexion.BasesLocal;

import java.sql.*;

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
//            System.out.println("La conexion ha sido exitosa(evento)");
            st=con.prepareStatement(sql);
//            System.out.println("Detectado");
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
    public void eliminar(int id_eventos){
        String url="jdbc:sqlite:Concierto.db";
        Connection con=null;
        Statement st=null;
        String sql;
        try {
            con=DriverManager.getConnection(url);
            st=con.createStatement();
            sql="delete from eventos where id_eventos ="+id_eventos;
            st.executeUpdate(sql);

        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        try {
            if(con!=null && con.isClosed()){
                con.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        try {
            if(st!=null && st.isClosed()){
                st.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void consultar(int id_eventos){
        Connection con=null;
        Statement st=null;
        String url="jdbc:sqlite:Concierto.db";
        String sql;
        ResultSet rs=null;
        try {
            con=DriverManager.getConnection(url);
            st=con.createStatement();
            sql="select * from eventos where id_eventos="+id_eventos;
            rs=st.executeQuery(sql);
            System.out.println("id_eventos\t | nombre_eventos\t | fecha\t | hora");
            System.out.println("--------------------------------------------------------------------------");
            while (rs.next()){
                System.out.print(rs.getInt(1)+"\t\t | ");
                System.out.print(rs.getString(2)+" \t\t | ");
                System.out.print(rs.getString(3)+" \t\t | ");
                System.out.print(rs.getInt(4)+" \t\t");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            if(con!=null && con.isClosed()){
                con.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        try {
            if(st!=null && st.isClosed()){
                st.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void actualizar(int act,int nuevo){
        Connection con=null;
        Statement st=null;
        String url="jdbc:sqlite:Concierto.db";
        String sql;
        try {
            con=DriverManager.getConnection(url);
            st=con.createStatement();
            sql="update eventos set id_eventos = "+nuevo+" where id_eventos = "+act;
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            if(con!=null && con.isClosed()){
                con.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        try {
            if(st!=null && st.isClosed()){
                st.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void consultar_todo(){
        Connection con=null;
        Statement st=null;
        String url="jdbc:sqlite:Concierto.db";
        String sql;
        ResultSet rs=null;
        try {
            con=DriverManager.getConnection(url);
            st=con.createStatement();
            sql="select * from eventos";
            rs=st.executeQuery(sql);
            System.out.println("id_eventos\t | nombre_eventos\t | fecha\t | hora");
            System.out.println("--------------------------------------------------------------------------");
            while (rs.equals(null)){
                System.out.print(rs.getInt(1)+"\t\t | ");
                System.out.print(rs.getString(2)+" \t\t | ");
                System.out.print(rs.getString(3)+" \t\t | ");
                System.out.print(rs.getInt(4)+" \t\t");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            if(con!=null && con.isClosed()){
                con.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        try {
            if(st!=null && st.isClosed()){
                st.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
