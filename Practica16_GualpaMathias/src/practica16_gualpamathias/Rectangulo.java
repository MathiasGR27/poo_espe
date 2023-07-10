/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica16_gualpamathias;

/**
 *
 * @author ESPE
 */
public class Rectangulo extends Figura{
    private int ancho;
    private int largo;

    public Rectangulo(int ancho,int largo,String color) {
        super(color);
        this.ancho=ancho;
        this.largo=largo;
    }

    @Override
    public double superficie() {
        return largo*ancho;
    }
    
}
