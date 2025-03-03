package Conexion.Ejercicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class venedor {
    private int cod_ven;
    private String nom;
    private String adreca;
    private int cp;
    private int cod_pob;
    private int cod_cap;

//    public venedor(int cod_ven, String nom, String adreca, int cp, int cod_pob, int cod_cap){
//        this.cod_ven=cod_ven;
//        this.nom=nom;
//        this.adreca=adreca;
//        this.cp=cp;
//        this.cod_pob=cod_pob;
//        this.cod_cap=cod_cap;
//    }

//    public int getCod_ven() {
//        return cod_ven;
//    }
//
//    public void setCod_ven(int cod_ven) {
//        this.cod_ven = cod_ven;
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
//
//    public int getCod_cap() {
//        return cod_cap;
//    }
//
//    public void setCod_cap(int cod_cap) {
//        this.cod_cap = cod_cap;
//    }
    public void insertar(int cod_ven, String nom, String adreca, int cp, int cod_pob, int cod_cap){
        Connection con=null;
        PreparedStatement st=null;
        String sql="Insert into venedor (cod_ven,nom,adreca,cp,cod_pob,cod_cap) values (?,?,?,?,?,?)";
        try {
            con=Conexion.Bases.DatabaseConnection.getConnection();
            st=con.prepareStatement(sql);

//            st.setInt(1,getCod_ven());
//            st.setString(2,getNom());
//            st.setString(3,getAdreca());
//            st.setInt(4,getCp());
//            st.setInt(5,getCod_pob());
//            st.setInt(6,getCod_cap());
//            st.executeUpdate();
            //prueba
            st.setInt(1,cod_ven);
            st.setString(2,nom);
            st.setString(3,adreca);
            st.setInt(4,cp);
            st.setInt(5,cod_pob);
            st.setInt(6,cod_cap);
            st.executeUpdate();
        }catch (SQLException ex){
            System.out.println("Error "+ex.getMessage());
        }
        try {
            if(st!=null && st.isClosed()){
                st.close();
            }
        } catch (SQLException ex) {
            System.out.println("No se cerro correctamente"+ ex.getMessage());
        }
        try {
            if(con!=null && con.isClosed()){
                con.close();
            }
        } catch (SQLException ex) {
            System.out.println("No se cerro correctamente"+ ex.getMessage());
        }
    }
    public void eliminar(int cod_ven){
        Statement st=null;
        Connection con=null;
        String sql;
        try {
            con=Conexion.Bases.DatabaseConnection.getConnection();
            st=con.createStatement();
            sql="delete from venedor where cod_ven = "+cod_ven;
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
