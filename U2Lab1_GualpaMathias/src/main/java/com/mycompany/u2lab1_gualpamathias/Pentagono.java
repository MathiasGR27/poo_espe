/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2lab1_gualpamathias;

/**
 *
 * @author Usuario
 */
public class Pentagono extends Figuras {// el extends figura es para establecer herencia entre clases 
     private double lado;
    
  public Pentagono(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        double apotema = lado / (2 * Math.tan(Math.PI / 5));
        return (5 * lado * apotema) / 2;
    }
    
    @Override
    public double calcularPerimetro() {
        return 5 * lado;
    }
}
