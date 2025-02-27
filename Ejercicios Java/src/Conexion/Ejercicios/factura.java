package Conexion.Ejercicios;

import java.sql.*;

public class factura {
    private int num_f;
    private  String data;
    private int cod_cli;
    private int cod_ven;
    private int iva;
    private int dte;

    public factura(int num_f,String data, int cod_cli, int cod_ven, int iva, int dte){
        this.num_f=num_f;
        this.data=data;
        this.cod_cli=cod_cli;
        this.cod_ven=cod_ven;
        this.iva=iva;
        this.dte=dte;
    }

    public int getNum_f() {
        return num_f;
    }

    public void setNum_f(int num_f) {
        this.num_f = num_f;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getCod_cli() {
        return cod_cli;
    }

    public void setCod_cli(int cod_cli) {
        this.cod_cli = cod_cli;
    }

    public int getCod_ven() {
        return cod_ven;
    }

    public void setCod_ven(int cod_ven) {
        this.cod_ven = cod_ven;
    }

    public int getDte() {
        return dte;
    }

    public void setDte(int dte) {
        this.dte = dte;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }
    public void insertar(){
        PreparedStatement st=null;
        Connection con=null;
        String sql="insert into factura (num_f,data,cod_cli,cod_ven,iva,dte) values (?,?,?,?,?,?)";
        try {
            con=Conexion.Bases.DatabaseConnection.getConnection();
            st=con.prepareStatement(sql);

            st.setInt(1,getNum_f());
            st.setDate(2,Date.valueOf(getData()));
            st.setInt(3,getCod_cli());
            st.setInt(4,getCod_ven());
            st.setInt(5,getIva());
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
            sql="delete from factura where num_f = "+getNum_f();
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
