package Conexion.BasesLocal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ubicacion {


    public void creartabla(){
        Connection con=null;
        Statement st=null;
        String sql;
        String url="jdbc:sqlite:Concierto.db";
        try {
            con= DriverManager.getConnection(url);
            st=con.createStatement();
            sql="Create table ubicacion (id_ubicacion integer, id_eventos integer, zona text, capacidad integer,primary key (id_ubicacion),foreign key(id_eventos) references eventos(id_eventos))";
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            if(con!=null && con.isClosed()){
                con.close();
                System.out.println("Conexion cerrada");
            }
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            if(st!=null && st.isClosed()){
                st.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
