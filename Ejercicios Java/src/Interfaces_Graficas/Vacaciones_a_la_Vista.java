package Interfaces_Graficas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Vacaciones_a_la_Vista {
    public static void main(String[] args) {
        JFrame ventanaprincipal = new JFrame("Semana Santa!!");
        ventanaprincipal.setSize(700,400);
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setFocusable(false);
        ventanaprincipal.add(tabbedPane);
        JLabel grupo =new JLabel();
        JLabel solo =new JLabel();
        tabbedPane.add("Alta de Grupo de Viaje",grupo);
        tabbedPane.add("Alta de Viajero Solitario",solo);
        ventanaprincipal.setVisible(true);
        //
        JTextArea grupo_destino = new JTextArea();
        grupo_destino.setSize(20,300);
        grupo.setLayout(null);
        grupo_destino.setBounds(500, 10, 170, 70);
        grupo.add(grupo_destino);
        JTextField grupo_destino_titulo = new JTextField();
        grupo_destino_titulo.setText("Destino del Viaje");
        grupo_destino_titulo.setBounds(20,30,105,20);
        grupo_destino_titulo.setEditable(false);
        grupo.add(grupo_destino_titulo);
        //
        JTextArea grupo_plan = new JTextArea();
        grupo_plan.setSize(20,300);
        grupo_plan.setBounds(500, 105, 170, 70);
        grupo.add(grupo_plan);
        JTextField grupo_plan_titulo = new JTextField();
        grupo_plan_titulo.setText("Plan del Viaje");
        grupo_plan_titulo.setBounds(20,125,105,20);
        grupo_plan_titulo.setEditable(false);
        grupo.add(grupo_plan_titulo);
        //
        JTextArea grupo_responsable = new JTextArea();
        grupo_responsable.setSize(20,300);
        grupo_responsable.setBounds(500, 200, 170, 70);
        grupo.add(grupo_responsable);
        JTextField grupo_responsable_titulo = new JTextField();
        grupo_responsable_titulo.setText("Responsable");
        grupo_responsable_titulo.setBounds(20,220,105,20);
        grupo_responsable_titulo.setEditable(false);
        grupo.add(grupo_responsable_titulo);
        //
        JButton boton_grupo = new JButton("VIAJAR!!!");
        grupo.add(boton_grupo);
        boton_grupo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoIngresado = grupo_destino.getText().trim();
                String textoNombre = grupo_responsable.getText().trim();

                if (textoIngresado.isEmpty()) {
                    JOptionPane.showMessageDialog(grupo, "Por favor, completa el campo antes de reservar.");
                } else {
                    JOptionPane.showMessageDialog(grupo, "¡Viaje reservado! "+textoNombre);
                }
            }
        });
        boton_grupo.setVisible(true);
        boton_grupo.setBounds(285,300,105,20);
        ///////////////
        JTextArea solo_anyo = new JTextArea();
        solo_anyo.setSize(20,300);
        solo.setLayout(null);
        solo_anyo.setBounds(170, 10, 170, 70);
        solo.add(solo_anyo);
        JTextField solo_anyo_titulo = new JTextField();
        solo_anyo_titulo.setText("Año Nacimiento");
        solo_anyo_titulo.setBounds(20,30,115,20);
        solo_anyo_titulo.setEditable(false);
        solo.add(solo_anyo_titulo);
        //
        JTextArea solo_plan = new JTextArea();
        solo_plan.setSize(20,300);
        solo_plan.setBounds(170, 105, 170, 70);
        solo.add(solo_plan);
        JTextField solo_plan_titulo = new JTextField();
        solo_plan_titulo.setText("Plan Viaje");
        solo_plan_titulo.setBounds(20,125,105,20);
        solo_plan_titulo.setEditable(false);
        solo.add(solo_plan_titulo);
        //
        JTextArea solo_nombre = new JTextArea();
        solo_nombre.setSize(20,300);
        solo_nombre.setBounds(170, 200, 170, 70);
        solo.add(solo_nombre);
        JTextField solo_nombre_titulo = new JTextField();
        solo_nombre_titulo.setText("Nombre Viajero");
        solo_nombre_titulo.setBounds(20,220,105,20);
        solo_nombre_titulo.setEditable(false);
        solo.add(solo_nombre_titulo);
        //
        JTextArea solo_altura = new JTextArea();
        solo_altura.setSize(20,300);
        solo_altura.setBounds(500, 10, 170, 70);
        solo.add(solo_altura);
        JTextField solo_altura_titulo = new JTextField();
        solo_altura_titulo.setText("Altura Viajero");
        solo_altura_titulo.setBounds(370,30,115,20);
        solo_altura_titulo.setEditable(false);
        solo.add(solo_altura_titulo);
        //
        JTextArea solo_kg = new JTextArea();
        solo_kg.setSize(20,300);
        solo_kg.setBounds(500, 105, 170, 70);
        solo.add(solo_kg);
        JTextField solo_kg_titulo = new JTextField();
        solo_kg_titulo.setText("Peso Equipaje");
        solo_kg_titulo.setBounds(370,125,105,20);
        solo_kg_titulo.setEditable(false);
        solo.add(solo_kg_titulo);
        //
        JTextArea solo_destino = new JTextArea();
        solo_destino.setSize(20,300);
        solo_destino.setBounds(500, 200, 170, 70);
        solo.add(solo_destino);
        JTextField solo_destino_titulo = new JTextField();
        solo_destino_titulo.setText("Destino");
        solo_destino_titulo.setBounds(370,220,105,20);
        solo_destino_titulo.setEditable(false);
        solo.add(solo_destino_titulo);
        //
        JButton boton_solo = new JButton("VIAJAR!!!");
        solo.add(boton_solo);
        boton_solo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoIngresado = solo_destino.getText().trim();
                String textoNombre = solo_nombre.getText().trim();
                if (textoIngresado.isEmpty()) {
                    JOptionPane.showMessageDialog(solo, "Por favor, completa el campo antes de reservar.");
                } else {
                    JOptionPane.showMessageDialog(solo, "¡Viaje reservado! "+textoNombre);
                }
            }
        });
        boton_solo.setVisible(true);
        boton_solo.setBounds(285,300,105,20);

    }
}
