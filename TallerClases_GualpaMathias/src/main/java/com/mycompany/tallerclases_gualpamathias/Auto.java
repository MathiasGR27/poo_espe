/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerclases_gualpamathias;

/**
 *
 * @author Usuario
 */
public class Auto extends Vehiculo {
    private String transmision;
    private boolean parabrisason;
    private int multa;

    public Auto(String numPlaca, String marca, int numRuedas, int estado) {
        super(numPlaca, marca, numRuedas, estado);
        this.numPlaca=numPlaca;
        this.marca=marca;
        this.numRuedas=numRuedas;
        this.transmision=transmision;
        this.multa=multa;  
    }
    public void mostrarauto() {
  
        System.out.println("Tipo de Vehiculo: Auto");
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

    public void setMulta(int multa) {
        this.multa = multa;
    }
    
    public void addmulta(){
        this.multa ++;
    }
    
         public int getMulta() {
        return multa;
    }

    
}
