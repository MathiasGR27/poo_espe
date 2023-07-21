package src;

public class Tecnico extends Personal{
	//Atributo
	private String especialidad;
	
	//Constructor de la clase Docente
	Tecnico(String nombre, int edad, String direccion, String genero, double salario,String especialidad) {
		super(nombre, edad, direccion, genero, salario);
		this.especialidad=especialidad;
	}
	//Metodos getter y setter
	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	//Metodo abstracto pago heredado de la clase padre
	@Override
	public void pago() {
		System.out.println("Su pago es el siguiente : "+ getSalario());
		}
	//Metodo abstracto incentivar heredado de la clase padre
	@Override
	public void incentivar() {
		double preciot=getSalario();
		preciot *= 0.15; 
		double preciofinalt = getSalario()+preciot;
		System.out.println("Por desempeñar como buen tecnico");
		System.out.println("Su incentivo es de      : "+ preciot);
		System.out.println("Su salario entonces sera igual a : "+ preciofinalt);
	}
	
}
