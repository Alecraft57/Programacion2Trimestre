package Conexion.BasesLocal;

import java.sql.*;

public class usuarios {
    private int id_ubicacion;
    private String nombre;
    private String TF;
    private String tipo_usuario;

    public void insertar(int id_usuarios,String nombre,String TF,String tipo_usuario){
        Connection con=null;
        PreparedStatement st=null;
        String sql="insert into usuarios (id_usuarios,nombre,TF,tipo_usuario) values (?,?,?,?)";
        String url="jdbc:sqlite:Concierto.db";
        try {
            con= DriverManager.getConnection(url);
            System.out.println("La conexion ha sido exitosa(usuario)");

            st=con.prepareStatement(sql);

            st.setInt(1,id_usuarios);
            st.setString(2,nombre);
            st.setString(3,TF);
            st.setString(4,tipo_usuario);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
