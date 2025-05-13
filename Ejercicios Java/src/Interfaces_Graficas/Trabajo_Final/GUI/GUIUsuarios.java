package Interfaces_Graficas.Trabajo_Final.GUI;

import Interfaces_Graficas.Trabajo_Final.BasesLocal.ubicacion;
import Interfaces_Graficas.Trabajo_Final.BasesLocal.usuarios;

import javax.swing.*;
import java.awt.*;

public class GUIUsuarios {
    public void mostrar() {
        //Frame usuarios
        JFrame Gestion_Usuarios = new JFrame("Gestión de Usuarios");
        Gestion_Usuarios.setSize(500, 400);
        Gestion_Usuarios.setLayout(null);
        //Id del Usuario
        JLabel Label_Id = new JLabel("ID:");
        Label_Id.setBounds(20, 20, 100, 20);
        JTextField Id_Usuarios = new JTextField();
        Id_Usuarios.setBounds(120, 20, 200, 20);
        //Nombre
        JLabel Label_Nombre = new JLabel("Nombre:");
        Label_Nombre.setBounds(20, 50, 100, 20);
        JTextField Nombre_Usuarios = new JTextField();
        Nombre_Usuarios.setBounds(120, 50, 200, 20);
        //Numero de Telefono
        JLabel Label_Telefono = new JLabel("Teléfono (XXX-XXX-XXX):");
        Label_Telefono.setBounds(20, 80, 160, 20);
        JTextField Telefono_Usuarios = new JTextField();
        Telefono_Usuarios.setBounds(180, 80, 140, 20);
        //Tipo de Usuario
        JLabel Label_Tipo = new JLabel("Tipo de Usuario:");
        Label_Tipo.setBounds(20, 110, 120, 20);
        JTextField Tipo_Usuarios = new JTextField();
        Tipo_Usuarios.setBounds(140, 110, 180, 20);
        //Nuevo Id de Usuario para actualizar
        JLabel Label_Id_Nuevo = new JLabel("Nuevo Id (solo para actualizar)");
        Label_Id_Nuevo.setBounds(20, 140, 195, 20);
        JTextField Id_Usuarios_Nuevo = new JTextField();
        Id_Usuarios_Nuevo.setBounds(210, 140, 180, 20);
        //Boton de Insertar con sus Funciones
        Button Insertar = new Button("Insertar");
        Insertar.setBounds(20, 170, 100, 30);
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
        //Boton de Consultar con sus Funciones
        Button boton_consultar = new Button("Consultar Todo");
        boton_consultar.setBounds(140, 170, 140, 30);
        Gestion_Usuarios.add(boton_consultar);
//
//        boton_consultar.addActionListener(e -> {
//            try {
//                usuarios us = new usuarios();
//                us.consultartodo();
//            } catch (Exception ex) {
//                JOptionPane.showMessageDialog(Gestion_Usuarios, "Error: " + ex.getMessage());
//            }
//        });
        // Boton de Consultar con sus Funciones - Versión modificada
        boton_consultar.addActionListener(e -> {
            try {
                usuarios us = new usuarios();
                String resultados = us.consultartodo();

                // Crear una ventana de diálogo para mostrar los resultados
                JDialog resultadosDialog = new JDialog(Gestion_Usuarios, "Listado de Usuarios", true);
                resultadosDialog.setSize(700, 500);
                resultadosDialog.setLayout(new BorderLayout());

                // Área de texto con scroll
                JTextArea textArea = new JTextArea(resultados);
                textArea.setEditable(false);
                textArea.setFont(new Font("Monospaced", Font.PLAIN, 12)); // Fuente monoespaciada para alinear columnas
                JScrollPane scrollPane = new JScrollPane(textArea);

                // Botón para cerrar
                JButton cerrarButton = new JButton("Cerrar");
                cerrarButton.addActionListener(ev -> resultadosDialog.dispose());

                // Añadir componentes al diálogo
                resultadosDialog.add(scrollPane, BorderLayout.CENTER);
                resultadosDialog.add(cerrarButton, BorderLayout.SOUTH);

                // Centrar y mostrar
                resultadosDialog.setLocationRelativeTo(Gestion_Usuarios);
                resultadosDialog.setVisible(true);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(Gestion_Usuarios, "Error al consultar usuarios: " + ex.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        //Boton de Eliminar con sus Funciones
        Button boton_eliminar = new Button("Eliminar");
        boton_eliminar.setBounds(20, 210, 100, 30);
        Gestion_Usuarios.add(boton_eliminar);

        boton_eliminar.addActionListener(e -> {
            int id = Integer.parseInt(Id_Usuarios.getText());
            try {
                usuarios us = new usuarios();
                us.eliminar(id);
                JOptionPane.showMessageDialog(Gestion_Usuarios, "Usuario eliminao correctamente.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(Gestion_Usuarios, "Error: " + ex.getMessage());
            }
        });
        //Boton de Actualizar con sus Funciones
        Button boton_actualizar = new Button("Actualizar");
        boton_actualizar.setBounds(160, 210, 100, 30);
        Gestion_Usuarios.add(boton_actualizar);

        boton_actualizar.addActionListener(e -> {
            int id = Integer.parseInt(Id_Usuarios.getText());
            int id_nuevo = Integer.parseInt(Id_Usuarios_Nuevo.getText());
            try {
                usuarios us = new usuarios();
                us.actualizar(id,id_nuevo);
                JOptionPane.showMessageDialog(Gestion_Usuarios, "Id del usuario Actualizado correctamente.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(Gestion_Usuarios, "Error: " + ex.getMessage());
            }
        });
        //Todos los Jlabel  y los JTextField añadidos al Frame
        Gestion_Usuarios.add(Label_Id);
        Gestion_Usuarios.add(Id_Usuarios);
        Gestion_Usuarios.add(Label_Nombre);
        Gestion_Usuarios.add(Nombre_Usuarios);
        Gestion_Usuarios.add(Label_Telefono);
        Gestion_Usuarios.add(Telefono_Usuarios);
        Gestion_Usuarios.add(Label_Tipo);
        Gestion_Usuarios.add(Tipo_Usuarios);
        Gestion_Usuarios.add(Label_Id_Nuevo);
        Gestion_Usuarios.add(Id_Usuarios_Nuevo);

        Gestion_Usuarios.setVisible(true);
    }
}