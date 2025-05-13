package Interfaces_Graficas.Trabajo_Final.BasesLocal;

import java.sql.*;

public class usuarios {
    private int id_ubicacion;
    private String nombre;
    private String TF;
    private String tipo_usuario;

    public void creartabla(){
        String sql="";
        Connection con=null;
        Statement st=null;
        String url="jdbc:sqlite:Concierto.db";
        try {
            con=DriverManager.getConnection(url);
            st=con.createStatement();
            sql="Create Table usuarios (id_usuario integer, nombre_usuario text, TF integer, tipo_usuario text, primary key(id_usuario))";
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

    public void insertar(int id_usuarios,String nombre,String TF,String tipo_usuario){
        String sql="insert into usuarios (id_usuario,nombre_usuario,TF,tipo_usuario) values (?,?,?,?)";
        Connection con=null;
        PreparedStatement st=null;
        String url="jdbc:sqlite:Concierto.db";
        try {
            con= DriverManager.getConnection(url);
            System.out.println("La conexion ha sido exitosa(usuario)");

            st=con.prepareStatement(sql);

            st.setInt(1,id_usuarios);
            st.setString(2,nombre);
            st.setString(3,TF);
            st.setString(4,tipo_usuario);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        try {
            if(con!=null && con.isClosed()){
                con.close();
                System.out.println("trimestre2.Conexion cerrada");
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        try {
            if(st!=null && st.isClosed()){
                st.close();
                System.out.println("trimestre2.Conexion cerrada");
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public void eliminar(int id_usuario){
        Connection con=null;
        Statement st=null;
        String url="jdbc:sqlite:Concierto.db";
        String sql;

        try {
            con=DriverManager.getConnection(url);
            st=con.createStatement();
            sql="Delete from usuarios where id_usuario="+id_usuario;
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            if(con!=null && con.isClosed()){
                con.close();
                System.out.println("trimestre2.Conexion cerrada");
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        try {
            if(st!=null && st.isClosed()){
                st.close();
                System.out.println("trimestre2.Conexion cerrada");
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public void consultar(int id_usuario){
        Connection con=null;
        Statement st=null;
        String sql;
        String url="jdbc:sqlite:Concierto.db";
        ResultSet rs=null;

        try {
            con=DriverManager.getConnection(url);
            st=con.createStatement();
            sql="select * from usuarios where id_usuario="+id_usuario;
            rs=st.executeQuery(sql);
            System.out.println("id_usuario | \t nombre_usuario | \t TF | \ttipo_usuario |");
            System.out.println("---------------------------------------------------------------------------------");
            while (rs.next()){
                System.out.print(rs.getInt(1)+" \t\t | ");
                System.out.print(rs.getString(2)+" \t\t | ");
                System.out.print(rs.getString(3)+" \t\t | ");
                System.out.print(rs.getString(4)+" \t\t | \n");

            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            if(con!=null && con.isClosed()){
                con.close();
                System.out.println("trimestre2.Conexion cerrada");
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        try {
            if(st!=null && st.isClosed()){
                st.close();
                System.out.println("trimestre2.Conexion cerrada");
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
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
            sql="Update usuarios set id_usuario = "+nuevo+" where id_usuario ="+act;
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            if(con!=null && con.isClosed()){
                con.close();
                System.out.println("trimestre2.Conexion cerrada");
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        try {
            if(st!=null && st.isClosed()){
                st.close();
                System.out.println("trimestre2.Conexion cerrada");
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
//    public void consultartodo(){
//        Connection con=null;
//        Statement st=null;
//        String url="jdbc:sqlite:Concierto.db";
//        String sql;
//        ResultSet rs;
//        try {
//            con=DriverManager.getConnection(url);
//            st=con.createStatement();
//            sql="select * from usuarios";
//            rs=st.executeQuery(sql);
//            System.out.println("id_usuario | \t nombre_usuario | \t TF | \ttipo_usuario |");
//            System.out.println("---------------------------------------------------------------------------------");
//            while (rs.next()){
//                System.out.print(rs.getInt(1)+" \t\t | ");
//                System.out.print(rs.getString(2)+" \t\t | ");
//                System.out.print(rs.getString(3)+" \t\t | ");
//                System.out.print(rs.getString(4)+" \t\t | \n");
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        try {
//            if(con!=null && con.isClosed()){
//                con.close();
//                System.out.println("trimestre2.Conexion cerrada");
//            }
//        }catch (Exception ex){
//            System.out.println(ex.getMessage());
//        }
//        try {
//            if(st!=null && st.isClosed()){
//                st.close();
//                System.out.println("trimestre2.Conexion cerrada");
//            }
//        }catch (Exception ex){
//            System.out.println(ex.getMessage());
//        }
//    }
public String consultartodo() {
    Connection con = null;
    Statement st = null;
    String url = "jdbc:sqlite:Concierto.db";
    String sql;
    ResultSet rs;
    StringBuilder resultado = new StringBuilder();

    try {
        con = DriverManager.getConnection(url);
        st = con.createStatement();
        sql = "select * from usuarios";
        rs = st.executeQuery(sql);

        // Encabezados
        resultado.append("id_usuario | \t nombre_usuario | \t TF | \t tipo_usuario |\n");
        resultado.append("-----------------------------------------------------------------\n");

        while (rs.next()) {
            resultado.append(rs.getInt(1)).append(" \t\t | ");
            resultado.append(rs.getString(2)).append(" \t\t | ");
            resultado.append(rs.getString(3)).append(" \t\t | ");
            resultado.append(rs.getString(4)).append(" \t\t | \n");
        }
    } catch (Exception e) {
        resultado.append("Error: ").append(e.getMessage());
    } finally {
        try {
            if (st != null && !st.isClosed()) {
                st.close();
            }
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (Exception ex) {
            resultado.append("\nError al cerrar conexiones: ").append(ex.getMessage());
        }
    }

    return resultado.toString();
}
}
