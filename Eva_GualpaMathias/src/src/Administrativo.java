package src;

public class Administrativo extends Personal {
	//Atributo
	int horaingreso;

	//Constructor de la clase Docente
	Administrativo(String nombre, int edad, String direccion, String genero, double salario,int horaingreso) {
		super(nombre, edad, direccion, genero, salario);
		this.horaingreso=horaingreso;
	}
	//Metodos getter y setter
	public int getHoraingreso() {
		return horaingreso;
	}

	public void setHoraingreso(int horaingreso) {
		this.horaingreso = horaingreso;
	}

	@Override
	public void pago() {
		System.out.println("Su pago es el siguiente : "+ getSalario());
		}
	
	//Metodo abstracto incentivar heredado de la clase padre
	@Override
	public void incentivar() {
		double precioa=getSalario();
		if(this.horaingreso<=7 ) {	
			precioa *= 0.12; 
			double preciofinala = getSalario()+precioa;
			System.out.println("Por llegar temprano ");
			System.out.println("Su incentivo es de      : "+ precioa);
			System.out.println("Su salario entonces sera igual a : "+ preciofinala);
		}else {
			System.out.println("Su salario se matendra igual: "+ getSalario());
		}
	}	
	}

