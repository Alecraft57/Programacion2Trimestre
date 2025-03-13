package Conexion.BasesLocal;

import OrientadaAObjetos.EntidadRelacio.Ejemplos.Person;

import java.sql.*;

public class Reservas {


    public void creartabla(){
        Connection con=DBconexion.conectar();
        if(con==null)return;
        String sql="Create table reservas(id_reserva integer, id_usuario integer, id_eventos integer, fecha text,primary key(id_reserva),foreign key(id_usuario) references usuarios(id_usuario),foreign key(id_eventos) references eventos(id_eventos))";
        try (Statement st=con.createStatement()){
            st.execute(sql);
            System.out.println("Creada!!!");
        } catch (SQLException e) {
            System.out.println("No se ha podido crear, motivo: "+e.getMessage());
        }finally {
            DBconexion.cerrar(con);
        }
    }

    public void insertar(int id_reserva,int id_usuario, int id_eventos, String fecha){
        Connection con=DBconexion.conectar();
        if (con == null) return;
        String sql="insert into reservas(id_reserva,id_usuario,id_eventos,fecha) values(?,?,?,?)";
        try (PreparedStatement st=con.prepareStatement(sql)){
            st.setInt(1,id_reserva);
            st.setInt(2,id_usuario);
            st.setInt(3,id_eventos);
            st.setString(4,fecha);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println("No se ha podido insertar las tablas, motivo: "+e.getMessage());
        }finally {
            DBconexion.cerrar(con);
        }
    }
    public void eliminar(int id_reserva){
        Connection con=DBconexion.conectar();
        if(con==null)return;
        String sql="delete from reservas where id_reserva=?";
        try (PreparedStatement st=con.prepareStatement(sql)){
            st.setInt(1,id_reserva);
            st.executeUpdate();
            System.out.println("Eliminado!!");
        } catch (SQLException e) {
            System.out.println("No se ha podido eliminar, motivo: "+e.getMessage());
        }finally {
            DBconexion.cerrar(con);
        }
    }
    public void consultarid(int id_reserva){
        Connection con=DBconexion.conectar();
        if(con==null)return;
        String sql="select * from reservas where id_reserva = ?";
        try (PreparedStatement st=con.prepareStatement(sql)){
            st.setInt(1,id_reserva);
            ResultSet rs=st.executeQuery();
            System.out.println("id_reserva |\t\t id_usuarios |\t\t id_eventos |\t\t fecha |");
            System.out.println("----------------------------------------------------------------------------------------");
            while (rs.next()){
                System.out.print(rs.getInt(+1)+" | \t\t");
                System.out.print(rs.getInt(2)+" | \t\t");
                System.out.print(rs.getInt(3)+" | \t\t");
                System.out.print(rs.getString(4)+" |\n");
            }
        } catch (SQLException e) {
            System.out.println("No se pudo hacer la consulta por este motivo: "+e.getMessage());
        }finally {
            DBconexion.cerrar(con);
        }
    }
    public void actualizar(int id_reserva,String fecha){
        Connection con=DBconexion.conectar();
        if(con==null)return;
        String sql="update reservas set fecha=? where id_reserva=?";
        try (PreparedStatement st=con.prepareStatement(sql)){
            st.setString(1,fecha);
            st.setInt(2,id_reserva);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println("No se ha podido actualizar fecha, motivo: "+e.getMessage());
        }finally {
            DBconexion.cerrar(con);
        }
    }
    public void consultartodo(){
        Connection con=DBconexion.conectar();
        if(con==null)return;
        String sql="Select * from reservas";
        try (Statement st=con.createStatement()){
            ResultSet rs=st.executeQuery(sql);
            System.out.println("id_reserva |\t\t id_usuarios |\t\t id_eventos |\t\t fecha |");
            System.out.println("----------------------------------------------------------------------------------------");
            while (rs.next()){
                System.out.print(rs.getInt(+1)+" | \t\t");
                System.out.print(rs.getInt(2)+" | \t\t");
                System.out.print(rs.getInt(3)+" | \t\t");
                System.out.print(rs.getString(4)+" |\n");
            }
        } catch (Exception e) {
            System.out.println("Error al consultar, motivo: "+e.getMessage());
        }finally {
            DBconexion.cerrar(con);
        }
    }
}
