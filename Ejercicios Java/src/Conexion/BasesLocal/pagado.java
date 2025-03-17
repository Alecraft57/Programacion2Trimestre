package Conexion.BasesLocal;

import org.checkerframework.checker.units.qual.C;

import java.sql.*;

public class pagado {

    public void creartabla(){
        Connection con=DBconexion.conectar();
        if(con==null)return;
        String sql="Create table pagado (id_pagado integer, id_reserva integer, estado text, primary key (id_pagado), foreign key (id_reserva) references reservas (id_reserva))";
        try (Statement st=con.createStatement()){
            st.execute(sql);
            System.out.println("Creada!");
        }catch (SQLException ex){
            System.out.println("Error, motivo: "+ex.getMessage());
        }finally {
            DBconexion.cerrar(con);
        }
    }
    public void insertar(int id_pagado, int id_reserva, String estado){
        Connection con=DBconexion.conectar();
        if(con==null)return;
        String sql="Insert into pagado (id_pagado,id_reserva,estado) values(?,?,?)";
        try (PreparedStatement pst=con.prepareStatement(sql)){
            pst.setInt(1,id_pagado);
            pst.setInt(2,id_reserva);
            pst.setString(3,estado);
            pst.execute();
        }catch (SQLException e){
            System.out.println("Error, motivo: "+e.getMessage());
        }finally {
            DBconexion.cerrar(con);
        }
    }
    public void eliminar(int id_pagado){
        Connection con=DBconexion.conectar();
        if(con==null)return;
        String sql="delete from pagado where id_pagado=?";
        try (PreparedStatement pst=con.prepareStatement(sql)){
            pst.setInt(1,id_pagado);
            pst.execute();
        }catch (SQLException e){
            System.out.println("Error, motivo: "+e.getMessage());
        }finally {
            DBconexion.cerrar(con);
        }
    }
    public void consultar(int id_pagado) {
        Connection con = DBconexion.conectar();
        if (con == null) return;
        String sql = "select * from pagado where id_pagado=?";
        try (PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1,id_pagado);
            ResultSet rs = pst.executeQuery();
            System.out.println("id_pagado | \t\t id_reserva | \t\t estado |");
            System.out.println("--------------------------------------------------------------");
            while (rs.next()) {
                System.out.print(rs.getInt(1) + " | \t\t");
                System.out.print(rs.getInt(2) + " | \t\t");
                System.out.print(rs.getString(3) + " | \n");
            }
        } catch (Exception e) {
            System.out.println("Error, motivo: " + e.getMessage());
        } finally {
            DBconexion.cerrar(con);
        }
    }

}
