package Interfaces_Graficas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio_Swing extends JFrame {
    public static void main(String[] args) {
        JFrame ventanaprincipal = new JFrame("Ventana Principal");
        ventanaprincipal.setSize(500, 300);
        JPanel panelprincipal = new JPanel();
        panelprincipal.setSize(300, 300);
        panelprincipal.setLayout(new GridBagLayout());
        JLabel labelprincipal = new JLabel();
        String textooriginal = "   Texto en bucle   ";
        labelprincipal.setText(textooriginal);
        JTextArea textoprincipal = new JTextArea(5, 20);
        panelprincipal.add(labelprincipal);
        panelprincipal.add(textoprincipal);
        ventanaprincipal.add(panelprincipal);
        ventanaprincipal.setVisible(true);
        Timer timer = new Timer(200, new ActionListener() {
            String texto = textooriginal;

            @Override
            public void actionPerformed(ActionEvent e) {
                texto = texto.substring(1) + texto.charAt(0); // Mueve un carácter
                labelprincipal.setText(texto);
            }
        });
        timer.start();
        while (true) {
            String entrada = JOptionPane.showInputDialog(
                    ventanaprincipal,
                    "Introduce un texto (Cancelar para salir o pon Fin):",
                    "Entrada de texto");
            if (entrada.equals("Fin")) {
                break;
            }
            textoprincipal.append(entrada+"\n");
        }
    }
}
