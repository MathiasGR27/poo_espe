/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jerarquiadeclasesjuegos;

/**
 *
 * @author Usuario
 */
public class Futbol extends Juegos {
    
    private boolean juega;
    private int numBalon;
    private int numTarjetasAmariilas;
    
    public Futbol(String nombre,String nombreJuego,int numcamisa,int numBalon,int numTarjetasAmariilas){
        super(nombre,nombreJuego,numcamisa);
        this.nombre=nombre;
        this.nombreJuego=nombreJuego;
        this.numCamisa=numcamisa;
        this.numBalon=numBalon;
        this.numTarjetasAmariilas=numTarjetasAmariilas;
    }
    
    public void mostrarFut(){
        System.out.println("Nombre : "+ nombre);
        System.out.println("Nombre del juego : "+ nombreJuego);
        System.out.println("Numero de la camisa : "+ numCamisa);
    }
    
    public void Juego(){
        
        if(this.juega){
            this.juega=false;
            System.out.println("El jugador no va a jugar");
        }else{
            this.juega=true;
            System.out.println("El jugador si va a jugar");
        }
        
    }
    
    public int getNumBalon(){
        return numBalon;
    }
    
    public int getNumTarjetasAmarillas(){
        return numTarjetasAmariilas;
    }
    
    public void setNumBalon(int numBalon){
        this.numBalon= numBalon;
    }
    
    public void setNumTarjetasAmarillas( int numTarjetasAmarillas){
        this.numTarjetasAmariilas=numTarjetasAmarillas;
        
    }
    
}
