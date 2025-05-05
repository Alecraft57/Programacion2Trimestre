package Interfaces_Graficas.Trabajo_Final.BasesLocal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconexion {
    private static final String DB_NAME = "Concierto.db";
    private static final String url = "jdbc:sqlite:" + DB_NAME;

    public static Connection conectar(){
        try{
            return DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println("Error en la conexion "+e.getMessage());
            return null;
        }
    }

    public static void cerrar(Connection con){
        if(con!=null){
            try {
                con.close();
                System.out.println("Se cerró correctamente");
            } catch (SQLException e) {
                System.out.println("No se ha podido cerrar "+e.getMessage());
            }
        }
    }
}
