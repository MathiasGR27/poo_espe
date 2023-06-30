/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica10sobrecarga_gualpamathias;

/**
 *
 * @author ESPE
 */
public class Practica10SobreCarga_GualpaMathias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona1 = new Persona("Mathias",19);
        persona1.jugar();
        
        Persona persona2 = new Persona(235002514);
        persona2.jugar("Futbol");
        
    }
    
}
