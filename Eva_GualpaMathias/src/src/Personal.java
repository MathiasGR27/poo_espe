package src;

public abstract class Personal { //Clase Padre
	//Atributos de la clase padre
	private String nombre;
	private int edad;
	private String direccion;
	private String genero;
	private double salario;
	//Constructor de la clase
	Personal(String nombre,int edad,String direccion,String genero,double salario){
		this.nombre=nombre;
		this.edad=edad;
		this.direccion=direccion;
		this.genero=genero;
		this.salario=salario;
	}
	//Metodos getter y setter
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
	}
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion ) {
		this.direccion=direccion;
	}
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero ) {
		this.genero=genero;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario=salario;
	}
	
	//Metodos abstract de pago y incentivo
	public abstract void pago();
	public abstract void incentivar();
	
}
