package Conexion.Ejercicios;

import java.sql.*;

public class poble {
    private int cod_pob;
    private String nom;
    private int cod_pro;

//    public poble(int cod_pob, String nom, int cod_pro){
//        this.cod_pob=cod_pob;
//        this.nom=nom;
//        this.cod_pro=cod_pro;
//    }

//    public int getCod_pob() {
//        return cod_pob;
//    }
//
//    public void setCod_pob(int cod_pob) {
//        this.cod_pob = cod_pob;
//    }
//
//    public String getNom() {
//        return nom;
//    }
//
//    public void setNom(String nom) {
//        this.nom = nom;
//    }
//
//    public int getCod_pro() {
//        return cod_pro;
//    }
//
//    public void setCod_pro(int cod_pro) {
//        this.cod_pro = cod_pro;
//    }
    public void insertar(int cod_pob, String nom, int cod_pro){
        PreparedStatement st=null;
        Connection con=null;
        String sql="insert into poble (cod_pob,nom,cod_pro) values(?,?,?)";
        try {
            con=Conexion.Bases.DatabaseConnection.getConnection();
            st=con.prepareStatement(sql);
//            st.setInt(1,getCod_pob());
//            st.setString(2,getNom());
//            st.setInt(3,getCod_pro());
//            st.executeUpdate();
            //prueba
            st.setInt(1,cod_pob);
            st.setString(2,nom);
            st.setInt(3,cod_pro);
            st.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error "+ex.getMessage());
        }
        try {
            if(st!=null && st.isClosed()){
                st.close();
            }
        } catch (SQLException ex) {
            System.out.println("No se ha podido cerrar "+ex.getMessage());
        }
        try {
            if(con!=null && con.isClosed()){
                con.close();
            }
        } catch (SQLException ex) {
            System.out.println("No se ha podido cerrar "+ex.getMessage());
        }
    }
    public void eliminar(int cod_pob){
        Statement st=null;
        Connection con=null;
        String sql;
        try {
            con=Conexion.Bases.DatabaseConnection.getConnection();
            st=con.createStatement();
            sql="delete from poble where cod_pob = "+cod_pob;
            st.executeUpdate(sql);
        }catch (SQLException ex){
            System.out.println("Error "+ex.getMessage());
        }
        try {
            if(st!=null && st.isClosed()){
                st.close();
            }
        }catch (SQLException ex){
            System.out.println("No se ha podido cerrar "+ex.getMessage());
        }
        try {
            if (con!=null && con.isClosed()){
                con.close();
            }
        }catch (SQLException ex){
            System.out.println("No se ha podido cerrar "+ex.getMessage());
        }
    }
    public void mostrar(String cod_pob) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            con = Conexion.Bases.DatabaseConnection.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("select * from client where cod_pob like " + cod_pob + " order by cod_pob");

            System.out.println("cod_pob | \tnom | \tcod_pro ");
            System.out.println("----------------------------------------");

            while (rs.next()) {
                System.out.print(rs.getString(1) + " |\t");
                System.out.print(rs.getString(2) + " |\t");
                System.out.print(rs.getString(3) + " |\t");
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
            con=Conexion.Bases.DatabaseConnection.getConnection();
            st = con.createStatement();
            if(sust.equals("cod_pob") && sust.equals("cod_pro")){
                sql = "Update article set "+sust+" = "+dos+" where "+sust+" = "+un;
            }else {
                sql = "Update article set " + sust + " = '" + dos + "' where " + sust + " = '" + un + "'";
            }
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
