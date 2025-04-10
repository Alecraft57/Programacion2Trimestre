package Interfaces_Graficas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class El_Destructor {
    public static void main(String[] args) {
        final int[] contarGalletas = {0};
        ArrayList<JFrame> galletas = new ArrayList<>();

        JFrame ventanaprincipal = new JFrame("El Destructor");
        ventanaprincipal.setSize(300,20);
        JButton CrearCaos = new JButton("Que empiece el Caos");
        CrearCaos.setSize(20,30);
        JButton EliminarCaos = new JButton("Adios al Caos");
        EliminarCaos.setSize(2,3);
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout());
        panelBotones.add(CrearCaos);
        panelBotones.add(EliminarCaos);
        ventanaprincipal.add(panelBotones);
        ventanaprincipal.setVisible(true);
        CrearCaos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contarGalletas[0]++;
            JFrame ventanassecundarias = new JFrame("Galleta "+contarGalletas[0]);
            ventanassecundarias.setVisible(true);
            ventanassecundarias.setSize(200,300);
            ventanassecundarias.setLocationRelativeTo(null);
            JButton Autodes=new JButton("Autodestruccion");
            ventanassecundarias.add(Autodes);
            Autodes.setBackground(Color.BLACK);
            Autodes.setForeground(Color.green);
            Autodes.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    for (JFrame galleta : galletas) {
                        galleta.dispose();
                    }
                }
            });
                galletas.add(ventanassecundarias);
            }
        });
        EliminarCaos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame borrar = new JFrame();
                borrar.remove(borrar);
                if(!galletas.isEmpty()){
                    JFrame eliminar = galletas.removeLast();
                    eliminar.dispose();
                }else{
                    System.out.println("No existen hijas");
                }
            }
        });
    }
}
