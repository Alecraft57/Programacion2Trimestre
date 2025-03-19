package Conexion.BasesLocal;

import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class reserv {

//    public void menu(){
//        Scanner sc=new Scanner(System.in);
//        int opcion;
//        do{
//            System.out.println("-1: insertar\n-2: eliminar(basandote en un id)\n-3: consulta(basandote en un id)\n-4: actualizar\n-5: consulta todas las tablas\n-6: Salir");
//            opcion=sc.nextInt();
//            switch (opcion){
//                case 1:createtable();
//                case 2:insertar();
//            }
//        }while (opcion!=6);
//    }
    public void createtable(){
        String sql="Create table reserv(id_reserv,id_eventos,id_usuarios,fecha,primary key(id_reserv),foreign key(id_eventos) references eventos,foreign key(id_usuarios) references usuarios)";
        try (Connection con=Conexion.Bases.DatabaseConnection.getConnection();
             PreparedStatement pst=con.prepareStatement(sql)){
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    public void insertar(int id_reserv,int id_eventos,int id_usuarios,String fecha){
        String sql="Insert into reserv (id_reserv,id_eventos,id_usuarios,fecha) values (?,?,?,?)";
        try (Connection con=DBconexion.conectar();
        PreparedStatement pst=con.prepareStatement(sql)){
            pst.setInt(1,id_reserv);
            pst.setInt(2,id_eventos);
            pst.setInt(3,id_usuarios);
            pst.setString(4,fecha);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error "+e.getMessage());
        }
    }
    public void eliminar(int id_reserv){
        String sql="delete from reserv where id_reserv=?";
        try (Connection con=DBconexion.conectar();
            PreparedStatement pst=con.prepareStatement(sql)){
            pst.setInt(1,id_reserv);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error "+e.getMessage());
        }
    }
    public void consultar(int id_reserv){
        String sql="select * from reserv where id_reserv=?";
        try (Connection con=DBconexion.conectar();
            PreparedStatement pst=con.prepareStatement(sql);
             ResultSet rs=pst.executeQuery()){
            System.out.println("id_reserv | \t\t id_eventos | \t\t id_usuarios | \t\t fecha |");
            System.out.println("----------------------------------------------------------------------------------");
            while (rs.next()){
                System.out.print(rs.getInt(1+ " | \t\t"));
                System.out.print(rs.getInt(2+ " | \t\t"));
                System.out.print(rs.getInt(3+ " | \t\t"));
                System.out.print(rs.getString(4+ " |\n"));

            }
        }catch (SQLException e){
            System.out.println("Error "+e.getMessage());
        }
    }
    public void actualizar(int id_reserv,String fecha){
        String sql="Update table reserv set fecha = '?' where id_reserv = ?";
        try (Connection con=DBconexion.conectar();
            PreparedStatement pst=con.prepareStatement(sql)){
            pst.setString(1,fecha);
            pst.setInt(2,id_reserv);
            pst.executeUpdate();
        }catch (SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    public void consultartodo(){
        String sql="select * from reserv";
        try (Connection con=DBconexion.conectar();
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery()){
            System.out.println("id_reserv | \t\t id_eventos | \t\t id_usuarios | \t\t fecha |");
            System.out.println("----------------------------------------------------------------------------------");
            while (rs.next()){
                System.out.print(rs.getInt(1+ " | \t\t"));
                System.out.print(rs.getInt(2+ " | \t\t"));
                System.out.print(rs.getInt(3+ " | \t\t"));
                System.out.print(rs.getString(4+ " |\n"));
            }
        }catch (SQLException e){
            System.out.println("Error, "+e.getMessage());
        }
    }
}
