/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica7metodosretornosdevalores_gualpamathias;

import javax.swing.JOptionPane;

/**
 *
 * @author ESPE
 */
public class Practica7Metodosretornosdevalores_GualpaMathias {

    public static void main(String[] args) {
    Operaciones op1 = new Operaciones();
    //Pedimos los numeros se le pide al usuario qeu ingrese los numeros     
    int num1 = Integer.parseInt(JOptionPane.showInputDialog("Deme su primer numero"));
    int num2 = Integer.parseInt(JOptionPane.showInputDialog("Deme su segundo numero"));
    //vemos que llama a las dos variables y eso enviamos como argumentos 
    int suma=op1.sumar(num1, num2);
    
    //presentamos nuestros resultados
    op1.resultado(suma);
    }
    
}
