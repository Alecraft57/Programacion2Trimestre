package Interfaces_Graficas.Trabajo_Final.GUI;

import Interfaces_Graficas.Trabajo_Final.BasesLocal.Eventos;
import Interfaces_Graficas.Trabajo_Final.BasesLocal.usuarios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIEventos {
    public void mostrar() {
        //Frame eventos
        JFrame Gestion_Eventos = new JFrame("Gestión de Eventos");
        Gestion_Eventos.setSize(500, 400);
        Gestion_Eventos.setLayout(null);
        //Id del Evento
        JLabel Label_Id = new JLabel("ID:");
        Label_Id.setBounds(20, 20, 100, 20);
        JTextField Id_Eventos = new JTextField();
        Id_Eventos.setBounds(120, 20, 200, 20);
        //Nombre
        JLabel Label_Nombre = new JLabel("Nombre:");
        Label_Nombre.setBounds(20, 50, 100, 20);
        JTextField Nombre_Eventos = new JTextField();
        Nombre_Eventos.setBounds(120, 50, 200, 20);
        //Fecha
        JLabel Label_Fecha = new JLabel("Fecha (DD/MM/YYYY):");
        Label_Fecha.setBounds(20, 80, 150, 20);
        JTextField Fecha_Eventos = new JTextField();
        Fecha_Eventos.setBounds(170, 80, 150, 20);
        //Hora
        JLabel Label_Hora = new JLabel("Hora:");
        Label_Hora.setBounds(20, 110, 100, 20);
        JTextField Hora_Eventos = new JTextField();
        Hora_Eventos.setBounds(120, 110, 200, 20);
        //Nuevo Id para actualizar
        JLabel Label_Id_Nuevo = new JLabel("Nuevo Id (solo para actualizar)");
        Label_Id_Nuevo.setBounds(20, 140, 195, 20);
        JTextField Id_Eventos_Nuevo = new JTextField();
        Id_Eventos_Nuevo.setBounds(210, 140, 180, 20);
        //Boton de Insertar con sus Funciones
        Button Insertar = new Button("Insertar");
        Insertar.setBounds(20, 170, 100, 30);
        Gestion_Eventos.add(Insertar);

        Insertar.addActionListener(e -> {
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
        //Boton de Consultar con sus Funciones
        Button boton_consultar = new Button("Consultar Todo");
        boton_consultar.setBounds(140, 170, 140, 30);
        Gestion_Eventos.add(boton_consultar);

        boton_consultar.addActionListener(e -> {
            try {
                Eventos ev = new Eventos();
                ev.consultar_todo();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(Gestion_Eventos, "Error: " + ex.getMessage());
            }
        });
        //Boton de Eliminar con sus Funciones
        Button boton_eliminar = new Button("Eliminar");
        boton_eliminar.setBounds(20, 210, 100, 30);
        Gestion_Eventos.add(boton_eliminar);

        boton_eliminar.addActionListener(e -> {
            int id = Integer.parseInt(Id_Eventos.getText());
            try {
                Eventos ev = new Eventos();
                ev.eliminar(id);
                JOptionPane.showMessageDialog(Gestion_Eventos, "Evento eliminao correctamente.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(Gestion_Eventos, "Error: " + ex.getMessage());
            }
        });
        //Boton de Actualizar con sus Funciones
        Button boton_actualizar = new Button("Actualizar");
        boton_actualizar.setBounds(160, 210, 100, 30);
        Gestion_Eventos.add(boton_actualizar);

        boton_actualizar.addActionListener(e -> {
            int id = Integer.parseInt(Id_Eventos.getText());
            int id_nuevo = Integer.parseInt(Id_Eventos_Nuevo.getText());
            try {
                Eventos ev = new Eventos();
                ev.actualizar(id,id_nuevo);
                JOptionPane.showMessageDialog(Gestion_Eventos, "Id del usuario Actualizado correctamente.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(Gestion_Eventos, "Error: " + ex.getMessage());
            }
        });
        //Todos los Jlabel  y los JTextField añadidos al Frame
        Gestion_Eventos.add(Label_Id);
        Gestion_Eventos.add(Id_Eventos);
        Gestion_Eventos.add(Label_Nombre);
        Gestion_Eventos.add(Nombre_Eventos);
        Gestion_Eventos.add(Label_Fecha);
        Gestion_Eventos.add(Fecha_Eventos);
        Gestion_Eventos.add(Label_Hora);
        Gestion_Eventos.add(Hora_Eventos);
        Gestion_Eventos.add(Label_Id_Nuevo);
        Gestion_Eventos.add(Id_Eventos_Nuevo);

        Gestion_Eventos.setVisible(true);
    }
}