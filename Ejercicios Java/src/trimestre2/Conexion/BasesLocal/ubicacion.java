package trimestre2.Conexion.BasesLocal;

import java.sql.*;

public class ubicacion {


    public void creartabla(){
        Connection con=null;
        Statement st=null;
        String sql;
        String url="jdbc:sqlite:Concierto.db";
        try {
            con= DriverManager.getConnection(url);
            st=con.createStatement();
            sql="Create table ubicacion (id_ubicacion integer, id_eventos integer, zona text, capacidad integer,primary key (id_ubicacion),foreign key(id_eventos) references eventos(id_eventos))";
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            if(con!=null && con.isClosed()){
                con.close();
                System.out.println("trimestre2.Conexion cerrada");
            }
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            if(st!=null && st.isClosed()){
                st.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void insertar(int id_ubicacion,int id_eventos,String zona, int capacidad){
        Connection con=null;
        PreparedStatement st=null;
        String url="jdbc:sqlite:Concierto.db";
        String sql="insert into ubicacion (id_ubicacion,id_eventos,zona,capacidad) values (?,?,?,?)";
        try {
            con=DriverManager.getConnection(url);
            st=con.prepareStatement(sql);
            st.setInt(1,id_ubicacion);
            st.setInt(2,id_eventos);
            st.setString(3,zona);
            st.setInt(4,capacidad);
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            if(con!=null && con.isClosed()){
                con.close();
                System.out.println("trimestre2.Conexion cerrada");
            }
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            if(st!=null && st.isClosed()){
                st.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void eliminar(int id_ubicacion){
        Connection con=null;
        Statement st=null;
        String url="jdbc:sqlite:Concierto.db";
        String sql;
        try {
            con= DriverManager.getConnection(url);
            st=con.createStatement();
            sql="delete from ubicacion where id_ubicacion="+id_ubicacion;
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            if(con!=null && con.isClosed()){
                con.close();
                System.out.println("trimestre2.Conexion cerrada");
            }
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            if(st!=null && st.isClosed()){
                st.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void consultar(int id_ubicacion){
        Connection con=null;
        Statement st=null;
        String url="jdbc:sqlite:Concierto.db";
        String sql;
        ResultSet rs;
        try {
            con=DriverManager.getConnection(url);
            st=con.createStatement();
            sql="select * from ubicacion where id_ubicacion="+id_ubicacion;
            rs=st.executeQuery(sql);
            System.out.println("id_ubicacion\t | id_eventos \t | zona \t | capacidad ");
            System.out.println("-----------------------------------------------------------------------");
            while (rs.next()){
                System.out.print(rs.getInt(1)+"\t\t |");
                System.out.print(rs.getInt(2)+"\t\t |");
                System.out.print(rs.getString(3)+"\t\t |");
                System.out.print(rs.getInt(4)+"\t\t\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            if(con!=null && con.isClosed()){
                con.close();
                System.out.println("trimestre2.Conexion cerrada");
            }
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            if(st!=null && st.isClosed()){
                st.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void actualizar_zona(int id,String zona){
        Connection con=null;
        Statement st=null;
        String url="jdbc:sqlite:Concierto.db";
        String sql;
        try {
            con=DriverManager.getConnection(url);
            st=con.createStatement();
            sql="Update ubicacion set zona = '"+zona+"' where id_ubicacion = "+id;
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            if(con!=null && con.isClosed()){
                con.close();
                System.out.println("trimestre2.Conexion cerrada");
            }
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            if(st!=null && st.isClosed()){
                st.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void consultartodo(){
        Connection con=null;
        Statement st=null;
        String sql;
        String url="jdbc:sqlite:Concierto.db";
        ResultSet rs=null;
        try {
            con=DriverManager.getConnection(url);
            st=con.createStatement();
            sql="select * from ubicacion";
            rs=st.executeQuery(sql);
            System.out.println("id_ubicacion\t | id_eventos \t | zona \t | capacidad \t |");
            System.out.println("----------------------------------------------------------------------------");
            while(rs.next()){
                System.out.print(rs.getInt(1)+"\t\t | ");
                System.out.print(rs.getInt(2)+"\t\t | ");
                System.out.print(rs.getString(3)+"\t\t | ");
                System.out.print(rs.getInt(4)+"\t\t | \n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            if(con!=null && con.isClosed()){
                con.close();
                System.out.println("trimestre2.Conexion cerrada");
            }
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            if(st!=null && st.isClosed()){
                st.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
