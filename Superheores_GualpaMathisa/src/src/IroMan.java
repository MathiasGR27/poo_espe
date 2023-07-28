package src;

import java.util.Scanner;

public class IroMan extends Superheroes{
	Scanner scanner = new Scanner(System.in);
	//Atributo propio de la clase
	private String traje;

	//Constructor
	public IroMan(String nombre, int cantidadenergia, String genero,String traje) {
		super(nombre, cantidadenergia, genero); //Sobrecarga
		this.traje=traje;
	}

	//Metodos getter and setter del atributo propio de la clase
	public String getTraje() {
		return traje;
	}

	public void setTraje(String traje) {
		this.traje = traje;
	}

	//Clase abstracta heredada
	@Override
	public void niveldefuerza() {
		int nivelfuerzaI=50;
		int nivelfuerzaVI=40;
		System.out.println("El heroe es "+ getNombre() + " y su nivel de fuerza es de");
		System.out.println(" "+ nivelfuerzaI + " porciento");
		System.out.println("Ingrese el nombre del villano");
		String nombrevI=scanner.nextLine();
		System.out.println("Y se enfrenta a " +nombrevI+ " que tiene como poder");
		System.out.println(" "+ nivelfuerzaVI + " porciento");
		
		System.out.println("Se va a enfrentar " +getNombre()+ "con poder de " + nivelfuerzaI + "vs" +nombrevI + "con poder de " + nivelfuerzaVI );
		
	}

}
