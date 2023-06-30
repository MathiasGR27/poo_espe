/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.correcionpruebaamano_gualpamathias;

/**
 *
 * @author Usuario
 */
public class CorrecionPruebaamano_GualpaMathias {

    public static void main(String[] args) {
        
        Futbol fut = new Futbol("Mathias", "Futbol", 27 , 0, 5);
        fut.mostrarfut();
        fut.juega();
        fut.setNumBalon(4);
        fut.setNumTarjetasAmariilas(2);
        System.out.println("Numero de balon: " + fut.getNumBalon());
        System.out.println("Tarjetas Amarillas: " + fut.getNumTarjetasAmariilas());
        
        System.out.println("=========================================");

        Basket bask = new Basket("Daniela", "Basket", 10);
        bask.mostrarbask();
        bask.juega();
        bask.setNumBalon(7);
        bask.setNumFaltas(5);
        System.out.println("Numero de balon: " + bask.getNumBalon());
        System.out.println("Numero de faltas " + bask.getNumFaltas());
    }

    }

