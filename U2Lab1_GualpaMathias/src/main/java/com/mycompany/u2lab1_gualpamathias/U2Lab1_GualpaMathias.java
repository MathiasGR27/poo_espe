/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.u2lab1_gualpamathias;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class U2Lab1_GualpaMathias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("==================================");
            System.out.println("========       Menú       ========");
            System.out.println("1. Area y perímetro del Cuadrado");
            System.out.println("2. Area y perímetro del Triángulo");
            System.out.println("3. Area y perímetro del Rectángulo");
            System.out.println("4. Area y perímetro del Pentágono");
            System.out.println("5. Salir");
            System.out.println("==================================");
            System.out.println("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el lado del Cuadrado: ");//se pide que ingrese el lado del cuadrado
                    double ladoCuadrado = scanner.nextDouble();
                    Cuadrado cuadrado = new Cuadrado(ladoCuadrado);//se llama a la clase 
                    System.out.println("El área del Cuadrado es: " + cuadrado.calcularArea());//Arroga el calculo del area del cuadrado que se encuentra en la clase cuadrado
                    System.out.println("El perímetro del Cuadrado es: " + cuadrado.calcularPerimetro());//Arroga el calculo del perimetro del cuadrado que se encuentra en la clase cuadrado
                    break;
                case 2:
                    System.out.print("Ingrese la base del Triángulo: ");//se pide la base del triangulo     
                    double baseTriangulo = scanner.nextDouble();
                    System.out.print("Ingrese la altura del Triángulo: ");//se pide la altura del triangulo
                    double alturaTriangulo = scanner.nextDouble();
                    Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo);//se llama a la clase 
                    System.out.println("El área del Triángulo es: " + triangulo.calcularArea());//Arroga la area del triangulo que se encuentra en la clase triangulo 
                    System.out.println("El perímetro del Triángulo es: " + triangulo.calcularPerimetro());//Arroga el perimetroa del triangulo que se encuentra en la clase triangulo 
                    break;
              
                case 3:
                    System.out.print("Ingrese la base del Rectángulo: ");//se pide la base del rectangulo  
                    double baseRectangulo = scanner.nextDouble();
                    System.out.print("Ingrese la altura del Rectángulo: ");//se pide la altura del rectangulo
                    double alturaRectangulo = scanner.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);//se llama a la clase 
                    System.out.println("El área del Rectángulo es: " + rectangulo.calcularArea());//Arroga la area del rectangulo que se encuentra en la clase rectangulo
                    System.out.println("El perímetro del Rectángulo es: " + rectangulo.calcularPerimetro());//Arroga el perimetro  del rectangulo que se encuentra en la clase rectangulo
                    break;
                case 4:
                     System.out.print("Ingrese el lado del Pentágono: ");//se ingresa el lado del pentagono
                    double ladoPentagono = scanner.nextDouble();
                    Pentagono pentagono = new Pentagono(ladoPentagono);
                    System.out.println("El área del Pentágono es: " + pentagono.calcularArea());//Arroga la area del pentagono  que se encuentra en la clase pentagono
                    System.out.println("El perímetro del Pentágono es: " + pentagono.calcularPerimetro());//Arroga la area del pentagono que se encuentra en la clase pentagono
                    break;
         
                case 5:
                    System.out.println(" Fin del programa ");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 5);
    }
}
      