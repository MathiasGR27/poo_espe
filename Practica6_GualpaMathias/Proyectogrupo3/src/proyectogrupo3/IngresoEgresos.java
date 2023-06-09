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
public class IngresoEgresos {
      public double ventaGanado;
    public double ventaCultivo;
    public double salarioAPagar;
    public double alimentacion;
    public double productosGanaderos;
    public double productosAgricolas;
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto de venta de ganado: ");
        double ventaGanado = scanner.nextDouble();

        System.out.print("Ingrese el monto de venta de cultivo: ");
        double ventaCultivo = scanner.nextDouble();

        System.out.print("Ingrese el monto de salario a pagar: ");
        double salarioAPagar = scanner.nextDouble();

        System.out.print("Ingrese el monto de alimentación: ");
        double alimentacion = scanner.nextDouble();

        System.out.print("Ingrese el monto de productos ganaderos: ");
        double productosGanaderos = scanner.nextDouble();

        System.out.print("Ingrese el monto de productos agrícolas: ");
        double productosAgricolas = scanner.nextDouble();

        IngresoEgresos ingresosEgresos = new IngresoEgresos(ventaGanado, ventaCultivo, salarioAPagar, alimentacion,
                productosGanaderos, productosAgricolas);

    }
    
        public static void IngresosEgresosMenu() {
     Scanner scanner = new Scanner(System.in);
    int opcion;

    do {
        mostrarMenu();
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese la cantidad de ingresos a agregar: ");
                double ingresos = scanner.nextDouble();
                agregarIngresos(ingresos);
                break;
            case 2:
                System.out.print("Ingrese la cantidad de egresos a agregar: ");
                double egresos = scanner.nextDouble();
                agregarEgresos(egresos);
                break;
            case 3:
                System.out.println("Volviendo al menú principal...");
                break;
            default:
                System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                break;
        }
    } while (opcion != 3);
}


    public static void mostrarMenu() {
            
            System.out.println("\n=== Menú de Ingresos y Egresos ===");
            System.out.println("1. Agregar ingresos");
            System.out.println("2. Agregar egresos");
            System.out.println("3. Volver al menú principal");
            System.out.print("============================================== ");
            System.out.print("\nSeleccione una opción: ");
            
    }

    public IngresoEgresos(double ventaGanado, double ventaCultivo, double salarioAPagar, double alimentacion,
                          double productosGanaderos, double productosAgricolas) {
        this.ventaGanado = ventaGanado;
        this.ventaCultivo = ventaCultivo;
        this.salarioAPagar = salarioAPagar;
        this.alimentacion = alimentacion;
        this.productosGanaderos = productosGanaderos;
        this.productosAgricolas = productosAgricolas;
    }

    public static void agregarIngresos(double cantidad) {
    // Lógica para agregar ingresos
    System.out.println("Se agregaron ingresos por un monto de: $" + cantidad);
}

public static void agregarEgresos(double cantidad) {
    // Lógica para agregar egresos
    System.out.println("Se agregaron egresos por un monto de: $" + cantidad);
}

   
}