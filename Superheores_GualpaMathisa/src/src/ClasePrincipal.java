package src;

import java.util.Scanner;

public class ClasePrincipal {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

	System.out.println("Ingrese el nombre del superheroe");
	String nombreI = scanner.nextLine();	
	System.out.println("Ingrese la energia del superheroe");
	int cantidadenergiaI = scanner.nextInt();
	System.out.println("Ingrese el genero del superheroe");
	String geneoI = scanner.nextLine();	
	scanner.nextLine();
	System.out.println("Ingrese de que esta hecho el traje del superheroe");
	String trajeI = scanner.nextLine();
	
	IroMan iro = new  IroMan(nombreI,cantidadenergiaI,geneoI,trajeI);
	iro.niveldefuerza();
	
	System.out.println("------------------------------------------------------------");
	
	System.out.println("Ingrese el nombre del superheroe");
	String nombreS = scanner.nextLine();	
	System.out.println("Ingrese la energia del superheroe");
	int cantidadenergiaS = scanner.nextInt();
	System.out.println("Ingrese el genero del superheroe");
	String geneoS = scanner.nextLine();
	scanner.nextLine();
	System.out.println("Ingrese el super poder del superheroe");
	String habilidadS = scanner.nextLine();
	
	Spiderman spider = new  Spiderman(nombreS,cantidadenergiaS,geneoS,habilidadS);
	spider.niveldefuerza();
	
	System.out.println("------------------------------------------------------------");
	
	System.out.println("Ingrese el nombre del superheroe");
	String nombreH = scanner.nextLine();	
	System.out.println("Ingrese la energia del superheroe");
	int cantidadenergiaH = scanner.nextInt();
	System.out.println("Ingrese el genero del superheroe");
	String geneoH = scanner.nextLine();	
	scanner.nextLine();
	System.out.println("Ingrese el aspecto del superheroe");
	String aspectoH= scanner.nextLine();
	
	Hulk hulk = new  Hulk(nombreH,cantidadenergiaH,geneoH,aspectoH);
	hulk.niveldefuerza();
	}

}
