package Interfaces_Graficas.Trabajo_Final.GUI;

import Interfaces_Graficas.Trabajo_Final.BasesLocal.Eventos;
import Interfaces_Graficas.Trabajo_Final.BasesLocal.usuarios;

import javax.swing.*;

public class GUIEventos {
    public void mostrar() {
        JFrame Gestion_Eventos = new JFrame("Gestión de Eventos");
        Gestion_Eventos.setSize(500, 400);
        Gestion_Eventos.setLayout(null);

        JLabel Label_Id = new JLabel("ID:");
        Label_Id.setBounds(20, 20, 100, 20);
        JTextField Id_Eventos = new JTextField();
        Id_Eventos.setBounds(120, 20, 200, 20);

        JLabel Label_Nombre = new JLabel("Nombre:");
        Label_Nombre.setBounds(20, 50, 100, 20);
        JTextField Nombre_Eventos = new JTextField();
        Nombre_Eventos.setBounds(120, 50, 200, 20);

        JLabel Label_Fecha = new JLabel("Fecha (DD/MM/YYYY):");
        Label_Fecha.setBounds(20, 80, 150, 20);
        JTextField Fecha_Eventos = new JTextField();
        Fecha_Eventos.setBounds(170, 80, 150, 20);

        JLabel Label_Hora = new JLabel("Hora:");
        Label_Hora.setBounds(20, 110, 100, 20);
        JTextField Hora_Eventos = new JTextField();
        Hora_Eventos.setBounds(120, 110, 200, 20);

        JButton btnInsertar = new JButton("Insertar");
        btnInsertar.setBounds(20, 150, 100, 30);
        Gestion_Eventos.add(btnInsertar);

        btnInsertar.addActionListener(e -> {
            try {
                int id = Integer.parseInt(Id_Eventos.getText());
                String nombre = Nombre_Eventos.getText();
                String fecha = Fecha_Eventos.getText();
                int hora = Integer.parseInt(Hora_Eventos.getText());
                Eventos evento = new Eventos();
                evento.insertar(id, nombre, fecha, hora);
                JOptionPane.showMessageDialog(Gestion_Eventos, "Evento insertado correctamente.");
            } catch (Exception ee) {
                JOptionPane.showMessageDialog(Gestion_Eventos, "Error al insertar evento: " + ee.getMessage());
            }
        });
        JButton boton_consultar = new JButton("Consultar Todo");
        boton_consultar.setBounds(140, 150, 140, 30);
        Gestion_Eventos.add(boton_consultar);

        boton_consultar.addActionListener(e -> {
            try {
                Eventos ev = new Eventos();
                ev.consultar_todo();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(Gestion_Eventos, "Error: " + ex.getMessage());
            }
        });

        Gestion_Eventos.add(Label_Id);
        Gestion_Eventos.add(Id_Eventos);
        Gestion_Eventos.add(Label_Nombre);
        Gestion_Eventos.add(Nombre_Eventos);
        Gestion_Eventos.add(Label_Fecha);
        Gestion_Eventos.add(Fecha_Eventos);
        Gestion_Eventos.add(Label_Hora);
        Gestion_Eventos.add(Hora_Eventos);

        Gestion_Eventos.setVisible(true);
    }
}