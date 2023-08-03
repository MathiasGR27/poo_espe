/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutoria8arreglos_gualpamathias;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Tutoria8Arreglos_GualpaMathias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("-----   MENU DE ARREGLOS  ----");
            System.out.println("-----1. REGISTRO DE DATOS ----");
            System.out.println("-----2. INGRESO DE NUMEROS ---");
            System.out.println("-----3. SALIR             ----");
            opcion=leer.nextInt();
            switch (opcion){
                case 1:
                    registrodatos();
                    break;
                case 2:
                    ingresodenumeros();
                    break;
                case 3:
                    System.out.println("- Finalizado el menu -");
                    break;
                default:
                    System.out.println("- La opcion es incorrecta -");
            }
            
        }while(opcion!=3);
    }
    
    static void registrodatos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("-- Ingrese la cantidad de personas que va a registrar --");
        int canPersonas=leer.nextInt();
        //Creamos arreglos para el ingreso de datos como nombres,edades y direcciones
        String [] nombres= new String[canPersonas];
        int [] edades= new int[canPersonas];
        String [] direcciones= new String[canPersonas];
        
       for (int i = 0; i <canPersonas ; i++) {
            System.out.println("-> Personas "+(i+1)+" :");
            System.out.println("Nombre:");
            String nombre=leer.nextLine();
            nombres[i]=nombre;
            leer.nextLine();//limpiar el buffer
            System.out.println("Edad: ");
            int edad=leer.nextInt();
            edades [i]=edad;
            leer.nextLine();
            System.out.println("Direccion: ");
            String direccion=leer.nextLine();
       }
        System.out.println("------------------------");
        System.out.println("-- REGISTROS DE DATOS --");
        System.out.println("------------------------");
        for (int i = 0; i < canPersonas; i++) {
            System.out.println("DATOS DE PERSONAS "+(i+1)+" :");
            System.out.println("Nombre: "+nombres[i]);
            System.out.println("Edad: "+edades[i]);
            System.out.println("Direccion: "+direcciones[i]);       
        }
    }
     static void ingresodenumeros(){
         Scanner leer = new Scanner(System.in);
        System.out.println("-- Ingrese la cantidad de numeros que va a registrar --");
        int n=leer.nextInt();
        //Arreglos al ingreso de numeros
        int[] numeros = new int[n];
        
        for(int i=0;i<n;i++){
             System.out.println("-> Ingrese el Numero "+(i+1)+" : ");
             numeros[i]=leer.nextInt();
        }
         System.out.println("-- Los numeros ingresados en orden son --");
         for(int i = n-1;i>= 0; i--){
             System.out.println( numeros[i]);
         }

    }
}
