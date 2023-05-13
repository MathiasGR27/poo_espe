/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.craciondeclases_gualpamathias;

/**
 *
 * @author Usuario
 */
public class Craciondeclases_GualpaMathias {

    public static void main(String[] args) {
        
        Laptop laptop1 = new Laptop();
        laptop1.marca="ASUS";
        laptop1.color="Negro";
        laptop1.discoduro="1 terabyte";
        laptop1.memoriaram="6 gb";
        laptop1.procesador="Intel";
   
        System.out.println(laptop1.marca);
        System.out.println(laptop1.color);
        System.out.println(laptop1.discoduro);
        System.out.println(laptop1.memoriaram);
        System.out.println(laptop1.procesador);
        System.out.println("====================");
        
        Gato Gato1 = new Gato();
        Gato1.genero="Macho";
        Gato1.color="Gris";
        Gato1.edad=2;
        Gato1.nombre="Clara";
        
        System.out.println(Gato1.genero);
        System.out.println(Gato1.color);
        System.out.println(Gato1.nombre);
        System.out.println(Gato1.edad);
        System.out.println("====================");
        
        Calzado Calzado1 = new Calzado();
        Calzado1.marca="Adidas";
        Calzado1.color="Blancos";
        Calzado1.talla=42;
        Calzado1.modelo="deportivo";
        Calzado1.forma="zapatos";
        
        System.out.println(Calzado1.marca);
        System.out.println(Calzado1.color);
        System.out.println(Calzado1.forma);
        System.out.println(Calzado1.talla);
        System.out.println(Calzado1.modelo);
        
        
    }
}
