package OrientadaAObjetos.EntidadRelacio.Ejercicio5;

public class MainBanco {
    public static void main(String[] args) {
        Banc banco1 = new Banc(6);
        Sucursal sucursal1 = new Sucursal(2,banco1);
        Client client1= new Client(23242323);
        Prestec prestec1 = new Prestec(20,sucursal1,client1);
        Compte compte1 = new Compte(20232423,sucursal1);
        Domiciliacio domiciliacio1 = new Domiciliacio(232,compte1);
        System.out.println(banco1);
        System.out.println(sucursal1);
        System.out.println(client1);
        System.out.println(prestec1);
        System.out.println(compte1);
        System.out.println(domiciliacio1);
    }
}
