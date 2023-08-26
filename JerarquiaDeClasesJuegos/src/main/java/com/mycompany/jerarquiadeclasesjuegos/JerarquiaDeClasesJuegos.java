/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.jerarquiadeclasesjuegos;

/**
 *
 * @author Usuario
 */
public class JerarquiaDeClasesJuegos {

    public static void main(String[] args) {
        Futbol fut = new Futbol("Mathias","Futbol",27,0,0);
        fut.mostrarFut();
        fut.Juego();
        fut.setNumBalon(4);
        fut.setNumTarjetasAmarillas(1);
        System.out.println("Numero de balon " + fut.getNumBalon());
        System.out.println("Numero de Tarjetas Amariilas " + fut.getNumTarjetasAmarillas());
        
        System.out.println("---------------------------------------------");  
        
        Basquet basq = new Basquet("Elian","Basquet",10,0,0);
        basq.mostrarBasq();
        basq.juega();
        basq.setNumBalon(7);
        basq.setNumFaltas(3);
        System.out.println("Numero de balon " + basq.getNumBalon());
        System.out.println("Numero de Faltas " + basq.getNumFaltas());
        }
    }

