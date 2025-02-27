package Conexion.Ejercicios;

public class main {
    public static void main(String[] args) {
        poble pb=new poble(20,"Benicarlo",1);
//        pb.insertar();
//        pb.eliminar();
        client cl=new client(103,"Juan","Calle Mislata",12324,20);
//        cl.insertar();
//        cl.eliminar();
        venedor vn =new venedor(132,"Juan","Xumelos house",12334,20,1);
//        vn.inserter();
//        vn.eliminar();
        Categoria cat=new Categoria("entretainment","Juguetes de ruca");
//        cat.insertar();
//        cat.eliminar();
        factura fac =new factura(6423,"2015-01-20",103,132,21,5);
//        fac.insertar();
//        fac.eliminar();

    }
}
