package Interfaces_Graficas.Trabajo_Final.GUI;

import Interfaces_Graficas.Trabajo_Final.BasesLocal.ubicacion;
import Interfaces_Graficas.Trabajo_Final.BasesLocal.usuarios;

import javax.swing.*;
import java.awt.*;

public class GUIUsuarios {
    public void mostrar() {
        JFrame Gestion_Usuarios = new JFrame("Gestión de Usuarios");
        Gestion_Usuarios.setSize(500, 400);
        Gestion_Usuarios.setLayout(null);

        JLabel Label_Id = new JLabel("ID:");
        Label_Id.setBounds(20, 20, 100, 20);
        JTextField Id_Usuarios = new JTextField();
        Id_Usuarios.setBounds(120, 20, 200, 20);

        JLabel Label_Nombre = new JLabel("Nombre:");
        Label_Nombre.setBounds(20, 50, 100, 20);
        JTextField Nombre_Usuarios = new JTextField();
        Nombre_Usuarios.setBounds(120, 50, 200, 20);

        JLabel Label_Telefono = new JLabel("Teléfono (XXX-XXX-XXX):");
        Label_Telefono.setBounds(20, 80, 160, 20);
        JTextField Telefono_Usuarios = new JTextField();
        Telefono_Usuarios.setBounds(180, 80, 140, 20);

        JLabel Label_Tipo = new JLabel("Tipo de Usuario:");
        Label_Tipo.setBounds(20, 110, 120, 20);
        JTextField Tipo_Usuarios = new JTextField();
        Tipo_Usuarios.setBounds(140, 110, 180, 20);

        Button Insertar = new Button("Insertar");
        Insertar.setBounds(20, 150, 100, 30);
        Gestion_Usuarios.add(Insertar);

        Insertar.addActionListener(e -> {
            try {
                int id = Integer.parseInt(Id_Usuarios.getText());
                String nombre = Nombre_Usuarios.getText();
                String telefono = Telefono_Usuarios.getText();
                String tipo = Tipo_Usuarios.getText();
                usuarios usuario = new usuarios();
                usuario.insertar(id, nombre, telefono, tipo);
                JOptionPane.showMessageDialog(Gestion_Usuarios, "Usuario insertado correctamente.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(Gestion_Usuarios, "Error al insertar usuario: " + ex.getMessage());
            }
        });

        Button boton_consultar = new Button("Consultar Todo");
        boton_consultar.setBounds(140, 150, 140, 30);
        Gestion_Usuarios.add(boton_consultar);

        boton_consultar.addActionListener(e -> {
            try {
                usuarios us = new usuarios();
                us.consultartodo();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(Gestion_Usuarios, "Error: " + ex.getMessage());
            }
        });
        Button boton_eliminar = new Button("Eliminar");
        boton_eliminar.setBounds(20, 190, 100, 30);
        Gestion_Usuarios.add(boton_eliminar);

        boton_eliminar.addActionListener(e -> {
            int id = Integer.parseInt(Id_Usuarios.getText());
            try {
                usuarios us = new usuarios();
                us.eliminar(id);
                JOptionPane.showMessageDialog(Gestion_Usuarios, "Evento eliminao correctamente.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(Gestion_Usuarios, "Error: " + ex.getMessage());
            }
        });
        Gestion_Usuarios.add(Label_Id);
        Gestion_Usuarios.add(Id_Usuarios);
        Gestion_Usuarios.add(Label_Nombre);
        Gestion_Usuarios.add(Nombre_Usuarios);
        Gestion_Usuarios.add(Label_Telefono);
        Gestion_Usuarios.add(Telefono_Usuarios);
        Gestion_Usuarios.add(Label_Tipo);
        Gestion_Usuarios.add(Tipo_Usuarios);

        Gestion_Usuarios.setVisible(true);
    }
}