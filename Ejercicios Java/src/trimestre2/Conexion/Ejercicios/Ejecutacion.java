package trimestre2.Conexion.Ejercicios;

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
                System.out.println("Quieres insertar, elimiar, consultar o modificar contenido?");
                ResCont = sc.nextLine();
                switch (ResCont) {
                    case "mostrar":
                        System.out.println("Dime que quieres que muestre(Dime el cod_a)");
                        String consulta = sc.nextLine();
                        a.mostrar(consulta);
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
                        a.mostrar(cod_a);
                        break;
                    case "eliminar":
                        System.out.println("Dime el codigo del articulo que quieras eliminar");
                        String eliminar = sc.nextLine();
                        a.eliminar(eliminar);
                        break;
                    case "modificar":
                        System.out.println("Dime que quieres sustituir");
                        String sust = sc.nextLine();
                        switch (sust) {
                            case "cod_a":
                                System.out.println("Dime el cod_a");
                                String c = sc.nextLine();
                                System.out.println("Dime por que quieres sustituirlo");
                                String cc = sc.nextLine();
                                a.modificar(sust, c, cc);
                                break;
                            case "descrip":
                                System.out.println("Dime la descripcion");
                                String d = sc.nextLine();
                                System.out.println("Dime por que quieres sustituirlo");
                                String dd = sc.nextLine();
                                a.modificar(sust, d, dd);
                                break;
                            case "preu":
                                System.out.println("Dime el preu");
                                String p = sc.nextLine();
                                System.out.println("Dime por que quieres sustituirlo");
                                String pp = sc.nextLine();
                                a.modificar(sust, p, pp);
                                break;
                            case "stock":
                                System.out.println("Dime el stock");
                                String s = sc.nextLine();
                                System.out.println("Dime por que quieres sustituirlo");
                                String ss = sc.nextLine();
                                a.modificar(sust, s, ss);
                                break;
                            case "stock_min":
                                System.out.println("Dime el stock_min");
                                String sm = sc.nextLine();
                                System.out.println("Dime por que quieres sustituirlo");
                                String smsm = sc.nextLine();
                                a.modificar(sust, sm, smsm);
                                break;
                            case "cod_cat":
                                System.out.println("Dime el cod_cat");
                                String cat = sc.nextLine();
                                System.out.println("Dime por que quieres sustituirlo");
                                String catcat = sc.nextLine();
                                a.modificar(sust, cat, catcat);
                                break;
                        }
                        break;
                    default:
                        System.out.println("Debe ser mostrar,eliminar,modificar o insertar");
                }
                break;
            case "categoria":
                Categoria cat = new Categoria();
                System.out.println("Quieres insertar o elimiar contenido?");
                ResCont = sc.nextLine();
                switch (ResCont) {
                    case "mostrar":
                        System.out.println("Dime que quieres que muestre(Dime el cod_cat)");
                        String consulta = sc.nextLine();
                        cat.mostrar(consulta);
                    case "insertar":
                        System.out.println("Dime la categoria");
                        String cod_cat = sc.nextLine();
                        System.out.println("Dime su descripcion");
                        String descrip = sc.nextLine();
                        cat.insertar(cod_cat, descrip);
                        cat.mostrar(cod_cat);
                        break;
                    case "eliminar":
                        System.out.println("Dime la categoria que quieras eliminar");
                        String eliminar = sc.next();
                        cat.eliminar(eliminar);
                        break;
                    case "modificar":
                        System.out.println("Dime que quieres sustituir");
                        String sust = sc.nextLine();
                        switch (sust) {
                            case "cod_cat":
                                System.out.println("Dime el cod_cat");
                                String c = sc.nextLine();
                                System.out.println("Dime por que quieres sustituirlo");
                                String cc = sc.nextLine();
                                cat.modificar(sust, c, cc);
                                break;
                            case "descripcio":
                                System.out.println("Dime la descripcio");
                                String d = sc.nextLine();
                                System.out.println("Dime por que quieres sutituirlo");
                                String dd = sc.nextLine();
                                cat.modificar(sust, d, dd);
                                break;
                        }
                    default:
                        System.out.println("Debe ser ingresar o eliminar");
                }
                break;
            case "client":
                client cli = new client();
                System.out.println("Quieres insertar o elimiar contenido?");
                ResCont = sc.nextLine();
                switch (ResCont) {
                    case "mostrar":
                        System.out.println("Dime que quieres que muestre(Dime el cod_cli)");
                        String consulta = sc.nextLine();
                        cli.mostrar(consulta);
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
                        cli.mostrar(String.valueOf(cod_cli));
                        break;
                    case "eliminar":
                        System.out.println("Dime el codigo del cliente que quieras eliminar");
                        int eliminar = sc.nextInt();
                        cli.eliminar(eliminar);
                        break;
                    case "modificar":
                        System.out.println("Dime que quieres sustituir");
                        String sust = sc.nextLine();
                        switch (sust) {
                            case "cod_cli":
                                System.out.println("Dime el cod_cli");
                                String c = sc.nextLine();
                                System.out.println("Dime por que quieres sustituirlo");
                                String cc = sc.nextLine();
                                cli.modificar(sust, c, cc);
                                break;
                            case "nom":
                                System.out.println("Dime el nom");
                                String n = sc.nextLine();
                                System.out.println("Dime por que quieres sutituirlo");
                                String nn = sc.nextLine();
                                cli.modificar(sust, n, nn);
                                break;
                            case "adreca":
                                System.out.println("Dime la adreca");
                                String ad = sc.nextLine();
                                System.out.println("Dime por que quieres sutituirlo");
                                String adad = sc.nextLine();
                                cli.modificar(sust, ad, adad);
                                break;
                            case "cp":
                                System.out.println("Dime el cp");
                                String cpc = sc.nextLine();
                                System.out.println("Dime por que quieres sustituirlo");
                                String cpcp = sc.nextLine();
                                cli.modificar(sust, cpc, cpcp);
                                break;
                            case "cod_pob":
                                System.out.println("Dime el cod_pob");
                                String pob = sc.nextLine();
                                System.out.println("Dime por que quieres sustituirlo");
                                String pobpob = sc.nextLine();
                                cli.modificar(sust, pob, pobpob);
                                break;
                        }
                            default:
                                System.out.println("Debe ser ingresar o eliminar");
                }
                break;
            case "factura":
                factura fac = new factura();
                System.out.println("Quieres insertar o elimiar contenido?");
                ResCont = sc.nextLine();
                switch (ResCont) {
                    case "mostrar":
                        System.out.println("Dime que quieres que muestre(Dime el num_f)");
                        String consulta = sc.nextLine();
                        fac.mostrar(consulta);
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
                        fac.mostrar(String.valueOf(num_f));
                        break;
                    case "eliminar":
                        System.out.println("Dime el codigo de la factura que quieras eliminar");
                        int eliminar = sc.nextInt();
                        fac.eliminar(eliminar);
                        break;
                    case "modificar":
                        System.out.println("Dime que quieres sustituir");
                        String sust = sc.nextLine();
                        switch (sust) {
                            case "num_f":
                                System.out.println("Dime el num_f");
                                String n = sc.nextLine();
                                System.out.println("Dime por que quieres sustituirlo");
                                String nn = sc.nextLine();
                                fac.modificar(sust, n, nn);
                                break;
                            case "data":
                                System.out.println("Dime la fecha");
                                String d = sc.nextLine();
                                System.out.println("Dime por que quieres sutituirlo");
                                String dd = sc.nextLine();
                                fac.modificar(sust, d, dd);
                                break;
                            case "cod_cli":
                                System.out.println("Dime el cod_cli");
                                String c = sc.nextLine();
                                System.out.println("Dime por que quieres sutituirlo");
                                String cc = sc.nextLine();
                                fac.modificar(sust, c, cc);
                                break;
                            case "cod_ven":
                                System.out.println("Dime el cod_ven");
                                String v = sc.nextLine();
                                System.out.println("Dime por que quieres sustituirlo");
                                String vv = sc.nextLine();
                                fac.modificar(sust, v, vv);
                                break;
                            case "iva":
                                System.out.println("Dime el iva");
                                String iv = sc.nextLine();
                                System.out.println("Dime por que quieres sustituirlo");
                                String iviv = sc.nextLine();
                                fac.modificar(sust, iv, iviv);
                                break;
                            case "dte":
                                System.out.println("Dime el dte");
                                String dt = sc.nextLine();
                                System.out.println("Dime por que quieres sustituirlo");
                                String dtdt = sc.nextLine();
                                fac.modificar(sust, dt, dtdt);
                                break;
                        }
                            default:
                                System.out.println("Debe ser ingresar o eliminar");
                }
                break;
            case "linia_fac":
                linia_fac lf = new linia_fac();
                System.out.println("Quieres insertar o elimiar contenido?");
                ResCont = sc.nextLine();
                switch (ResCont) {
                    case "mostrar":
                        System.out.println("Dime que quieres que muestre(Dime el num_l)");
                        String consulta = sc.nextLine();
                        lf.mostrar(consulta);
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
                        lf.mostrar(String.valueOf(num_l));
                        break;
                    case "eliminar":
                        System.out.println("Dime el codigo la linia factura que quieras eliminar");
                        int eliminar = sc.nextInt();
                        lf.eliminar(eliminar);
                        break;
                    case "modificar":
                        System.out.println("Dime que quieres sustituir");
                        String sust = sc.nextLine();
                        switch (sust) {
                            case "num_f":
                                System.out.println("Dime el num_f");
                                String n = sc.nextLine();
                                System.out.println("Dime por que quieres sustituirlo");
                                String nn = sc.nextLine();
                                lf.modificar(sust, n, nn);
                                break;
                            case "num_l":
                                System.out.println("Dime el num_l");
                                String l = sc.nextLine();
                                System.out.println("Dime por que quieres sustituirlo");
                                String ll = sc.nextLine();
                                lf.modificar(sust, l, ll);
                                break;
                            case "cod_a":
                                System.out.println("Dime el cod_a");
                                String cda = sc.nextLine();
                                System.out.println("Dime por que quieres sutituirlo");
                                String cdacda = sc.nextLine();
                                lf.modificar(sust, cda, cdacda);
                                break;
                            case "quant":
                                System.out.println("Dime el quant");
                                String q = sc.nextLine();
                                System.out.println("Dime por que quieres sustituirlo");
                                String qq = sc.nextLine();
                                lf.modificar(sust, q, qq);
                                break;
                            case "preu":
                                System.out.println("Dime el preu");
                                String p = sc.nextLine();
                                System.out.println("Dime por que quieres sustituirlo");
                                String pp = sc.nextLine();
                                lf.modificar(sust, p, pp);
                                break;
                            case "dte":
                                System.out.println("Dime el dte");
                                String dt = sc.nextLine();
                                System.out.println("Dime por que quieres sustituirlo");
                                String dtdt = sc.nextLine();
                                lf.modificar(sust, dt, dtdt);
                                break;
                                }
                            default:
                                System.out.println("Debe ser ingresar o eliminar");
                }
                break;
            case "poble":
                poble pob = new poble();
                System.out.println("Quieres insertar o elimiar contenido?");
                ResCont = sc.nextLine();
                switch (ResCont) {
                    case "mostrar":
                        System.out.println("Dime que quieres que muestre(Dime el cod_pob)");
                        String consulta = sc.nextLine();
                        pob.mostrar(consulta);
                    case "insertar":
                        System.out.println("Dime el codigo del pueblo");
                        int cod_pob = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Dime el nombre del pueblo");
                        String nom = sc.nextLine();
                        System.out.println("Dime el codigo de la provincia");
                        int cod_pro = sc.nextInt();
                        pob.insertar(cod_pob, nom, cod_pro);
                        pob.mostrar(String.valueOf(cod_pob));
                        break;
                    case "eliminar":
                        System.out.println("Dime el codigo del pueblo que quieras eliminar");
                        int eliminar = sc.nextInt();
                        pob.eliminar(eliminar);
                        break;
                    case "modificar":
                        System.out.println("Dime que quieres sustituir");
                        String sust = sc.nextLine();
                        switch (sust) {
                            case "cod_pob":
                                System.out.println("Dime el cod_pob");
                                String p = sc.nextLine();
                                System.out.println("Dime por que quieres sustituirlo");
                                String pp = sc.nextLine();
                                pob.modificar(sust, p, pp);
                                break;
                            case "nom":
                                System.out.println("Dime el nom");
                                String n = sc.nextLine();
                                System.out.println("Dime por que quieres sustituirlo");
                                String nn = sc.nextLine();
                                pob.modificar(sust, n, nn);
                                break;
                            case "cod_pro":
                                System.out.println("Dime el cod_pro");
                                String pr = sc.nextLine();
                                System.out.println("Dime por que quieres sustituirlo");
                                String prpr = sc.nextLine();
                                pob.modificar(sust, pr, prpr);
                                break;
                        }
                    default:
                        System.out.println("Debe ser ingresar o eliminar");
                }
                break;
            case "venedor":
                venedor ven = new venedor();
                System.out.println("Quieres insertar o elimiar contenido?");
                ResCont = sc.nextLine();
                switch (ResCont) {
                    case "mostrar":
                        System.out.println("Dime que quieres que muestre(Dime el cod_ven)");
                        String consulta = sc.nextLine();
                        ven.mostrar(consulta);
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
                        ven.mostrar(String.valueOf(cod_ven));
                        break;
                    case "eliminar":
                        System.out.println("Dime el codigo del venedor que quieras eliminar");
                        int eliminar = sc.nextInt();
                        ven.eliminar(eliminar);
                        break;
                    case "modificar":
                        System.out.println("Dime que quieres sustituir");
                        String sust = sc.nextLine();
                        switch (sust) {
                            case "cod_ven":
                                System.out.println("Dime el cod_ven");
                                String v = sc.nextLine();
                                System.out.println("Dime por que quieres sustituirlo");
                                String vv = sc.nextLine();
                                ven.modificar(sust, v, vv);
                                break;
                            case "nom":
                                System.out.println("Dime el nom");
                                String n = sc.nextLine();
                                System.out.println("Dime por que quieres sustituirlo");
                                String nn = sc.nextLine();
                                ven.modificar(sust, n, nn);
                                break;
                            case "adreca":
                                System.out.println("Dime la adreca");
                                String ad = sc.nextLine();
                                System.out.println("Dime por que quieres sustituirlo");
                                String adad = sc.nextLine();
                                ven.modificar(sust, ad, adad);
                                break;
                            case "cp":
                                System.out.println("Dime el cp");
                                String cp_ven = sc.nextLine();
                                System.out.println("Dime por que quieres sustituirlo");
                                String cp_venn = sc.nextLine();
                                ven.modificar(sust, cp_ven, cp_venn);
                                break;
                            case "cod_pob":
                                System.out.println("Dime el cod_pob");
                                String p = sc.nextLine();
                                System.out.println("Dime por que quieres sustituirlo");
                                String pp = sc.nextLine();
                                ven.modificar(sust, p, pp);
                                break;
                            case "cod_cap":
                                System.out.println("Dime el cod_cap");
                                String cap = sc.nextLine();
                                System.out.println("Dime por que quieres sustituirlo");
                                String capcap = sc.nextLine();
                                ven.modificar(sust, cap, capcap);
                                break;
                        }
                    default:
                        System.out.println("Debe ser ingresar o eliminar");
                }
                break;
            default:
                System.out.println("No coincide con ninguna tabla");
        }
    }
}
