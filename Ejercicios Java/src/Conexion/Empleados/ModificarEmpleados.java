package Conexion.Empleados;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ModificarEmpleados {
    public static void main(String[] args) {
        Connection con =null;
        Statement st =null;
        String sql;
        try {
            con=Conexion.Bases.DatabaseConnection.getConnection();
            st = con.createStatement();

            sql = "Update empleados set sueldo = sueldo * 2";
            st.executeUpdate(sql);

            sql = "Update empleados set departamento = 20 where num = 1";
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
