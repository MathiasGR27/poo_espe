package src;

import java.util.Scanner;

public class Eva_GualpaMathias {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Menu de opciones 
		int opc=0;
		while(opc !=5){
		System.out.println("-------     Menu de opciones    -----------");
		System.out.println("-------1. Calcular pago Docente -----------");
		System.out.println("-------2. Calcular pago Tecnico -----------");
		System.out.println("-------3. Calcular pago Administrativo ----");
		System.out.println("-------4. Calcular pago Limpieza ----------");
		System.out.println("-------5. Salir                  ----------");
		System.out.println("--------------------------------------------");
		System.out.println("------- Ingrese la opcion a realizar    ---");
		opc=scanner.nextInt();
		System.out.println("--------------------------------------------");
		switch (opc) {
		case 1:
			  InfoDocente (scanner);
			break;
		case 2:
			  InfoTecnico (scanner);
			break;
		case 3 :
			  InfoAdmi (scanner);
			break;
		case 4 : 
			  InfoLimpieza(scanner);
			break;
		case 5 :
			System.out.println("------- Fin del programa -----------");
			break;
		default:
				System.out.println("-------Opcion no valida -----------");
			break;
		}
	  }	
    }
	//metodo estatico para la informacion de docentes
	public static void InfoDocente (Scanner scanner) {
		System.out.println("-------        Info Docente         -----------");
		System.out.println("-------     Ingrese su nombre       -----------");
		String nombre=scanner.nextLine();
		scanner.nextLine();
		System.out.println("-------     Ingrese su edad         -----------");
		int edad=scanner.nextInt();
		scanner.nextLine();
		System.out.println("-------     Ingrese su Direccion    -----------");
		String direccion=scanner.nextLine();
		System.out.println("-------     Ingrese su Genero       -----------");
		String genero=scanner.nextLine(); 
		System.out.println("-------     Ingrese su Salario     -----------");
		double salario=scanner.nextDouble();
		scanner.nextLine();
		System.out.println("-------     Ingrese su Materia Encargada    ---");
		String materiaencargada=scanner.nextLine(); 
		
		Docente doce = new Docente(nombre,edad,direccion,genero,salario,materiaencargada);
		doce.pago();
		doce.incentivar();
	}

	//metodo estatico para la informacion de tecnicos
		public static void InfoTecnico (Scanner scanner) {
			System.out.println("-------        Info Tecnico         -----------");
			System.out.println("-------     Ingrese su nombre       -----------");
			String nombret=scanner.nextLine();
			scanner.nextLine();
			System.out.println("-------     Ingrese su edad         -----------");
			int edadt=scanner.nextInt();
			scanner.nextLine();
			System.out.println("-------     Ingrese su Direccion    -----------");
			String direcciont=scanner.nextLine();
			System.out.println("-------     Ingrese su Genero       -----------");
			String generot=scanner.nextLine(); 
			System.out.println("-------     Ingrese su Salario   -----------");
			double salariot=scanner.nextDouble();
			System.out.println("-------     Ingrese su especialidad   ---");
			String especialidad=scanner.nextLine(); 
			scanner.nextLine();

			Tecnico tec = new Tecnico(nombret,edadt,direcciont,generot,salariot,especialidad);
			tec.pago();
			tec.incentivar();
		}	
		//metodo estatico para la informacion de admi
			public static void InfoAdmi (Scanner scanner) {
				System.out.println("-------        Info Admi            -----------");
				System.out.println("-------     Ingrese su nombre       -----------");
				String nombreA=scanner.nextLine();
				scanner.nextLine();
				System.out.println("-------     Ingrese su edad         -----------");
				int edadA=scanner.nextInt();
				scanner.nextLine();
				System.out.println("-------     Ingrese su Direccion    -----------");
				String direccionA=scanner.nextLine();
				System.out.println("-------     Ingrese su Genero       -----------");
				String generoA=scanner.nextLine(); 
				System.out.println("-------     Ingrese su Salario    -----------");
				double salarioA=scanner.nextDouble();
				System.out.println("-------     Ingrese su hora de ingreso      ---");
				int horaingreso=scanner.nextInt(); 
				
				Administrativo Admi = new Administrativo(nombreA,edadA,direccionA,generoA,salarioA,horaingreso);
				Admi.pago();
				Admi.incentivar();
			}
			
			//metodo estatico para la informacion de limpieza
		    public static void InfoLimpieza (Scanner scanner) {
					System.out.println("-------        Info Limpieza        -----------");
					System.out.println("-------     Ingrese su nombre       -----------");
					String nombreL=scanner.nextLine();
					scanner.nextLine();
					System.out.println("-------     Ingrese su edad         -----------");
					int edadL=scanner.nextInt();
					scanner.nextLine();
					System.out.println("-------     Ingrese su Direccion    -----------");
					String direccionL=scanner.nextLine();
					System.out.println("-------     Ingrese su Genero       -----------");
					String generoL=scanner.nextLine(); 
					System.out.println("-------     Ingrese su Salario      -----------");
					double salarioL=scanner.nextDouble();
					System.out.println("-------     Ingrese la calidada de limpieza ---");
					String calidad=scanner.nextLine(); 
					scanner.nextLine();
					
					Limpieza lim = new Limpieza(nombreL,edadL,direccionL,generoL,salarioL,calidad);
					lim.pago();
					lim.incentivar();
					
	}
}
