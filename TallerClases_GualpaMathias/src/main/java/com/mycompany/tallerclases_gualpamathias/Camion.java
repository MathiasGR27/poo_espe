/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerclases_gualpamathias;

/**
 *
 * @author Usuario
 */
public class Camion extends Vehiculo{
   private boolean parabrisason;
   public String color;
   private double carga;

    public Camion(String numPlaca, String marca, int numRuedas, int estado) {
        super(numPlaca, marca, numRuedas, estado);
        this.numPlaca=numPlaca;
        this.marca=marca;
        this.numRuedas=numRuedas;
        this.color=color;
        this.carga=carga;
        
    }
    
    public void mostrarcamion() {
        
        System.out.println("Tipo de Vehiculo: Camion");
        System.out.println("Placa : " + numPlaca);
        System.out.println("Marca : " + marca);
        System.out.println("Numero de Ruedas: " + numRuedas);
    }
        
        public void onofparabtisas(){
        if(this.parabrisason){
            this.parabrisason=false;
            System.out.println("Los parabrisas estan apagado");
        }else{
            this.parabrisason=true;
            System.out.println("Los parabrisas estan encendidos");
        }
    }
        
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
}
