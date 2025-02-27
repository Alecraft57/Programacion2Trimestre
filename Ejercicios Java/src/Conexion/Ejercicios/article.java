package Conexion.Ejercicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class article {
    private String cod_a;
    private String descrip;
    private double preu;
    private int stock;
    private int stock_min;
    private String cod_cat;

    public article(String cod_a, String descrip, double preu, int stock, int stock_min, String cod_cat){
        this.cod_a=cod_a;
        this.descrip=descrip;
        this.preu=preu;
        this.stock=stock;
        this.stock_min=stock_min;
        this.cod_cat=cod_cat;
    }

    public String getCod_a() {
        return cod_a;
    }

    public void setCod_a(String cod_a) {
        this.cod_a = cod_a;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock_min() {
        return stock_min;
    }

    public void setStock_min(int stock_min) {
        this.stock_min = stock_min;
    }

    public String getCod_cat() {
        return cod_cat;
    }

    public void setCod_cat(String cod_cat) {
        this.cod_cat = cod_cat;
    }

    public void insertar(){
        Connection con=null;
        PreparedStatement st=null;
        String sql="insert into article (cod_a,descrip,preu,stock,stock_min,cod_cat) values (?,?,?,?,?,?)";
        try {
            con=Conexion.Bases.DatabaseConnection.getConnection();
            st=con.prepareStatement(sql);

            st.setString(1,getCod_a());
            st.setString(2,getDescrip());
            st.setDouble(3,getPreu());
            st.setInt(4,getStock());
            st.setInt(5,getStock_min());
            st.setString(6,getCod_cat());
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
            sql="delete from article where cod_a like '%"+getCod_a()+"%'";
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
