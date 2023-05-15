/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica6metodos_gualpamathias;

import javax.swing.JOptionPane;

/**
 *
 * @author ESPE
 */
class Operaciones {
    int num1;int num2;int num3; int num4; int num5; int num6; int num7; int num8;
    int suma; int resta; int multiplicacion; int division;
    //generamos metodos
    //generamos numeros
    //
public void capturanumeros(){
    num1 = Integer.parseInt(JOptionPane.showInputDialog("Deme su primer numero"));
    num2 = Integer.parseInt(JOptionPane.showInputDialog("Deme su segundo numero"));
}
public void sumar(){
    suma=num1+num2;
}
public void resultadosuma(){
    System.out.println("El resultado de la suma e : "+suma);
}
}



