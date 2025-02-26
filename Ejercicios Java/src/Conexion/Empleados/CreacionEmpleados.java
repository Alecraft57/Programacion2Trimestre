package Conexion.Empleados;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreacionEmpleados {
    static java.sql.Connection conn=null;
    public static void main(String[] args) throws SQLException {
        Statement stmt=null;
        String createEmpleados = "Create table Empleados (" +
                                    " num integer primary key, "+
                                    " Nombre varchar(255),"+
                                    " Departamento integer,"+
                                    " edad integer,"+
                                    " sueldo integer);";
            try {
            conn = DatabaseConnection.getConnection();
            stmt = conn.createStatement();
            stmt.executeUpdate(createEmpleados);
        } catch (SQLException ex) {
                System.out.println("Error "+ ex.getMessage());
        }finally{
                try{
                    if(stmt != null && !stmt.isClosed()){
                        stmt.close();
                    }
                }catch (SQLException ex){
                    System.out.println("No se ha podido cerrar el Statement por alguna razon"+ ex.getMessage());
                }
            }
        }
    }

