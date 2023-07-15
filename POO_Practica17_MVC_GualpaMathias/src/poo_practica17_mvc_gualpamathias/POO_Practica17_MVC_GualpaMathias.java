/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_practica17_mvc_gualpamathias;

import Controler.Control;
import Modelo.Modelo;
import Vista.Vista;

/**
 *
 * @author ESPE
 */
public class POO_Practica17_MVC_GualpaMathias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Modelo mod = new Modelo();
        Vista vis=new Vista();
        Control controlador = new Control( vis,mod );
        controlador.iniciar_vista();
        
        
        vis.setVisible(true);
     
        
        
    }
    
}
