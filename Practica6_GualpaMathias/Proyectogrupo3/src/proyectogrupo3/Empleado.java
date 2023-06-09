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
public class Empleado {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el ID del empleado: ");
            int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido del empleado: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese el desempeño del empleado: ");
        String desempeno = scanner.nextLine();

        System.out.print("Ingrese el sueldo del empleado: ");
        double sueldo = scanner.nextDouble();
        
        System.out.print("============================================== ");
        System.out.print("El empleado se agrego correctamente ");
        System.out.print("============================================== ");

        Empleado empleado = new Empleado(id, nombre, apellido, desempeno, sueldo);

        empleado.empleadoMenu();
    }
       
    public int id;
    public String nombre;
    public String apellido;
    public String desempeno;
    public double sueldo;
    
    
    public Empleado(int id, String nombre, String apellido, String desempeno, double sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.desempeno = desempeno;
        this.sueldo = sueldo;
    }

    public static void mostrarMenu() {
       
        System.out.println("\n----- Menú Empleados -----");
        System.out.println("1. Eliminar Empleado");
        System.out.println("2. Modificar Empleado");
        System.out.println("3. Leer Empleado");
        System.out.println("4. Contratar Empleado");
        System.out.println("5. Volver al Menú Principal");
        System.out.print("============================================== ");
        System.out.print("\nIngrese una opción: ");
        
    }

    public static void empleadoMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        Empleado empleado = new Empleado(1, "Nombre", "Apellido", "Desempeño", 1000.0);

        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    scanner.nextLine(); // Consumir el salto de línea pendiente
                    System.out.print("Ingrese el nombre del empleado a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    empleado.eliminarEmpleado(nombreEliminar);
                    break;

                case 2:
                    scanner.nextLine(); // Consumir el salto de línea pendiente
                    System.out.print("Ingrese el nombre del empleado a modificar: ");
                    String nombreModificar = scanner.nextLine();
                    empleado.modificarEmpleado(nombreModificar);
                    break;

                case 3:
                    scanner.nextLine(); // Consumir el salto de línea pendiente
                    System.out.print("Ingrese el nombre del empleado a leer: ");
                    String nombreLeer = scanner.nextLine();
                    empleado.leerEmpleado(nombreLeer);
                    break;

                case 4:
                    empleado.contratarEmpleado();
                    break;

                case 5:
                    System.out.println("Volviendo al menú principal...");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (opcion !=5);
    }

    public void eliminarEmpleado(String nombre) {
        // Lógica para eliminar empleado
        System.out.println("Se eliminó el empleado: " + nombre);
    }

    public void modificarEmpleado(String nombre) {
        // Lógica para modificar empleado
        System.out.println("Se modificó el empleado: " + nombre);
    }

    public void leerEmpleado(String nombre) {
        // Lógica para leer empleado
        System.out.println("Se leyó el empleado: " + nombre);
    }

    public void contratarEmpleado() {
        // Lógica para contratar empleado
        System.out.println("Se contrató un nuevo empleado");
    }
}
