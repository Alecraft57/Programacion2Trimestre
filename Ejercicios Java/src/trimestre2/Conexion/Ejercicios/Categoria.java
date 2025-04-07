package trimestre2.Conexion.Ejercicios;

import java.sql.*;

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
            con= trimestre2.Conexion.Bases.DatabaseConnection.getConnection();
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
            con= trimestre2.Conexion.Bases.DatabaseConnection.getConnection();
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
    public void mostrar(String cod_cat) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            con = trimestre2.Conexion.Bases.DatabaseConnection.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("select * from categoria where cod_cat like '%" + cod_cat + "%' order by cod_cat");

            System.out.println("cod_cat | \tdescripcio");
            System.out.println("-----------------------------------");

            while (rs.next()) {
                System.out.print(rs.getString(1) + " |\t");
                System.out.print(rs.getString(2) + " |\t");

            }
        } catch (SQLException ex) {
            System.out.println("Error " + ex.getMessage());
        } finally {
            try {
                if (st != null && !st.isClosed()) {
                    st.close();
                }
            } catch (SQLException ex) {
                System.out.println("No se ha podido cerrar " + ex.getMessage());
            }
            try {
                if (con != null && !con.isClosed()) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println("No se ha podido cerrar " + ex.getMessage());
            }
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
            } catch (SQLException ex) {
                System.out.println("No se ha podido cerrar " + ex.getMessage());
            }
        }
    }
    public void modificar(String sust,String un,String dos){
        Connection con =null;
        Statement st =null;
        String sql;
        try {
            con= trimestre2.Conexion.Bases.DatabaseConnection.getConnection();
            st = con.createStatement();
            sql = "Update categoria set " + sust + " = '" + dos + "' where " + sust + " = '" + un + "'";
            st.executeUpdate(sql);
        }catch (SQLException ex){
            System.out.println("Error "+ex.getMessage());
        }finally {
            try {
                if (st != null && !st.isClosed()) {
                    st.close();
                }
            } catch (SQLException ex) {
                System.out.println("No se ha podido cerrar " + ex.getMessage());
            }
            try {
                if (con != null && !con.isClosed()) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println("No se ha podido cerrar " + ex.getMessage());
            }
        }
    }
}
