/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica6_gualpamathias;

import java.util.ArrayList;
import java.util.List;
import java.io.*;  // Llama a todas las librerias
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author ESPE
 */
public class Practica6_GualpaMathias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Persona>persona = new ArrayList<Persona>();
        persona.add(new Persona( "Mathias" ,  "0991629781" , "megualpa@espe.edu.ec"));
        persona.add(new Persona( "Derik"   ,  "0989404262" , "degualpa@espe.edu.ec"));
    }
    
}
