/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva_gualpamathias;

/**
 *
 * @author ESPE
 */
public class Alumno {
     private String nombre;
    private String cedula;
    private String direccion;
    private String celular;
    private String genero;

    public Alumno(String nombre, String cedula, String direccion, String celular, String genero) {
        this.nombre    = nombre;
        this.cedula    = cedula;
        this.direccion = direccion;
        this.celular   = celular;
        this.genero    = genero;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "           Alumno         " +
                "\n  nombre    =" + nombre + 
                "\n  cedula    =" + cedula +
                "\n  direccion =" + direccion + 
                "\n  celular   =" + celular + 
                "\n  Genero    =" + genero + 
                '}';
    }
}
