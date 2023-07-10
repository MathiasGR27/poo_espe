/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica16_gualpamathias;

/**
 *
 * @author ESPE
 */
public abstract class Figura {
    private String color;

    public Figura(String color) {
        super();
        this.color = color;
    }
    
    public abstract double superficie();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
        
    
    
 
}
