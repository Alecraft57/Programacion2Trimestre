package Interfaces_Graficas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Primeras_Ventanas extends JFrame {
    public static void main(String[] args) {
        String uno = "Acceder a la ventana secundaria";
        JFrame ventanaPrincipal = new JFrame("Principal");
        ventanaPrincipal.setSize(300,500);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(true);
        ventanaPrincipal.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventanaPrincipal.setLocationRelativeTo(null);
        JButton boton = new JButton(uno);
        boton.setVisible(true);
        ventanaPrincipal.add(boton);
        boton.setSize(200,300);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame ventanaSecundaria = new JFrame("Secundaria");
                ventanaSecundaria.setSize(300,400);
                ventanaSecundaria.setVisible(true);
                ventanaSecundaria.setResizable(true);
                ventanaSecundaria.setLocationRelativeTo(null);
            }
        });
    }
}