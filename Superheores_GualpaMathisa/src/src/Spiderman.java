package src;

import java.util.Scanner;

public class Spiderman extends Superheroes {
	Scanner scanner = new Scanner(System.in);
	//Atributo propio de la clase
	private String habilidad;

	//Constructor
	public Spiderman(String nombre, int cantidadenergia, String genero, String habilidad) {
		super(nombre, cantidadenergia, genero);//Sobrecarga
		this.habilidad=habilidad;
	}

	//Metodos getter and setter del atributo propio de la clase
	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String superpoder) {
		this.habilidad = superpoder;
	}

	//Clase abstracta heredada
	@Override
	public void niveldefuerza() {
		int nivelfuerzaS=50;
		int nivelfuerzaVS=40;
		System.out.println("El heroe es "+ getNombre() + " y su nivel de fuerza es de");
		System.out.println(" "+ nivelfuerzaS + " porciento");
		System.out.println("Ingrese el nombre del villano");
		String nombrevS=scanner.nextLine();
		System.out.println("Y se enfrenta a " + nombrevS+ " que tiene como poder");
		System.out.println(" "+ nivelfuerzaVS + " porciento");
		
		System.out.println("Se va a enfrentar " +getNombre()+ "con poder de " + nivelfuerzaS + "vs" +nombrevS + "con poder de " + nivelfuerzaVS );
		
	}

}
