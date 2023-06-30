/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.correcionpruebaamano_gualpamathias;

/**
 *
 * @author Usuario
 */
public class Futbol  extends Juegos{
    
    private int numBalon;
    private int numTarjetasAmariilas;
    private boolean juega;

    public Futbol(String nombre, String nombreJuego, int numCamisa, int numBalon,int numTarjetasAmariilas) {
        super(nombre, nombreJuego, numCamisa);
       this.nombre=nombre;
       this.nombreJuego=nombreJuego;
       this.numCamisa=numCamisa;
       this.numBalon=numBalon;
       this.numTarjetasAmariilas=numTarjetasAmariilas;
    }
    public void mostrarfut() {
  
        System.out.println("Tipo de juego: Futbol");
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

    public int getNumTarjetasAmariilas() {
        return numTarjetasAmariilas;
    }

    public void setNumTarjetasAmariilas(int numTarjetasAmariilas) {
        this.numTarjetasAmariilas = numTarjetasAmariilas;
    }



}
