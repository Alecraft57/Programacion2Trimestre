package Conexion.Ejercicios;

import java.sql.*;

public class linia_fac {
    private int num_f;
    private int num_l;
    private String cod_a;
    private int quant;
    private double preu;
    private int dte;

//    public linia_fac(int num_f,int num_l,String cod_a, int quant, double preu, int dte){
//        this.num_f=num_f;
//        this.num_l=num_l;
//        this.cod_a=cod_a;
//        this.quant=quant;
//        this.preu=preu;
//        this.dte=dte;
//    }

//    public int getNum_f() {
//        return num_f;
//    }
//
//    public void setNum_f(int num_f) {
//        this.num_f = num_f;
//    }
//
//    public int getNum_l() {
//        return num_l;
//    }
//
//    public void setNum_l(int num_l) {
//        this.num_l = num_l;
//    }
//
//    public String getCod_a() {
//        return cod_a;
//    }
//
//    public void setCod_a(String cod_a) {
//        this.cod_a = cod_a;
//    }
//
//    public int getQuant() {
//        return quant;
//    }
//
//    public void setQuant(int quant) {
//        this.quant = quant;
//    }
//
//    public double getPreu() {
//        return preu;
//    }
//
//    public void setPreu(double preu) {
//        this.preu = preu;
//    }
//
//    public int getDte() {
//        return dte;
//    }
//
//    public void setDte(int dte) {
//        this.dte = dte;
//    }

    public void insertar(int num_f,int num_l,String cod_a, int quant, double preu, int dte){
        PreparedStatement st=null;
        Connection con=null;
        String sql="insert into linia_fac (num_f,num_l,cod_a,quant,preu,dte) values (?,?,?,?,?,?)";

        try {
            con=Conexion.Bases.DatabaseConnection.getConnection();
            st=con.prepareStatement(sql);

//            st.setInt(1,getNum_f());
//            st.setInt(2,getNum_l());
//            st.setString(3,getCod_a());
//            st.setInt(4,getQuant());
//            st.setDouble(5,getPreu());
//            st.setInt(6,getDte());
//            st.executeUpdate();
            //prueba
            st.setInt(1,num_f);
            st.setInt(2,num_l);
            st.setString(3,cod_a);
            st.setInt(4,quant);
            st.setDouble(5,preu);
            st.setInt(6,dte);
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
    public void eliminar(int num_l){
        Statement st=null;
        Connection con=null;
        String sql;

        try {
            con=Conexion.Bases.DatabaseConnection.getConnection();
            st=con.createStatement();

            sql="delete from linia_fac where num_l = "+num_l;
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
    public void mostrar(String num_l) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            con = Conexion.Bases.DatabaseConnection.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("select * from client where num_l like " + num_l + " order by num_l");

            System.out.println("num_f | \tnum_l | \tcod_a | \tquant | \tpreu | \tdte");
            System.out.println("---------------------------------------------------------------");

            while (rs.next()) {
                System.out.print(rs.getString(1) + " |\t");
                System.out.print(rs.getString(2) + " |\t");
                System.out.print(rs.getString(3) + " |\t");
                System.out.print(rs.getString(4) + " |\t");
                System.out.print(rs.getString(5) + " |\t");
                System.out.print(rs.getString(6) + " |\t");
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
            if(sust.equals("num_f") && sust.equals("num_l") && sust.equals("quant") && sust.equals("preu") && sust.equals("dte")){
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
