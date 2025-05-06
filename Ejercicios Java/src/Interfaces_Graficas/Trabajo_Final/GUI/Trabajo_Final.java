package Interfaces_Graficas.Trabajo_Final.GUI;
import Interfaces_Graficas.Trabajo_Final.BasesLocal.Eventos;
import Interfaces_Graficas.Trabajo_Final.BasesLocal.ubicacion;
import Interfaces_Graficas.Trabajo_Final.BasesLocal.usuarios;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class Trabajo_Final {
    public static void main(String[] args) {
        JFrame Login_Main = new JFrame("Login a la Base de Datos");
        Login_Main.setSize(700,400);
        //recuadro
        JPanel loginBox = new JPanel(null);
        loginBox.setBounds(280, 100, 150, 150);
        loginBox.setBorder(new LineBorder(Color.BLACK, 2));
        Login_Main.add(loginBox);
        //Login
        JLabel Login = new JLabel();
        JTextField Login_titulo = new JTextField();
        Login_titulo.setText("Login");
        Login_titulo.setBounds(300,120,105,20);
        Login_titulo.setHorizontalAlignment(JTextField.CENTER);
        Login_titulo.setEditable(false);
        Login_titulo.setBackground(Color.BLACK);
        Login_titulo.setForeground(Color.WHITE);
        Login_Main.add(Login_titulo);
        //Nombre_Login
        JTextField Login_nombre = new JTextField("Nombre..",2);
        Login_nombre.setBounds(300,170 ,105,20);
        Login_titulo.setHorizontalAlignment(JTextField.CENTER);
        Login_nombre.setEditable(true);
        Login_Main.add(Login_nombre);
        //Boton_Login
        Button Login_Boton = new Button("Entrar");
        Login_Boton.setBounds(20, 100, 105, 20);
        loginBox.add(Login_Boton);
        Login_Boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre_login = Login_nombre.getText();
                JLabel Main_label = new JLabel();
                JFrame Main = new JFrame("Base de Datos");
                Main.setSize(700,200);
                JLabel Saludo_Superior = new JLabel();
                Saludo_Superior.setBounds(10, 10, 300, 20);
                Saludo_Superior.setText("Bienvenido a la Base de Datos "+nombre_login);
                Main.add(Saludo_Superior);
                Main.add(Main_label);
                Main.setLayout(null);
                // Botón Eventos
                Button boton_eventos = new Button("Eventos");
                boton_eventos.setBounds(140, 60, 120, 30);
                Main.add(boton_eventos);
                boton_eventos.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Eventos ev = new Eventos();
                        ev.creartabla();
                        GUIEventos GUIEventos = new GUIEventos();
                        GUIEventos.mostrar();
                    }
                });
                // Botón Ubicación
                Button boton_ubicacion = new Button("Ubicación");
                boton_ubicacion.setBounds(290, 60, 120, 30);
                Main.add(boton_ubicacion);
                boton_ubicacion.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ubicacion ub = new ubicacion();
                        ub.creartabla();
                        GUIUbicacion gui = new GUIUbicacion();
                        gui.mostrar();
                    }
                });
                // Botón Usuarios
                Button boton_usuarios = new Button("Usuarios");
                boton_usuarios.setBounds(440, 60, 120, 30);
                Main.add(boton_usuarios);
                boton_usuarios.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        usuarios us = new usuarios();
                        us.creartabla();
                        GUIUsuarios gui = new GUIUsuarios();
                        gui.mostrar();
                    }
                });
                Main.setVisible(true);
            }
        });
        //Final del Frame principal
        Login_Main.add(Login);
        Login_Main.setVisible(true);

    }
}
