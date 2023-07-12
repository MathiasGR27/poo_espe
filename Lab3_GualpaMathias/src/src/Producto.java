package src;

public abstract class Producto {
	
	//Atributos
	private String nombre; 
	private double precio;
	
	//Se crea el constructor donde recibe los atributos
	public Producto(String nombre,double precio) {
		this.nombre=nombre;
		this.precio=precio;
	}
	
	//Se crea los metodos get
	public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    //Se declara un metodo abstracto que va a ser heredado a las clases hijas
    public abstract double obtenerPrecioPedido(int unidadesPedidas);
}
	


