/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva_gualpamathias;

/**
 *
 * @author ESPE
 */
public class Profesor {
        private String nombre;
    private String cedula;
    private String direccion;
    private String celular;

    public Profesor(String nombre, String cedula, String direccion, String celular) {
        this.nombre    = nombre;
        this.cedula    = cedula;
        this.direccion = direccion;
        this.celular   = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCelular() {
        return celular;
    }

    @Override
    public String toString() {
        return  "         Profesor       " +
                "\n nombre    = " + nombre + 
                "\n cedula    = " + cedula + 
                "\n direccion = " + direccion + 
                "\n celular   = " + celular + 
                '}';
    }
}


