/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica16_gualpamathias;

/**
 *
 * @author ESPE
 */
public class Triangulo extends Figura{
    private int base;
    private int altura;

    public Triangulo(int bsae, int altura,String color) {
        super(color);
        this.altura=altura;
        this.base=base;
    }

    @Override
    public double superficie() {
       return base*altura/2;
    }
    
}
