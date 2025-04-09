package Interfaces_Graficas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class El_Destructor {
    public static void main(String[] args) {
        JFrame ventanaprincipal = new JFrame("El Destructor");
        ventanaprincipal.setSize(500,300);
        JButton CrearCaos = new JButton("Que empiece el Caos");
        CrearCaos.setSize(20,30);
        ventanaprincipal.add(CrearCaos);
        JButton EliminarCaos = new JButton("Adios al Caos");
        EliminarCaos.setSize(2,3);
        ventanaprincipal.add(EliminarCaos);
        ventanaprincipal.setVisible(true);
        CrearCaos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            JFrame ventanassecundarias = new JFrame();
            }
        });
    }
}
