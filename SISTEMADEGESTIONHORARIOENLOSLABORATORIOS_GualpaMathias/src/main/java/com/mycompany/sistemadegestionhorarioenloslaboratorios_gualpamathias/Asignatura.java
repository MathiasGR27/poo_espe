/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadegestionhorarioenloslaboratorios_gualpamathias;

/**
 *
 * @author Usuario
 */
public class Asignatura {
    private String nombre;
    private String horario;
    private Laboratorio lab;

    public Asignatura(String nombre, String horario, Laboratorio lab) {
        this.nombre = nombre;
        this.horario = horario;
        this.lab = lab;
    }
}
