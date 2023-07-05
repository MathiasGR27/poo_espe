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
public class CuentaLimitada extends Cuenta {
     private double limite;

    public CuentaLimitada() {
        super();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el límite de dinero para depósitos y retiros: ");
        this.limite = scanner.nextDouble();
    }

    @Override
    public void depositar(double monto) {
        if (this.monto + monto <= this.limite) {
            super.depositar(monto);
        } else {
            System.out.println("El monto excede el límite de la cuenta.");
        }
    }

    @Override
    public void retirar(double monto) {
        if (monto <= this.monto && monto <= this.limite) {
            super.retirar(monto);
        } else {
            System.out.println("Fondos insuficientes o monto excede el límite de la cuenta.");
        }
    }
}
