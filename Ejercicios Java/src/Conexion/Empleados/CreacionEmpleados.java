package Conexion.Empleados;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreacionEmpleados {
    public static void main(String[] args) {
        String createEmpleados = "Create table Empleados (" +" num integer primary key, "+" Nombre varchar(255),"+ " Departamento integer,"+" edad integer,"+" sueldo integer);";
            try (
            Connection conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(createEmpleados){
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        }
    }

