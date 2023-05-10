/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica5condicional_gualpamathias;

/**
 *
 * @author ESPE
 */
public class Practica5Condicional_GualpaMathias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int hora=7;
        if(hora >=0 && hora<=12){
            System.out.println("Buenos dias");
           }else if(hora>12 && hora <=12){
            System.out.println("Buenas Tardes");   
           }else{
               System.out.println("Buenas Noches");
           }
    }   
}
