package Conexion.Ejercicios;

import org.checkerframework.checker.units.qual.C;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Categoria {
    private String cod_cat;
    private String descripcio;

//    public Categoria(String cod_cat, String descripcio){
//        this.cod_cat=cod_cat;
//        this.descripcio=descripcio;
//    }

//    public String getCod_cat() {
//        return cod_cat;
//    }
//
//    public void setCod_cat(String cod_cat) {
//        this.cod_cat = cod_cat;
//    }
//
//    public String getDescripcio() {
//        return descripcio;
//    }
//
//    public void setDescripcio(String descripcio) {
//        this.descripcio = descripcio;
//    }

    public void insertar(String cod_cat, String descripcio){
        Connection con=null;
        PreparedStatement st=null;
        String sql="insert into categoria (cod_cat,descripcio) values (?,?)";
        try {
            con=Conexion.Bases.DatabaseConnection.getConnection();
            st=con.prepareStatement(sql);

            st.setString(1,cod_cat);
            st.setString(2,descripcio);
            st.executeUpdate();
        }catch (SQLException ex){
            System.out.println("Error "+ex.getMessage());
        }
        try {
            if (st!=null && st.isClosed()){
                st.close();
            }
        } catch (SQLException ex) {
            System.out.println("No se cerro correctamente "+ex.getMessage());
        }
        try {
            if(con!=null && con.isClosed()){
                con.close();
            }
        } catch (SQLException ex) {
            System.out.println("No se cerro correctamente" +ex.getMessage());
        }
    }
    public void eliminar(String cod_cat){
        Statement st=null;
        Connection con=null;
        String sql;
        try {
            con=Conexion.Bases.DatabaseConnection.getConnection();
            st=con.createStatement();
            sql="delete from categoria where cod_cat like '%" +cod_cat+ "%'";
            st.executeUpdate(sql);
        }catch (SQLException ex){
            System.out.println("Error "+ex.getMessage());
        }
        try {
            if (st!=null && st.isClosed()){
                st.close();
            }
        } catch (SQLException ex) {
            System.out.println("No se cerro correctamente "+ex.getMessage());
        }
        try {
            if(con!=null && con.isClosed()){
                con.close();
            }
        } catch (SQLException ex) {
            System.out.println("No se cerro correctamente" +ex.getMessage());
        }
    }
}
