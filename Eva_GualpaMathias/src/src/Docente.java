package src;

import java.util.Scanner;

public class Docente extends Personal{ //Clase hija extendiendo la clase Padre
	Scanner scanner = new Scanner(System.in);
	//Atributo de la clase
	String materiaencargada;
    
	//Constructor de la clase Docente
	Docente(String nombre, int edad, String direccion, String genero, double salario,String materiaencargada) {
		super(nombre, edad, direccion, genero, salario);
		this.materiaencargada=materiaencargada;
	}
	
	//Metodos getter y setter
	
	public String getMateriaencargada() {
		return materiaencargada;
	}

	public void setMateriaencargada(String materiaencargada) {
		this.materiaencargada = materiaencargada;
	}

	//Metodo abstracto pago heredado de la clase padre
	@Override
	public void pago() {
		System.out.println("Su pago es el siguiente : "+ getSalario());
	}
	//Metodo abstracto incentivar heredado de la clase padre
	@Override
	public void incentivar() {
		double precioD=getSalario();
			precioD *= 0.10;
			double preciofinalD = getSalario()+precioD;
			System.out.println("Por desempeñar como buen Docente en la materia de: "+this.materiaencargada);
			System.out.println("Su incentivo es de      : "+ precioD);
			System.out.println("Su salario entonces sera igual a : "+ preciofinalD);
	}

}
