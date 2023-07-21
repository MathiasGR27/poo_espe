package src;

public class Limpieza extends Personal{
	//Atributo
	String calidad;

	//Constructor de la clase Docente
	public Limpieza(String nombre, int edad, String direccion, String genero, double salario,String calidad) {
		super(nombre, edad, direccion, genero, salario);
		this.calidad=calidad;
	}
	
	//Metodos getter y setter
	public String getCalidad() {
		return calidad;
	}

	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}

	//Metodo abstracto pago heredado de la clase padre
	@Override
	public void pago() {
		System.out.println("Su pago es el siguiente : "+ getSalario());
		}
	
	//Metodo abstracto incentivar heredado de la clase padre
	@Override
	public void incentivar() {
		double preciol=getSalario();
		preciol *= 0.09; 
		double preciofinall = getSalario()+preciol;
		System.out.println("Por Mantener el area de trabajo de calidad :"+this.calidad);
		System.out.println("Su incentivo es de      : "+ preciol);
		System.out.println("Su salario entonces sera igual a : "+ preciofinall);
		
	}
	

}
