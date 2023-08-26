package tarea2u3_gualpamathias;

import java.util.Scanner;//Se importa la clase scanner

public class Tarea2U3_GualpaMathias {

    public static void main(String[] args) {
        //Se instancia la clase scanner
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Ingrese su nombre");//Pide al usuario que ingrese el nombre 
        String nombre = scanner.nextLine(); //Leer nombre y genera un salto de linea 
        
        System.out.println("Ingrese su apellido");//Pide al usuario que ingrese el apellido 
        String apellido=scanner.nextLine();//Leer apellido y genera un salto de linea 
        
        System.out.println("Ingrese su edad");//Pide al usuario que ingrese el edad 
        int edad = scanner.nextInt();//Leer edad y genera un salto de linea 
        
        scanner.nextLine(); //Limpie el buffer
        
        System.out.println("Ingrese su carrera");//Pide al usuario que ingrese el carrera 
        String carrera = scanner.nextLine(); //Leer carrera y genera un salto de linea 
        
        System.out.println("Ingrese su nivel");//Pide al usuario que ingrese el nivel 
        int nivel = scanner.nextInt();//Leer nivel y genera un salto de linea 
        
        scanner.nextLine(); //Limpie el buffer
        
        System.out.println("Ingrese su materia que recibe");//Pide al usuario que ingrese el mataeria 
        String materia = scanner.nextLine(); //Leer mataeria y genera un salto de linea 
        
        //Mostrar en pantalla todos los datos 
        System.out.println("------------------------------------");
        System.out.println("-   Bienvenido a la Universidad    -");
        System.out.println("Su nombre es : " +nombre );
        System.out.println("Su apellido es : " +apellido );
        System.out.println("Su Edad es : " + edad + " años " );
        System.out.println("Su Carrera es : " +carrera );
        System.out.println("Su nivel es : " + nivel + " semestre " );
        System.out.println("Su Materia recibida es : " +materia );
        System.out.println("------------------------------------");
        
        scanner.close();
    }
    
}
