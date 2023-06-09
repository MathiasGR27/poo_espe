/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogrupo3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ESPE
 */
public class ProduccionCultivo {
     public int id;
    public String nombreCultivo;
    public int numeroProduccionCultivo;
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el ID del cultivo: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el nombre del cultivo: ");
        String nombreCultivo = scanner.nextLine();

        System.out.print("Ingrese el número de producción del cultivo: ");
        int numeroProduccionCultivo = scanner.nextInt();
        
        System.out.print("============================================== ");
        System.out.print("El cultivo se agreo correctamente ");
        System.out.print("============================================== ");

        ProduccionCultivo produccionCultivo = new ProduccionCultivo(id, nombreCultivo, numeroProduccionCultivo);

    }
    
        public static void ProduccionCultivoMenu() {
           Scanner scanner = new Scanner(System.in);
    int opcion;

    do {
        mostrarMenu();
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                scanner.nextLine(); // Consumir el salto de línea pendiente
                System.out.print("Ingrese el nombre del cultivo a eliminar: ");
                String cultivoEliminar = scanner.nextLine();
                eliminarCultivo(cultivoEliminar);
                break;
            case 2:
                scanner.nextLine(); // Consumir el salto de línea pendiente
                System.out.print("Ingrese el nombre del cultivo a modificar: ");
                String cultivoModificar = scanner.nextLine();
                modificarCultivo(cultivoModificar);
                break;
            case 3:
                scanner.nextLine(); // Consumir el salto de línea pendiente
                System.out.print("Ingrese el nombre del cultivo a leer: ");
                String cultivoLeer = scanner.nextLine();
                leerCultivo(cultivoLeer);
                break;
            case 4:
                anadirCultivo();
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
            
            System.out.println("\n=== Menú de Producción de Cultivo ===");
            System.out.println("1. Eliminar cultivo");
            System.out.println("2. Modificar cultivo");
            System.out.println("3. Leer cultivo");
            System.out.println("4. Añadir cultivo");
            System.out.println("5. Volver al menú principal");
            System.out.print("============================================== ");
            System.out.print("\nSeleccione una opción: ");
            
    }

    public ProduccionCultivo(int id, String nombreCultivo, int numeroProduccionCultivo) {
        this.id = id;
        this.nombreCultivo = nombreCultivo;
        this.numeroProduccionCultivo = numeroProduccionCultivo;
    }

    public static void eliminarCultivo(String nombre) {
    // Lógica para eliminar cultivo
    System.out.println("Se eliminó el cultivo: " + nombre);
}

public static void modificarCultivo(String nombre) {
    // Lógica para modificar cultivo
    System.out.println("Se modificó el cultivo: " + nombre);
}

public static void leerCultivo(String nombre) {
    // Lógica para leer cultivo
    System.out.println("Se leyó el cultivo: " + nombre);
}

public static void anadirCultivo() {
    // Lógica para añadir cultivo
    System.out.println("Se añadió un nuevo cultivo");
}

}
