package EvaGualpaMathisa;

import java.util.Scanner;

public class Menu {
	
	private Scanner scanner;
	public static void main(String[] args) {
		
		String[] materia =new String[5];
		Datos gnotas=new Datos();
		int op;
		Scanner sc=new Scanner(System.in);
		String nombrep,nombrea,materia1,materia2,materia3,materia4;
		String cedulap,cedulaa;
		String celularp,celulara;
		String direccionp,direcciona;
		double notas;
		
		do {
			System.out.println("1. Profesor");
			System.out.println("2. Alumno");
			System.out.println("3. Materias");
			System.out.println("4. Gestion Matriculas");
			System.out.println("5. Total Matriculados");
			System.out.println("6. Salir");
		op=Integer.parseInt(sc.nextLine());
		
		switch(op) {
		case 1:
			System.out.println("Ingreso de profesores");
			System.out.println("Ingrese el nombre");
			nombrep=sc.nextLine();
			System.out.println("Ingrese la cedula");
			cedulap=sc.nextLine();
			System.out.println("Ingrese el numero celular");
			celularp=sc.nextLine();
			System.out.println("Ingrese la direccion");
			direccionp=sc.nextLine();
			break;
		case 2:
			System.out.println("Ingreso de Alumnos");
			System.out.println("Ingrese el nombre");
			nombrea=sc.nextLine();
			System.out.println("Ingrese la cedula");
			cedulaa=sc.nextLine();
			System.out.println("Ingrese el numero celular");
			celulara=sc.nextLine();
			System.out.println("Ingrese la direccion");
			direcciona=sc.nextLine();
			break;
		case 3:
			System.out.println("Ingreso de Materia");
			System.out.println("Ingrese materia 1");
			materia1=sc.nextLine();
			System.out.println("Ingrese materia 2");
			materia2=sc.nextLine();
			System.out.println("Ingrese materia 3");
			materia3=sc.nextLine();
			System.out.println("Ingrese materia 4");
			materia4=sc.nextLine();

			break;
		case 4:
		
			break;
			
		case 5:
		
			break;
		case 6:
				System.out.println("Saliendo");
				break;
				default:
					System.out.println("Opcion no valida");	
				break;
		}
}while(op!=6);
}

}

