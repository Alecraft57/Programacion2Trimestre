package Interfaces_Graficas.Trabajo_Final.GUI;

import Interfaces_Graficas.Trabajo_Final.BasesLocal.Eventos;
import Interfaces_Graficas.Trabajo_Final.BasesLocal.ubicacion;
import Interfaces_Graficas.Trabajo_Final.BasesLocal.usuarios;

import javax.swing.*;
import java.awt.*;

public class GUIUbicacion {
    public void mostrar() {
        //Frame ubicacion
        JFrame Gestion_Ubicacion = new JFrame("Gestión de Ubicación");
        Gestion_Ubicacion.setSize(500, 400);
        Gestion_Ubicacion.setLayout(null);
        //Id de la Ubicacion
        JLabel Label_Id = new JLabel("ID Ubicación:");
        Label_Id.setBounds(20, 20, 100, 20);
        JTextField Id_Ubicacion = new JTextField();
        Id_Ubicacion.setBounds(140, 20, 200, 20);
        //Id del Evento
        JLabel Label_IdEvento = new JLabel("ID Evento:");
        Label_IdEvento.setBounds(20, 50, 100, 20);
        JTextField IdEvento_Ubicacion = new JTextField();
        IdEvento_Ubicacion.setBounds(140, 50, 200, 20);
        //Zona
        JLabel Label_Zona = new JLabel("Zona:");
        Label_Zona.setBounds(20, 80, 100, 20);
        JTextField Zona_Ubicacion = new JTextField();
        Zona_Ubicacion.setBounds(140, 80, 200, 20);
        //Capacidad de la Zona
        JLabel Label_Capacidad = new JLabel("Capacidad:");
        Label_Capacidad.setBounds(20, 110, 100, 20);
        JTextField Capacidad_Ubicacion = new JTextField();
        Capacidad_Ubicacion.setBounds(140, 110, 200, 20);
        //Nueva Zona para actualizar
        JLabel Label_Zona_Nuevo = new JLabel("Nueva Zona (solo para actualizar)");
        Label_Zona_Nuevo.setBounds(20, 140, 200, 20);
        JTextField Zona_Ubicacion_Nuevo = new JTextField();
        Zona_Ubicacion_Nuevo.setBounds(225, 140, 200, 20);
        //Boton de Insertar con sus Funciones
        Button Insertar = new Button("Insertar");
        Insertar.setBounds(20, 170, 100, 30);
        Gestion_Ubicacion.add(Insertar);

        Insertar.addActionListener(e -> {
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
        //Boton de Consultar con sus Funciones
        Button boton_consultar = new Button("Consultar Todo");
        boton_consultar.setBounds(140, 170, 140, 30);
        Gestion_Ubicacion.add(boton_consultar);

        boton_consultar.addActionListener(e -> {
            try {
                ubicacion ub = new ubicacion();
                ub.consultartodo();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(Gestion_Ubicacion, "Error: " + ex.getMessage());
            }
        });
        //Boton de Eliminar con sus Funciones
        Button boton_eliminar = new Button("Eliminar");
        boton_eliminar.setBounds(20, 210, 100, 30);
        Gestion_Ubicacion.add(boton_eliminar);

        boton_eliminar.addActionListener(e -> {
            int id = Integer.parseInt(Id_Ubicacion.getText());
            try {
                ubicacion ub = new ubicacion();
                ub.eliminar(id);
                JOptionPane.showMessageDialog(Gestion_Ubicacion, "Ubicación eliminao correctamente.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(Gestion_Ubicacion, "Error: " + ex.getMessage());
            }
        });
        //Boton de Actualizar con sus Funciones
        Button boton_actualizar = new Button("Actualizar");
        boton_actualizar.setBounds(160, 210, 100, 30);
        Gestion_Ubicacion.add(boton_actualizar);

        boton_actualizar.addActionListener(e -> {
            int id = Integer.parseInt(Id_Ubicacion.getText());
            String zona_nueva = Zona_Ubicacion_Nuevo.getText();
            try {
                ubicacion ub = new ubicacion();
                ub.actualizar_zona(id,zona_nueva);
                JOptionPane.showMessageDialog(Gestion_Ubicacion, "Id del usuario Actualizado correctamente.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(Gestion_Ubicacion, "Error: " + ex.getMessage());
            }
        });
        //Todos los Jlabel  y los JTextField añadidos al Frame
        Gestion_Ubicacion.add(Label_Id);
        Gestion_Ubicacion.add(Id_Ubicacion);
        Gestion_Ubicacion.add(Label_IdEvento);
        Gestion_Ubicacion.add(IdEvento_Ubicacion);
        Gestion_Ubicacion.add(Label_Zona);
        Gestion_Ubicacion.add(Zona_Ubicacion);
        Gestion_Ubicacion.add(Label_Capacidad);
        Gestion_Ubicacion.add(Capacidad_Ubicacion);
        Gestion_Ubicacion.add(Label_Zona_Nuevo);
        Gestion_Ubicacion.add(Zona_Ubicacion_Nuevo);

        Gestion_Ubicacion.setVisible(true);
    }
}