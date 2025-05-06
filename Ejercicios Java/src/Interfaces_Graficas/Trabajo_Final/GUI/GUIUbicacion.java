package Interfaces_Graficas.Trabajo_Final.GUI;

import Interfaces_Graficas.Trabajo_Final.BasesLocal.ubicacion;

import javax.swing.*;

public class GUIUbicacion {
    public void mostrar() {
        JFrame Gestion_Ubicacion = new JFrame("Gestión de Ubicación");
        Gestion_Ubicacion.setSize(500, 400);
        Gestion_Ubicacion.setLayout(null);

        JLabel Label_Id = new JLabel("ID Ubicación:");
        Label_Id.setBounds(20, 20, 100, 20);
        JTextField Id_Ubicacion = new JTextField();
        Id_Ubicacion.setBounds(140, 20, 200, 20);

        JLabel Label_IdEvento = new JLabel("ID Evento:");
        Label_IdEvento.setBounds(20, 50, 100, 20);
        JTextField IdEvento_Ubicacion = new JTextField();
        IdEvento_Ubicacion.setBounds(140, 50, 200, 20);

        JLabel Label_Zona = new JLabel("Zona:");
        Label_Zona.setBounds(20, 80, 100, 20);
        JTextField Zona_Ubicacion = new JTextField();
        Zona_Ubicacion.setBounds(140, 80, 200, 20);

        JLabel Label_Capacidad = new JLabel("Capacidad:");
        Label_Capacidad.setBounds(20, 110, 100, 20);
        JTextField Capacidad_Ubicacion = new JTextField();
        Capacidad_Ubicacion.setBounds(140, 110, 200, 20);

        JButton btnInsertar = new JButton("Insertar");
        btnInsertar.setBounds(20, 150, 100, 30);
        Gestion_Ubicacion.add(btnInsertar);

        btnInsertar.addActionListener(e -> {
            try {
                int id = Integer.parseInt(Id_Ubicacion.getText());
                int idEvento = Integer.parseInt(IdEvento_Ubicacion.getText());
                String zona = Zona_Ubicacion.getText();
                int capacidad = Integer.parseInt(Capacidad_Ubicacion.getText());
                ubicacion ubic = new ubicacion();
                ubic.insertar(id, idEvento, zona, capacidad);
                JOptionPane.showMessageDialog(Gestion_Ubicacion, "Ubicación insertada correctamente.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(Gestion_Ubicacion, "Error al insertar ubicación: " + ex.getMessage());
            }
        });

        JButton boton_consultar = new JButton("Consultar Todo");
        boton_consultar.setBounds(140, 150, 140, 30);
        Gestion_Ubicacion.add(boton_consultar);

        boton_consultar.addActionListener(e -> {
            try {
                ubicacion ub = new ubicacion();
                ub.consultartodo();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(Gestion_Ubicacion, "Error: " + ex.getMessage());
            }
        });

        Gestion_Ubicacion.add(Label_Id);
        Gestion_Ubicacion.add(Id_Ubicacion);
        Gestion_Ubicacion.add(Label_IdEvento);
        Gestion_Ubicacion.add(IdEvento_Ubicacion);
        Gestion_Ubicacion.add(Label_Zona);
        Gestion_Ubicacion.add(Zona_Ubicacion);
        Gestion_Ubicacion.add(Label_Capacidad);
        Gestion_Ubicacion.add(Capacidad_Ubicacion);

        Gestion_Ubicacion.setVisible(true);
    }
}