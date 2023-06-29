/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerclases_gualpamathias;

/**
 *
 * @author Usuario
 */
public class Vehiculo {
    
    String numPlaca;
    public String marca;
    public int numRuedas;
    private int estado;
    
    public Vehiculo (String numPlaca,String marca,int numRuedas,int estado){

        this.numPlaca=numPlaca;
        this.marca=marca;
        this.numRuedas=numRuedas;
        this.estado=estado;        
    }
    

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }
    
        public String getNumPlaca() {
        return numPlaca;
    }
}
