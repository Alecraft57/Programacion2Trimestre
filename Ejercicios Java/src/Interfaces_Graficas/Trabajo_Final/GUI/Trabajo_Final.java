package Interfaces_Graficas.Trabajo_Final.GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class Trabajo_Final {
    public static void main(String[] args) {
        JFrame Login_Main = new JFrame("Base de Datos");
        Login_Main.setSize(700,400);
        //Login
        JLabel Login = new JLabel();
        JTextField Login_titulo = new JTextField();
        Login_titulo.setText("Login");
        Login_titulo.setBounds(300,120,105,20);
        Login_titulo.setHorizontalAlignment(JTextField.CENTER); // Centrar texto
        Login_titulo.setEditable(false);
        Login_titulo.setBackground(Color.BLACK);
        Login_titulo.setForeground(Color.WHITE);
        Login.add(Login_titulo);
        //Nombre_Login
        JTextField Login_nombre = new JTextField("Nombre",2);
        Login_nombre.setBounds(300,170 ,105,20);
        Login_nombre.setEditable(true);
        Login.add(Login_nombre);
        //Boton_Login
        Button Login_Boton = new Button("Entrar");
        Login_Boton.setBounds(300,200,105,20);
        Login.add(Login_Boton);
        Login_Boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame Main = new JFrame("Base de Datos");
            }
        });
        //
        Login_Main.add(Login);
        Login_Main.setVisible(true);

    }
}
