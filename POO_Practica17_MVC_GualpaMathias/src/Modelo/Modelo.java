/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ESPE
 */
public class Modelo {
    //variables
    private int valor1=0;
    private int valor2=0;
    private int valor3=0;
    private int valor4=0;
    private int valor5=0;
    private int valor6=0;
    private int valor7=0;
    private int valor8=0;
    private int total= 0;
    private int total2= 0;
    private int total3= 0;
    private int total4= 0;
    
    public Modelo(){}

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getValor3() {
        return valor3;
    }

    public void setValor3(int valor3) {
        this.valor3 = valor3;
    }

    public int getValor4() {
        return valor4;
    }

    public void setValor4(int valor4) {
        this.valor4 = valor4;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal2() {
        return total2;
    }

    public void setTotal2(int total2) {
        this.total2 = total2;
    }

    public int getValor5() {
        return valor5;
    }

    public void setValor5(int valor5) {
        this.valor5 = valor5;
    }

    public int getValor6() {
        return valor6;
    }

    public void setValor6(int valor6) {
        this.valor6 = valor6;
    }

    public int getTotal3() {
        return total3;
    }

    public void setTotal3(int total3) {
        this.total3 = total3;
    }

    public int getValor7() {
        return valor7;
    }

    public void setValor7(int valor7) {
        this.valor7 = valor7;
    }

    public int getValor8() {
        return valor8;
    }

    public void setValor8(int valor8) {
        this.valor8 = valor8;
    }

    public int getTotal4() {
        return total4;
    }

    public void setTotal4(int total4) {
        this.total4 = total4;
    }
    

    public void sumar() {
       this.total=this.valor1+this.valor2;  
    }

    public void resta() {
       this.total2=this.valor3-this.valor4;     
    }
    public void multi() {
       this.total3=this.valor5*this.valor6;     
    }
    public void divi() {
       this.total4=this.valor7/this.valor8;     
    }
}
