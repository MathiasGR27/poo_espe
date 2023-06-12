/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica8u2herencia2_gualpamathias;

/**
 *
 * @author ESPE
 */
public class Deportista extends Persona{
    String deporte;
    
    public Deportista (String nom){
        super(nom);
    }
    public void cambiarnombre(String nom){
        super.setNombre(nom);
    }
}
