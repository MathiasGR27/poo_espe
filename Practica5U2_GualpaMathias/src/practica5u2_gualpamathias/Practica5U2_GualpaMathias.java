/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica5u2_gualpamathias;
import java.io.*;  // Llama a todas las librerias
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author ESPE
 */
public class Practica5U2_GualpaMathias {
        // TODO code application logic here
        public static void main(String[] args) throws IOException{
        // TODO code application logic here
        try(BufferedReader br=new BufferedReader(new FileReader("C:\\Practica5\\Practica5.txt"));
         BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Practica5\\Practica5.txt"));){
         
         bw.write("Esto es una prueba usando buffered");
         bw.newLine();
         bw.write("Seguimos usando buffered");
         bw.newLine();
                
                bw.write("AAA");        
        }
     }
}
    
   
