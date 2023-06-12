/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7u2herencia_gualpamahias;

/**
 *
 * @author ESPE
 */
public class Automovil extends vehiculo{
    
    boolean parabrisas;
@Override    
public void encendido(){
    encendido=true;
    estado="Vehiculo encendido";
}
public void apagado(){
    encendido=false;
    estado="Vehiculo apagado";
}
}
