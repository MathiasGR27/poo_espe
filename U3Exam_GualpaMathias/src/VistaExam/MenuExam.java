/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VistaExam;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



/**
 *
 * @author Usuario
 */
public class MenuExam {
    
    private JFrame frame;
    private JButton btnEstudiante;
    private JButton btnProfesor;
    private JButton btnHorario;
    private JButton btnlab;
   
    public MenuExam() {
        frame = new JFrame("Menú Principal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        btnEstudiante = new JButton("Estudiante");
        btnEstudiante.addActionListener(e -> mostrarFormulario(new Exam_estudiante()));

        btnProfesor = new JButton("Profesor");
        btnProfesor.addActionListener(e -> mostrarFormulario(new Exam_profesor()));

        btnHorario = new JButton("Horario");
        btnHorario.addActionListener(e -> mostrarFormulario(new Exam_horario()));
        
        btnlab = new JButton("Laboratorio");
        btnlab.addActionListener(e -> mostrarFormulario(new Exam_Laboratorios()));

        panel.add(btnEstudiante);
        panel.add(btnProfesor);
        panel.add(btnHorario);
        panel.add(btnlab);

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.pack();
    }

    public void mostrar() {
        frame.setVisible(true);
    }

    private void mostrarFormulario(JFrame formulario) {
        formulario.setVisible(true);
    }
}
    
