package trimestre2.Conexion.Empleados;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultarEmpleados {
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            con = trimestre2.Conexion.Bases.DatabaseConnection.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("select * from empleados order by num");

            System.out.println("Num. \tNombre \tDep \tEdad \tSueldo");
            System.out.println("---------------------------------------------------");

            while (rs.next()) {
                System.out.print(rs.getInt(1) + "\t\t");
                System.out.print(rs.getString(2) + "\t\t");
                System.out.print(rs.getInt(3) + "\t\t");
                System.out.print(rs.getInt(4) + "\t\t");
                System.out.print(rs.getInt(5)+"\n");

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
}
