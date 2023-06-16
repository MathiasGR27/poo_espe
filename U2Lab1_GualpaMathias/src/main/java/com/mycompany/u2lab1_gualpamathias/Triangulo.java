/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2lab1_gualpamathias;

/**
 *
 * @author Usuario
 */
public class Triangulo extends Figuras {// el extends figura es para establecer herencia entre clases 
    
    private double base;
    private double altura;
    
 public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
    
    @Override
    public double calcularPerimetro() {
        // Suponemos que el triángulo es equilátero
        return 3 * base;
    }
}
