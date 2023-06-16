/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2lab1_gualpamathias;

/**
 *
 * @author Usuario
 */
public class Cuadrado  extends Figuras {// el extends figura es para establecer herencia entre clases 
    
private double lado;
    
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    @Override// se utiliza en la clase para sobrescribir un método de su clase padre 
    public double calcularArea() {
        return lado * lado;
    }
    
    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
    
}