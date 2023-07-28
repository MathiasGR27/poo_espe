package src;

import java.util.Scanner;

public class Hulk extends Superheroes{
	Scanner scanner = new Scanner(System.in);
	//Atributo propio de la clase
	private String aspecto;

	//Constructor 
	public Hulk(String nombre, int cantidadenergia, String genero, String aspecto) {
		super(nombre, cantidadenergia, genero);
		this.aspecto=aspecto;
	}
	
	//Metodos getter y setter del atributo propio de la clase
	public String getAspecto() {
		return aspecto;
	}
	
	public void setAspecto(String aspecto) {
		this.aspecto = aspecto;
	}

	//Clase abstracta heredada
	@Override
	public void niveldefuerza() {
		int nivelfuerzah=100;
		int nivelfuerzaVh=90;
		System.out.println("El heroe es"+ getNombre() + " y su nivel de fuerza es de");
		System.out.println(""+ nivelfuerzah + " porciento ");
		System.out.println("Ingrese el nombre del villano");
		String nombrevH=scanner.nextLine();
		System.out.println("Y se enfrenta a " + nombrevH + " que tiene como poder");

		System.out.println(" "+ nivelfuerzaVh + " porciento");
		
		
		System.out.println("Se va a enfrentar " +getNombre()+ "con poder de " + nivelfuerzah + "vs" +nombrevH + "con poder de " + nivelfuerzaVh );
	}

}
