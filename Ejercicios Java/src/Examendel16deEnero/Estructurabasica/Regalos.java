package Examendel16deEnero.Estructurabasica;

import java.util.ArrayList;

public class Regalos {
    public static void main(String[]args){
//        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> portales=new ArrayList<>();
        portales.add(3);
        portales.add(2);
        portales.add(5);
        portales.add(1);
        int posicion=portales.get(0);
        System.out.println("Donde aterriza Papa Noel");
//        for(int i:portales){
//            System.out.print(i+" ");
//        }
        System.out.println(portales);
        System.out.println();
        System.out.println("Orden");
        System.out.println();
//        ArrayList<Integer>orden=PortalMasCerca(posicion,portales);
//        for(int i:orden){
//            System.out.print(i+" ");
//        }
        System.out.println(PortalMasCerca(posicion,portales));

        }
        public static ArrayList<Integer> PortalMasCerca(int posicion, ArrayList<Integer> portales) {
            ArrayList<Integer> reparto=new ArrayList<>();
            int portaldondeesta = posicion;
            portales.remove((Integer)posicion);
            while(!portales.isEmpty()) {
                int distMen = 100000;
                int siguiente = -1;
                for (int portal : portales) {
                    int portalcercano = Math.abs(portal - portaldondeesta);
                    if (portalcercano < distMen || (portalcercano == distMen) && portal>siguiente){
                        distMen = portalcercano;
                        siguiente = portal;
                    }
                }
                reparto.add(siguiente);
                portales.remove((Integer) siguiente);
                portaldondeesta = siguiente;
            }
            return reparto;
        }

    }

