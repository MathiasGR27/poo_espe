/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica16_gualpamathias;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ESPE
 */
public class Practica16_GualpaMathias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc;
         do{ 
             System.out.println("=============================");
             System.out.println("1. Color y superficie triangulo");
             System.out.println("2. Color y superficie Circulo " );
             System.out.println("3. Color y superficie Rectangulo");
             System.out.println("4. Salir");
             System.out.println("=============================");
             opc=teclado.nextInt();
                  
 
        switch(opc){
            case 1:
                mostrarDatosFiguras(new Triangulo(4,5," Amarillo"));
                System.out.println("===================================");
                break;
            case 2:
                mostrarDatosFiguras(new Circulo(5," Rojo"));
                System.out.println("===================================");
                break;
            case 3:
                 mostrarDatosFiguras(new Rectangulo(2,5,"Azul"));
                 System.out.println("===================================");
                 break;
            case 4:
                 System.out.println("Saliendo");
		break;
		default:
		System.out.println("Opcion no valida");	
		break;
                }
        }while(opc!=4);
       
        }

    //aplicando polimorfismo
    //la gran ventaja del polimorfismo es la reutilizacion
    //de codigo, al forzar a todas las clases a tener el mismo
    //esta expresion vale para cualquier subclase de figura
    //cuyos objetos vengan aqui como parametros
 
    private static void mostrarDatosFiguras(Figura f){
        System.out.println("Color " + f.getColor());
        System.out.println("Superficie " + f.superficie());
    }
}
