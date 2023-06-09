/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva_gualpamathias;

/**
 *
 * @author ESPE
 */
public class Matricula {
    private Alumno alumno;
    private Materia materia;
    private Profesor profesor;

    public Matricula(Alumno alumno, Materia materia, Profesor profesor) {
        this.alumno   = alumno;
        this.materia  = materia;
        this.profesor = profesor;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    @Override
    public String toString() {
        return "           Matricula      "+
                "\n==============================="+
                "\n  alumno   = " + alumno +
                "\n==============================="+
                "\n  materia  = " + materia +
                "\n==============================="+
                "\n  profesor = " + profesor +
                '}';
}
}

