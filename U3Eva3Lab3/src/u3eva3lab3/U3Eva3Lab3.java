/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u3eva3lab3;

import VistaEvaLab3.Exam_Laboratorios;
import VistaEvaLab3.Exam_estudiante;
import VistaEvaLab3.Exam_horario;
import VistaEvaLab3.Exam_profesor;

/**
 *
 * @author ESPE
 */
public class U3Eva3Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Exam_estudiante lab=new Exam_estudiante();
    lab.setVisible(true); 
    
    Exam_profesor labp=new Exam_profesor();
    labp.setVisible(true);
    
    Exam_horario labh=new Exam_horario();
    labh.setVisible(true);
    
    Exam_Laboratorios lablab=new Exam_Laboratorios();
    lablab.setVisible(true);
    
    }
}
    