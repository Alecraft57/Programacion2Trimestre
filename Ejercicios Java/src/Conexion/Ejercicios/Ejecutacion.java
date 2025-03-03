package Conexion.Ejercicios;

import java.util.Scanner;

public class Ejecutacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ResCont;
        System.out.println("Que tabla quieres modificar?");
        String tabla = sc.nextLine();
        switch (tabla) {
            case "article":
                article a = new article();
                System.out.println("Quieres insertar o elimiar contenido?");
                ResCont = sc.nextLine();
                switch (ResCont) {
                    case "insertar":
                        System.out.println("Dime el codigo autor");
                        String cod_a = sc.nextLine();
                        System.out.println("Dime el la descripcion");
                        String descrip = sc.nextLine();
                        System.out.println("Dime el precio");
                        double preu = sc.nextDouble();
                        System.out.println("Dime el stock");
                        int stock = sc.nextInt();
                        System.out.println("Dime el stock minimo");
                        int stock_min = sc.nextInt();
                        sc.nextLine();
                        while (stock_min > stock) {
                            System.out.println("Error, el stock debe ser mas grande que el stock minimo. Dime el stock");
                            stock = sc.nextInt();
                            System.out.println("Dime el stock_min");
                            stock_min = sc.nextInt();
                        }
                        System.out.println("Dime la categoria");
                        String cod_cat = sc.nextLine();
                        a.insertar(cod_a, descrip, preu, stock, stock_min, cod_cat);
                        break;
                    case "eliminar":
                        System.out.println("Dime el codigo del articulo que quieras eliminar");
                        String eliminar = sc.nextLine();
                        a.eliminar(eliminar);
                        break;
                    default:
                        System.out.println("Debe ser ingresar o eliminar");
                }
                break;
            case "categoria":
                Categoria cat = new Categoria();
                System.out.println("Quieres insertar o elimiar contenido?");
                ResCont = sc.nextLine();
                switch (ResCont) {
                    case "insertar":
                        System.out.println("Dime la categoria");
                        String cod_cat = sc.nextLine();
                        System.out.println("Dime su descripcion");
                        String descrip = sc.nextLine();
                        cat.insertar(cod_cat, descrip);
                        break;
                    case "eliminar":
                        System.out.println("Dime la categoria que quieras eliminar");
                        String eliminar = sc.next();
                        cat.eliminar(eliminar);
                        break;
                    default:
                        System.out.println("Debe ser ingresar o eliminar");
                }
                break;
            case "client":
                client cli = new client();
                System.out.println("Quieres insertar o elimiar contenido?");
                ResCont = sc.nextLine();
                switch (ResCont) {
                    case "insertar":
                        System.out.println("Dime el codigo de cliente");
                        int cod_cli = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Dime su nombre");
                        String nom = sc.nextLine();
                        System.out.println("Dime su adreca");
                        String adreca = sc.nextLine();
                        System.out.println("Dime el codigo postal");
                        int cp = sc.nextInt();
                        System.out.println("Dime el codigo del pueblo");
                        int cod_pob = sc.nextInt();
                        cli.insertar(cod_cli, nom, adreca, cp, cod_pob);
                        break;
                    case "eliminar":
                        System.out.println("Dime el codigo del cliente que quieras eliminar");
                        int eliminar = sc.nextInt();
                        cli.eliminar(eliminar);
                        break;
                    default:
                        System.out.println("Debe ser ingresar o eliminar");
                }
                break;
            case "factura":
                factura fac = new factura();
                System.out.println("Quieres insertar o elimiar contenido?");
                ResCont = sc.nextLine();
                switch (ResCont) {
                    case "insertar":
                        System.out.println("Dime el numero factura");
                        int num_f = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Dime su fecha de creacion (tiene que ser este formato(yyyy/mm/dd)");
                        String data = sc.nextLine();
                        System.out.println("Dime el codigo del cliente");
                        int cod_cli = sc.nextInt();
                        System.out.println("Dime el codigo del vendedor");
                        int cod_ven = sc.nextInt();
                        System.out.println("Dime el IVA");
                        int iva = sc.nextInt();
                        System.out.println("Dime el descuento");
                        int dte = sc.nextInt();
                        fac.insertar(num_f, data, cod_cli, cod_ven, iva, dte);
                        break;
                    case "eliminar":
                        System.out.println("Dime el codigo de la factura que quieras eliminar");
                        int eliminar = sc.nextInt();
                        fac.eliminar(eliminar);
                        break;
                    default:
                        System.out.println("Debe ser ingresar o eliminar");
                }
                break;
            case "linia_fac":
                linia_fac lf = new linia_fac();
                System.out.println("Quieres insertar o elimiar contenido?");
                ResCont = sc.nextLine();
                switch (ResCont) {
                    case "insertar":
                        System.out.println("Dime el numero factura");
                        int num_f = sc.nextInt();
                        System.out.println("Dime el numero de linia factura");
                        int num_l = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Dime el codigo del articulo");
                        String art = sc.nextLine();
                        System.out.println("Dime la cantidad");
                        int quant = sc.nextInt();
                        System.out.println("Dime el precio");
                        int preu = sc.nextInt();
                        System.out.println("Dime el descuento");
                        int dte = sc.nextInt();
                        lf.insertar(num_f, num_l, art, quant, preu, dte);
                        break;
                    case "eliminar":
                        System.out.println("Dime el codigo la linia factura que quieras eliminar");
                        int eliminar = sc.nextInt();
                        lf.eliminar(eliminar);
                        break;
                    default:
                        System.out.println("Debe ser ingresar o eliminar");
                }
                break;
            case "poble":
                poble pob = new poble();
                System.out.println("Quieres insertar o elimiar contenido?");
                ResCont = sc.nextLine();
                switch (ResCont) {
                    case "insertar":
                        System.out.println("Dime el codigo del pueblo");
                        int cod_pob = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Dime el nombre del pueblo");
                        String nom = sc.nextLine();
                        System.out.println("Dime el codigo de la provincia");
                        int cod_pro = sc.nextInt();
                        pob.insertar(cod_pob, nom, cod_pro);
                        break;
                    case "eliminar":
                        System.out.println("Dime el codigo del pueblo que quieras eliminar");
                        int eliminar = sc.nextInt();
                        pob.eliminar(eliminar);
                        break;
                    default:
                        System.out.println("Debe ser ingresar o eliminar");
                }
                break;
            case "venedor":
                venedor ven = new venedor();
                System.out.println("Quieres insertar o elimiar contenido?");
                ResCont = sc.nextLine();
                switch (ResCont) {
                    case "insertar":
                        System.out.println("Dime el codigo de vendedor");
                        int cod_ven = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Dime su nombre");
                        String nom = sc.nextLine();
                        System.out.println("Dime su adreca");
                        String adreca = sc.nextLine();
                        System.out.println("Dime el codigo postal");
                        int cp = sc.nextInt();
                        System.out.println("Dime el codigo del pueblo");
                        int cod_pob = sc.nextInt();
                        System.out.println("Dime el codigo capital");
                        int cod_cap = sc.nextInt();
                        ven.insertar(cod_ven, nom, adreca, cp, cod_pob, cod_cap);
                        break;
                    case "eliminar":
                        System.out.println("Dime el codigo del venedor que quieras eliminar");
                        int eliminar = sc.nextInt();
                        ven.eliminar(eliminar);
                        break;
                    default:
                        System.out.println("Debe ser ingresar o eliminar");
                }
                break;
            default:
                System.out.println("No coincide con ninguna tabla");
        }
    }
}
