package Conexion.Ejercicios;

import java.sql.*;

public class article {
    private String cod_a;
    private String descrip;
    private double preu;
    private int stock;
    private int stock_min;
    private String cod_cat;

    public article(){
//        this.cod_a=cod_a;
//        this.descrip=descrip;
//        this.preu=preu;
//        this.stock=stock;
//        this.stock_min=stock_min;
//        this.cod_cat=cod_cat;
    }

//    public String getCod_a() {
//        return cod_a;
//    }
//
//    public void setCod_a(String cod_a) {
//        this.cod_a = cod_a;
//    }
//
//    public String getDescrip() {
//        return descrip;
//    }
//
//    public void setDescrip(String descrip) {
//        this.descrip = descrip;
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
//    public int getStock() {
//        return stock;
//    }
//
//    public void setStock(int stock) {
//        this.stock = stock;
//    }
//
//    public int getStock_min() {
//        return stock_min;
//    }
//
//    public void setStock_min(int stock_min) {
//        this.stock_min = stock_min;
//    }
//
//    public String getCod_cat() {
//        return cod_cat;
//    }
//
//    public void setCod_cat(String cod_cat) {
//        this.cod_cat = cod_cat;
//    }

    public void insertar(String cod_a, String descrip, double preu, int stock, int stock_min, String cod_cat){
        Connection con=null;
        PreparedStatement st=null;
        String sql="insert into article (cod_a,descrip,preu,stock,stock_min,cod_cat) values (?,?,?,?,?,?)";
        try {
            con=Conexion.Bases.DatabaseConnection.getConnection();
            st=con.prepareStatement(sql);
//            st.setString(1,getCod_a());
//            st.setString(2,getDescrip());
//            st.setDouble(3,getPreu());
//            st.setInt(4,getStock());
//            st.setInt(5,getStock_min());
//            st.setString(6,getCod_cat());
//            st.executeUpdate();
            //prueba
            st.setString(1,cod_a);
            st.setString(2,descrip);
            st.setDouble(3,preu);
            st.setInt(4,stock);
            st.setInt(5,stock_min);
            st.setString(6,cod_cat);
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
    public void eliminar(String cod_a){
        Statement st=null;
        Connection con=null;
        String sql;
        try {
            con=Conexion.Bases.DatabaseConnection.getConnection();
            st=con.createStatement();
            sql="delete from article where cod_a like '%"+cod_a+"%'";
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
    public void mostrar(String cod_a) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            con = Conexion.Bases.DatabaseConnection.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("select * from article where cod_a like '%" + cod_a + "%' order by cod_a");

            System.out.println("cod_a | \tDescrip | \tpreu | \tstock | \tstock_min | \tcod_cat");
            System.out.println("---------------------------------------------------------------------------");

            while (rs.next()) {
                System.out.print(rs.getString(1) + " |\t");
                System.out.print(rs.getString(2) + " |\t");
                System.out.print(rs.getDouble(3) + " |\t");
                System.out.print(rs.getInt(4) + " |\t");
                System.out.print(rs.getInt(5) + " |\t");
                System.out.print(rs.getString(6) + "\n");

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
            if(sust.equals("preu") && sust.equals("stock") && sust.equals("stock_min")){
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
