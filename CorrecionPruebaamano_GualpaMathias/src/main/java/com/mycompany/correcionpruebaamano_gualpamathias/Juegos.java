/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.correcionpruebaamano_gualpamathias;

/**
 *
 * @author Usuario
 */
public class Juegos {
    
   String nombre;
   String nombreJuego;
   int numCamisa;
   
   public Juegos(String nombre,String nombreJuego, int numCamisa){
       this.nombre=nombre;
       this.nombreJuego=nombreJuego;
       this.numCamisa=numCamisa;
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }
   
}
   

