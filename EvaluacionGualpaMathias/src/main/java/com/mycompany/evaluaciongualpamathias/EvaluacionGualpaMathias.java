/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.evaluaciongualpamathias;
import java.util.Scanner;
/**
/**
 *
 * @author ESPE
 */
import java.util.Scanner;

public class EvaluacionGualpaMathias {
    
     public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       int nota ;
       float Notamedia;
       int opc;
       Estudianteclase estudiante1= new Estudianteclase();
        do{
            System.out.println("================================");
            System.out.println("     Ingrese una opcion:        ");
            System.out.println("1. Ingrese las notas.           ");
            System.out.println("2. Calcular la nota media.      ");
            System.out.println("3. Ver Aprovados o Reprobados.  ");
            System.out.println("4. Salir.                       ");
            System.out.println("================================");
            opc=teclado.nextInt();       
            System.out.println("================================");
            
        switch (opc) {
case 1:;
//se ingresa 5 notas 
        System.out.println("ingrese su primera nota");
        nota=teclado.nextInt();
        System.out.println("ingrese su segunda nota");
        nota=nota+teclado.nextInt();
        System.out.println("ingrese su tercera nota");
        nota=nota+teclado.nextInt();
        System.out.println("ingrese su cuarta nota");
        nota=nota+teclado.nextInt();
        System.out.println("ingrese su quinta nota");
        nota=nota+teclado.nextInt();
        estudiante1.notas=nota;
        estudiante1.promedio=nota/5;
       
        //se realiza lo que es para ver si esta aprobado los dos estudiante o no lo estan
        if (estudiante1.promedio>=14 ){
        estudiante1.calificacion="Aprobado";}
        else{
        estudiante1.calificacion="Reprobado";}
        break;

case 2:	
        Notamedia=(estudiante1.promedio);
        System.out.println(" la nota media es: "+Notamedia);
        break;
case 3:
        System.out.println("el estudiante esta: "+estudiante1.calificacion);
        break;
case 4:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opc != 4);
    }
}
