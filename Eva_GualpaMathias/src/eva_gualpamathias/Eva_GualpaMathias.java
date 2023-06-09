/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_gualpamathias;

import java.util.Scanner;

/**
 *
 * @author ESPE
 */
public class Eva_GualpaMathias {
private static final int MAX_PROFESORES = 4;//Numero maximos de profesores a ingresar   
    private static final int MAX_ALUMNOS = 4;//Numero maximos de alumnos a ingresar 
    private static final int MAX_MATERIAS = 4;//Numero maximos de materias a ingresar 
    private static final int MAX_MATRICULAS = 4;//Numero maximos de matriculas a ingresar 

    private static Profesor[]  profesores = new Profesor[MAX_PROFESORES];
    private static Alumno[]    alumnos = new Alumno[MAX_ALUMNOS];
    private static Materia[]   materias = new Materia[MAX_MATERIAS];
    private static Matricula[] matriculas = new Matricula[MAX_MATRICULAS];
    private static int numProfesores = 0;
    private static int numAlumnos = 0;
    private static int numMaterias = 0;
    private static int numMatriculas = 0;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("==================================");
            System.out.println("========       Menú       ========");
            System.out.println("1. Ingreso de Profesores");
            System.out.println("2. Ingreso de Alumnos");
            System.out.println("3. Ingreso de Materias");
            System.out.println("4. Gestión de Matrículas");
            System.out.println("5. Total Matriculados");
            System.out.println("6. Salir");
            System.out.println("==================================");
            System.out.println("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    ingresarProfesores();
                    mostrarProfesores();
                    break;
                case 2:
                    ingresarAlumnos();
                    mostrarAlumnos();
                    break;
                case 3:
                    ingresarMaterias();
                    mostrarMaterias();
                    break;
                case 4:
                    gestionMatriculas();
                    mostrarMatriculas();
                    break;
                case 5:
                    mostrarTotalMatriculados();
                    break;
                case 6:
                    System.out.println(" Fin del programa ");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 6);
    }

    public static void ingresarProfesores() {
        if (numProfesores >= MAX_PROFESORES) {
            System.out.println("Ya se han ingresado el máximo número de profesores.");
            return;
        }
        System.out.println("==================================");
        System.out.println("Ingrese el nombre del profesor: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la cédula del profesor: ");
        String cedula = scanner.nextLine();
        System.out.println("Ingrese la dirección del profesor: ");
        String direccion = scanner.nextLine();
        System.out.println("Ingrese el celular del profesor: ");
        String celular = scanner.nextLine();
        System.out.println("==================================");

        profesores[numProfesores] = new Profesor(nombre, cedula, direccion, celular);
        numProfesores++;

        System.out.println("Profesor ingresado correctamente.");
        System.out.println("==================================");
    }

    public static void mostrarProfesores() {
        System.out.println("===        Profesor       ===");
        for (int i = 0; i < numProfesores; i++) {
            System.out.println(profesores[i]);
        }
        System.out.println();
    }

    public static void ingresarAlumnos() {
        if (numAlumnos >= MAX_ALUMNOS) {
            System.out.println("Ya se han ingresado el máximo número de alumnos.");
            return;
        }
        System.out.println("==================================");
        System.out.println("Ingrese el nombre del alumno: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la cédula del alumno: ");
        String cedula = scanner.nextLine();
        System.out.println("Ingrese la dirección del alumno: ");
        String direccion = scanner.nextLine();
        System.out.println("Ingrese el celular del alumno: ");
        String celular = scanner.nextLine();
        System.out.println("Ingrese el genero del alumno: ");
        String genero = scanner.nextLine();
        System.out.println("==================================");

        alumnos[numAlumnos] = new Alumno(nombre, cedula, direccion, celular, genero);
        numAlumnos++;

        System.out.println("Alumno ingresado correctamente.");
        System.out.println("==================================");
    }

    public static void mostrarAlumnos() {
        System.out.println("===        Alumno      ===");
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println(alumnos[i]);
        }
        System.out.println();
    }

    public static void ingresarMaterias() {
        if (numMaterias >= MAX_MATERIAS) {
            System.out.println("Ya se han ingresado el máximo número de materias.");
            return;
        }

        System.out.println("Ingrese el nombre de la materia: ");
        String nombre = scanner.nextLine();

        materias[numMaterias] = new Materia(nombre);
        numMaterias++;

        System.out.println("Materia ingresada correctamente.");
    }

    public static void mostrarMaterias() {
       System.out.println("===        Materia      ===");
        for (int i = 0; i < numMaterias; i++) {
            System.out.println(materias[i]);
        }
        System.out.println();
    }

    public static void gestionMatriculas() {
        if (numMatriculas >= MAX_MATRICULAS) {
            System.out.println("Ya se han realizado el máximo número de matrículas.");
            return;
        }
        System.out.println("==================================");

        System.out.println("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = scanner.nextLine();
        System.out.println("Ingrese el nombre de la materia: ");
        String nombreMateria = scanner.nextLine();
        System.out.println("Ingrese el nombre del profesor: ");
        String nombreProfesor = scanner.nextLine();
        System.out.println("==================================");

        // Buscar el alumno por nombre
        Alumno alumno = null;
        for (int i = 0; i < numAlumnos; i++) {
            if (alumnos[i].getNombre().equalsIgnoreCase(nombreEstudiante)) {
                alumno = alumnos[i];
                break;
            }
        }

        // Buscar la materia por nombre
        Materia materia = null;
        for (int i = 0; i < numMaterias; i++) {
            if (materias[i].getNombre().equalsIgnoreCase(nombreMateria)) {
                materia = materias[i];
                break;
            }
        }

        // Buscar el profesor por nombre
        Profesor profesor = null;
        for (int i = 0; i < numProfesores; i++) {
            if (profesores[i].getNombre().equalsIgnoreCase(nombreProfesor)) {
                profesor = profesores[i];
                break;
            }
        }

        if (alumno != null && materia != null && profesor != null) {
            matriculas[numMatriculas] = new Matricula(alumno, materia, profesor);
            numMatriculas++;
            System.out.println("Matrícula realizada correctamente.");
        } else {
            System.out.println("Error: No se encontró el estudiante, la materia o el profesor.");
        }
    }

    public static void mostrarMatriculas() {
        System.out.println("===        Matrículas       ===");
        for (int i = 0; i < numMatriculas; i++) {
            System.out.println(matriculas[i]);
        }
        System.out.println();
    }

    public static void mostrarTotalMatriculados() {
        int totalHombres = 0;
        int totalMujeres = 0;

        for (int i = 0; i < numMatriculas; i++) {
            Alumno alumno = matriculas[i].getAlumno();
            if (alumno.getGenero().equalsIgnoreCase("M")) {
                totalHombres++;
            } else if (alumno.getGenero().equalsIgnoreCase("F")) {
                totalMujeres++;
            }
        }

        System.out.println("Total de hombres matriculados: " + totalHombres);
        System.out.println("Total de mujeres matriculadas: " + totalMujeres);
       
    }
}




