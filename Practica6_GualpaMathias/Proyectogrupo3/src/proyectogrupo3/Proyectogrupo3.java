/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectogrupo3;

import java.util.Scanner;

/**
 *
 * @author ESPE
 */
public class Proyectogrupo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Llamar a la clase Empleado
                    Empleado.main(args);
                    Empleado.empleadoMenu();
                    break;
                case 2:
                    // Llamar a la clase Ganado
                    Ganado.main(args);
                    Ganado.ganadoMenu();
                    break;
                case 3:
                    // Llamar a la clase ProduccionCultivo
                    ProduccionCultivo.main(args);
                    ProduccionCultivo.ProduccionCultivoMenu();
                    break;
                case 4:
                    // Llamar a la clase IngresosEgresos
                    IngresoEgresos.main(args);
                    IngresoEgresos.IngresosEgresosMenu();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (opcion != 5);
    }

    public static void mostrarMenu() {
        System.out.print("============================================== ");
        System.out.println("\n----- Hacienda Santa Isabela - Menú Principal -----");
        System.out.println("1. Empleados");
        System.out.println("2. Ganado");
        System.out.println("3. Producción Cultivo");
        System.out.println("4. Ingresos y Egresos");
        System.out.println("5. Salir");
        System.out.print("============================================== ");
        System.out.print("\n Ingrese una opción:  ");
    }
}
    

