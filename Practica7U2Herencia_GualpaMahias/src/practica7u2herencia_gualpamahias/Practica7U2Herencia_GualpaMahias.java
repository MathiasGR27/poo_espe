/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica7u2herencia_gualpamahias;

/**
 *
 * @author ESPE
 */
public class Practica7U2Herencia_GualpaMahias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        vehiculo veh = new vehiculo();
                
        Automovil auto = new Automovil();
        
        Motocicleta moto = new Motocicleta();
        
        veh.encendido();
        auto.encendido();
        moto.encendido();
        
        System.out.println(veh.estado);
        System.out.println(auto.estado);
        System.out.println(moto.estado);
        
    }
    
}
