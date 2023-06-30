/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.correcionpruebaamano_gualpamathias;

/**
 *
 * @author Usuario
 */
public class Basket extends Juegos{
    
    private boolean juega;
    private int numBalon;
    private int numFaltas;

    public Basket(String nombre, String nombreJuego, int numCamisa) {
        super(nombre, nombreJuego, numCamisa);
        
       this.nombre=nombre;
       this.nombreJuego=nombreJuego;
       this.numCamisa=numCamisa;
       this.numBalon=numBalon;
       this.numFaltas=numFaltas;
    }
    public void mostrarbask() {
  
        System.out.println("Tipo de juego: Basket");
        System.out.println("nombre: " + nombre);
        System.out.println("nombre del juego  : " + nombreJuego);
        System.out.println("Numero de camisa: " + numCamisa);
    }
 public void juega(){
        if(this.juega){
            this.juega=false;
           System.out.println("El jugador no juega");          
        }else{
            this.juega=true;
            System.out.println("El jugador si juega");          
        }
    }

    public int getNumBalon() {
        return numBalon;
    }

    public void setNumBalon(int numBalon) {
        this.numBalon = numBalon;
    }

    public int getNumFaltas() {
        return numFaltas;
    }

    public void setNumFaltas(int numFaltas) {
        this.numFaltas = numFaltas;
    }
 
}
