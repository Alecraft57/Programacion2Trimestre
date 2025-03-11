package Conexion.BasesLocal;

public class main {
    public static void main(String[] args) {
        Eventos e = new Eventos();
        e.insertar(20,"Papillas","20/5/2025",20);
        usuarios u=new usuarios();
        u.insertar(2,"Juan","453454223","VIP");
    }
}
