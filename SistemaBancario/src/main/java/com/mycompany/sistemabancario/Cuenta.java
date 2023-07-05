/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemabancario;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Cuenta {
    private String nombre;
    private String cedula;
    private String telefono;
    private String numeroCuenta;
    double monto;

    public Cuenta() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        this.nombre = scanner.nextLine();
        
        System.out.print("Ingrese su numero de cedula: ");
        this.cedula = scanner.nextLine();
        
        System.out.print("Ingrese su número de teléfono : ");
        this.telefono = scanner.nextLine();
        
        System.out.print("Ingrese su número de cuenta: ");
        this.numeroCuenta = scanner.nextLine();
        
        System.out.print("Ingrese el monto inicial : ");
        this.monto = scanner.nextDouble();
    }

    public void depositar(double monto) {
        this.monto += monto;
        System.out.println("Se ha depositado " + monto + " en la cuenta. Nuevo saldo: " + this.monto);
    }

    public void retirar(double monto) {
        if (monto <= this.monto) {
            this.monto -= monto;
            System.out.println("Se ha retirado " + monto + " de la cuenta. Nuevo saldo: " + this.monto);
        } else {
            System.out.println("Fondos insuficientes. No se puede realizar el retiro.");
        }
    }
}
