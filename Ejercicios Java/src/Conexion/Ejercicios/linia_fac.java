package Conexion.Ejercicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class linia_fac {
    private int num_f;
    private int num_l;
    private String cod_a;
    private int quant;
    private double preu;
    private int dte;

    public linia_fac(int num_f,int num_l,String cod_a, int quant, double preu, int dte){
        this.num_f=num_f;
        this.num_l=num_l;
        this.cod_a=cod_a;
        this.quant=quant;
        this.preu=preu;
        this.dte=dte;
    }

    public int getNum_f() {
        return num_f;
    }

    public void setNum_f(int num_f) {
        this.num_f = num_f;
    }

    public int getNum_l() {
        return num_l;
    }

    public void setNum_l(int num_l) {
        this.num_l = num_l;
    }

    public String getCod_a() {
        return cod_a;
    }

    public void setCod_a(String cod_a) {
        this.cod_a = cod_a;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public int getDte() {
        return dte;
    }

    public void setDte(int dte) {
        this.dte = dte;
    }

    public void ingresar(){
        PreparedStatement st=null;
        Connection con=null;
        String sql="inster into linia_fac (num_f,num_l,cod_a,quant,preu,dte) values (?,?,?,?,?,?)";

        try {
            con=Conexion.Bases.DatabaseConnection.getConnection();
            st=con.prepareStatement(sql);

            st.setInt(1,getNum_f());
            st.setInt(2,getNum_l());
            st.setString(3,getCod_a());
            st.setInt(4,getQuant());
            st.setDouble(5,getPreu());
            st.setInt(6,getDte());
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
    public void eliminar(){
        Statement st=null;
        Connection con=null;
        String sql;

        try {
            con=Conexion.Bases.DatabaseConnection.getConnection();
            st=con.createStatement();

            sql="delete from linia_fac where num_l = "+getNum_l();
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
