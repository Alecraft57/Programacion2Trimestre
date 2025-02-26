package Conexion.Empleados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertarEmpleados {
    public static void main(String[] args) {
        PreparedStatement st = null;
        Connection con = null;
        String sql = "Insert Into empleados (num, nombre,departamento,edad,sueldo) Values (?,?,?,?,?)";
        try {
            con = Conexion.Bases.DatabaseConnection.getConnection();
            st = con.prepareStatement(sql);

            st.setInt(1,1);
            st.setString(2,"Juan");
            st.setInt(3,10);
            st.setInt(4,32);
            st.setInt(5,1300);
            st.executeUpdate();

            st.setInt(1,2);
            st.setString(2,"Maria");
            st.setInt(3,11);
            st.setInt(4,20);
            st.setInt(5,1000);
            st.executeUpdate();
        }catch (SQLException ex){
            System.out.println("Error "+ ex.getMessage());
        }finally{
            try {
                if (st != null && !st.isClosed()){
                    st.close();
                }
            }catch (SQLException ex){
                System.out.println("No se ha podido cerrar "+ ex.getMessage());
            }
            try{
                if (con != null && !con.isClosed()){
                    con.close();
                }
            }catch (SQLException ex){
                System.out.println("No se ha podido cerrar "+ex.getMessage());
            }
        }
    }
}
