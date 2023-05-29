/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication35;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

class VentanaJuego {
    private JFrame frame;
    private JLabel lblPuntosInteligencia;
    private JLabel lblPuntosHabilidadSocial;
    private JLabel lblPuntosPereza;
    private JTextArea txtDescripcion;
    private JTextArea txtPregunta;
    private JButton btnDecision1;
    private JButton btnDecision2;
    private JButton btnDecision3;

    private int puntosInteligencia;
    private int puntosHabilidadSocial;
    private int puntosPereza;

    private Escenario escenario;
    private Situacion situacionActual;

    public VentanaJuego() {
        frame = new JFrame();
        frame.setBounds(100, 100, 500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblInteligencia = new JLabel("Inteligencia:");
        lblInteligencia.setBounds(10, 10, 80, 20);
        frame.getContentPane().add(lblInteligencia);

        lblPuntosInteligencia = new JLabel("0");
        lblPuntosInteligencia.setBounds(100, 10, 40, 20);
        frame.getContentPane().add(lblPuntosInteligencia);

        JLabel lblHabilidadSocial = new JLabel("Habilidad Social:");
        lblHabilidadSocial.setBounds(10, 40, 100, 20);
        frame.getContentPane().add(lblHabilidadSocial);

        lblPuntosHabilidadSocial = new JLabel("0");
        lblPuntosHabilidadSocial.setBounds(120, 40, 40, 20);
        frame.getContentPane().add(lblPuntosHabilidadSocial);

        JLabel lblPereza = new JLabel("Pereza:");
        lblPereza.setBounds(10, 70, 60, 20);
        frame.getContentPane().add(lblPereza);

        lblPuntosPereza = new JLabel("0");
        lblPuntosPereza.setBounds(70, 70, 40, 20);
        frame.getContentPane().add(lblPuntosPereza);

        txtDescripcion = new JTextArea();
        txtDescripcion.setBounds(10, 100, 470, 100);
        txtDescripcion.setEditable(false);
        frame.getContentPane().add(txtDescripcion);

        txtPregunta = new JTextArea();
        txtPregunta.setBounds(10, 210, 470, 40);
        txtPregunta.setEditable(false);
        frame.getContentPane().add(txtPregunta);

        btnDecision1 = new JButton("Decisión 1");
        btnDecision1.setBounds(10, 260, 150, 30);
        frame.getContentPane().add(btnDecision1);

        btnDecision2 = new JButton("Decisión 2");
        btnDecision2.setBounds(170, 260, 150, 30);
        frame.getContentPane().add(btnDecision2);

        btnDecision3 = new JButton("Decisión 3");
        btnDecision3.setBounds(330, 260, 150, 30);
        frame.getContentPane().add(btnDecision3);

        escenario = new Casa();
        situacionActual = escenario.getSituacionActual();

        actualizarVentana();

        btnDecision1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tomarDecision(situacionActual.getDecision1(), situacionActual.getPuntos1());
            }
        });

        btnDecision2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tomarDecision(situacionActual.getDecision2(), situacionActual.getPuntos2());
            }
        });

        btnDecision3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tomarDecision(situacionActual.getDecision3(), situacionActual.getPuntos3());
            }
        });
    }

    public void mostrarVentana() {
        frame.setVisible(true);
    }

    private void actualizarVentana() {
        txtDescripcion.setText(situacionActual.getDescripcion());
        txtPregunta.setText(situacionActual.getPregunta());
        btnDecision1.setText(situacionActual.getDecision1());
        btnDecision2.setText(situacionActual.getDecision2());
        btnDecision3.setText(situacionActual.getDecision3());
        lblPuntosInteligencia.setText(String.valueOf(puntosInteligencia));
        lblPuntosHabilidadSocial.setText(String.valueOf(puntosHabilidadSocial));
        lblPuntosPereza.setText(String.valueOf(puntosPereza));
    }

    private void tomarDecision(String decision, int puntos) {
        JOptionPane.showMessageDialog(frame, decision);

        puntosInteligencia += puntos;
        actualizarPuntos(puntosInteligencia, lblPuntosInteligencia);

        if (decision.equals(situacionActual.getDecision1())) {
            puntosHabilidadSocial += puntos;
            actualizarPuntos(puntosHabilidadSocial, lblPuntosHabilidadSocial);
        }

        escenario.avanzarSituacion();
        situacionActual = escenario.getSituacionActual();
        actualizarVentana();
    }

    private void actualizarPuntos(int puntos, JLabel lblPuntos) {
        lblPuntos.setText(String.valueOf(puntos));
        if (puntos >= 50) {
            JOptionPane.showMessageDialog(frame, "¡Felicidades! Has alcanzado 50 puntos en " + lblPuntos.getText());
        }
    }
}

