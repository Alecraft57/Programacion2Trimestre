package Conexion.Ejercicios;

import java.sql.*;

public class client {
    private int cod_cli;
    private String nom;
    private String adreca;
    private int cp;
    private int cod_pob;

//    public client(int cod_cli, String nom, String adreca, int cp, int cod_pob){
//        this.cod_cli=cod_cli;
//        this.nom=nom;
//        this.adreca=adreca;
//        this.cp=cp;
//        this.cod_pob=cod_pob;
//    }

//    public int getCod_cli() {
//        return cod_cli;
//    }
//
//    public void setCod_cli(int cod_cli) {
//        this.cod_cli = cod_cli;
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
//    public String getAdreca() {
//        return adreca;
//    }
//
//    public void setAdreca(String adreca) {
//        this.adreca = adreca;
//    }
//
//    public int getCp() {
//        return cp;
//    }
//
//    public void setCp(int cp) {
//        this.cp = cp;
//    }
//
//    public int getCod_pob() {
//        return cod_pob;
//    }
//
//    public void setCod_pob(int cod_pob) {
//        this.cod_pob = cod_pob;
//    }
    public void insertar(int cod_cli, String nom, String adreca, int cp, int cod_pob){
        PreparedStatement st = null;
        Connection con = null;
        String sql = "Insert Into client (cod_cli,nom,adreca,cp,cod_pob) Values (?,?,?,?,?)";
        try {
            con = Conexion.Bases.DatabaseConnection.getConnection();
            st = con.prepareStatement(sql);
//            st.setInt(1,getCod_cli());
//            st.setString(2,getNom());
//            st.setString(3,getAdreca());
//            st.setInt(4,getCp());
//            st.setInt(5,getCod_pob());
//            st.executeUpdate();
            //prueba
            st.setInt(1,cod_cli);
            st.setString(2,nom);
            st.setString(3,adreca);
            st.setInt(4,cp);
            st.setInt(5,cod_pob);
            st.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error "+ex.getMessage());
        }
        try{
            if(st!=null && !st.isClosed()){
                st.close();
            }
        }catch (SQLException ex){
            System.out.println("No se ha podido cerrar "+ex.getMessage());
        }
        try {
            if(con!=null && con.isClosed()){
                con.close();
            }
        }catch (SQLException ex){
            System.out.println("No se ha podido cerrar "+ex.getMessage());
        }
    }
//    public void modificar(){
//        Statement st =null;
//        Connection con=null;
//        String sql;
//        try {
//            con = Conexion.Bases.DatabaseConnection.getConnection();
//            st=con.createStatement();
//            sql = "Update empleados"
//        }
//    }
    public void eliminar(int cod_cli){
        Connection con = null;
        Statement st =null;
        String sql;
        try {
            con = Conexion.Bases.DatabaseConnection.getConnection();
            st=con.createStatement();
            sql="Delete from client where cod_cli ="+cod_cli;
            st.executeUpdate(sql);
        }catch (SQLException ex){
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
        }catch (SQLException ex){
            System.out.println("No se ha podido cerrar "+ex.getMessage());
        }
    }
    public void mostrar(String cod_cli) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            con = Conexion.Bases.DatabaseConnection.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("select * from client where cod_cli like " + cod_cli + " order by cod_cli");

            System.out.println("cod_cli | \tnom | \tadreca | \tcp | \tcod_pob");
            System.out.println("--------------------------------------------------------");

            while (rs.next()) {
                System.out.print(rs.getString(1) + " |\t");
                System.out.print(rs.getString(2) + " |\t");
                System.out.print(rs.getString(3) + " |\t");
                System.out.print(rs.getString(4) + " |\t");
                System.out.print(rs.getString(5) + " |\t");

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
            if(sust.equals("cod_cli") && sust.equals("cp") && sust.equals("cod_pob")){
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
