/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jerarquiadeclasesjuegos;

/**
 *
 * @author Usuario
 */
public class Basquet extends Juegos{
    private boolean juega;
    private int numBalon;
    private int numFaltas;
    
   public Basquet(String nombre,String nombreJuego,int numcamisa,int numBalon,int numFaltas){
       super(nombre,nombreJuego,numcamisa);
        this.nombre=nombre;
        this.nombreJuego=nombreJuego;
        this.numCamisa=numcamisa;
        this.numBalon=numBalon;
        this.numFaltas=numFaltas;
       
   }
   
   public void mostrarBasq(){
         System.out.println("Nombre : "+ nombre);
        System.out.println("Nombre del juego : "+ nombreJuego);
        System.out.println("Numero de la camisa : "+ numCamisa);
   }
   public void juega(){
        
        if(this.juega){
            this.juega=true;
            System.out.println("El jugador si va a jugar");
        }else{
            this.juega=false;
            System.out.println("El jugador no va a jugar");
        }
        
    }
   public int getNumBalon(){
       return numBalon;
   }
   
   public int getNumFaltas(){
       return numFaltas;
   }
   
   public void setNumBalon(int numBalon){
       this.numBalon=numBalon;
   }
   
  public void setNumFaltas(int numFaltas){
      this.numFaltas=numFaltas;
  }
   }
   
    

