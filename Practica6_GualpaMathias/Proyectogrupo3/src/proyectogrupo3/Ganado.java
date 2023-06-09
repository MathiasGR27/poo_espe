/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogrupo3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ESPE
 */
public class Ganado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el ID del ganado: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el tipo de ganadería: ");
        String tipoGanaderia = scanner.nextLine();

        System.out.print("Ingrese el número de ganado: ");
        int numeroGanado = scanner.nextInt();
        
         System.out.print("============================================== ");
        System.out.print("El Ganado se agrego correctamente ");
        System.out.print("============================================== ");

        Ganado ganado = new Ganado(id, tipoGanaderia, numeroGanado);
    }
    public int id;
    public String tipoGanaderia;
    public int numeroGanado;
    
        public static void ganadoMenu() {
            Scanner scanner = new Scanner(System.in);
            
    int opcion;

    do {
        mostrarMenu();
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                scanner.nextLine(); // Consumir el salto de línea pendiente
                System.out.print("Ingrese el nombre del ganado a eliminar: ");
                String ganadoEliminar = scanner.nextLine();
                eliminarGanado(ganadoEliminar);
                break;
            case 2:
                scanner.nextLine(); // Consumir el salto de línea pendiente
                System.out.print("Ingrese el nombre del ganado a modificar: ");
                String ganadoModificar = scanner.nextLine();
                modificarGanado(ganadoModificar);
                break;
            case 3:
                scanner.nextLine(); // Consumir el salto de línea pendiente
                System.out.print("Ingrese el nombre del ganado a leer: ");
                String ganadoLeer = scanner.nextLine();
                leerGanado(ganadoLeer);
                break;
            case 4:
                anadirGanado();
                break;
            case 5:
                System.out.println("Volviendo al menú principal...");
                break;
            default:
                System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                break;
        }
    } while (opcion != 5);
}

    public static void mostrarMenu() {
            
            System.out.println("\n=== Menú de Ganado ===");
            System.out.println("1. Eliminar ganado");
            System.out.println("2. Modificar ganado");
            System.out.println("3. Leer ganado");
            System.out.println("4. Añadir ganado");
            System.out.println("5. Volver al menú principal");
            System.out.print("============================================== ");
            System.out.print("\nSeleccione una opción: ");
            
    }

    public Ganado(int id, String tipoGanaderia, int numeroGanado) {
        this.id = id;
        this.tipoGanaderia = tipoGanaderia;
        this.numeroGanado = numeroGanado;
    }

    public static void eliminarGanado(String nombre) {
    // Lógica para eliminar ganado
    System.out.println("Se eliminó el ganado: " + nombre);
}

public static void modificarGanado(String nombre) {
    // Lógica para modificar ganado
    System.out.println("Se modificó el ganado: " + nombre);
}

public static void leerGanado(String nombre) {
    // Lógica para leer ganado
    System.out.println("Se leyó el ganado: " + nombre);
}

public static void anadirGanado() {
    // Lógica para añadir ganado
    System.out.println("Se añadió un nuevo ganado");
}

}
