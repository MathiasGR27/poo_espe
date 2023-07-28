package src;

public abstract class Superheroes {
	
	//Tres atributos clases padre
	private String nombre;
    private int cantidadenergia;
    private String genero;
    
    //Constructor
	public Superheroes(String nombre, int cantidadenergia, String genero) {
		this.nombre = nombre;
		this.cantidadenergia = cantidadenergia;
		this.genero = genero;
	}
    
	//Metodos getter and setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadenergia() {
		return cantidadenergia;
	}

	public void setCantidadenergia(int cantidadenergia) {
		this.cantidadenergia = cantidadenergia;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	//Clase abstracta 
	public abstract void niveldefuerza();

}
