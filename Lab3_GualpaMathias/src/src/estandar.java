package src;

public class estandar extends Producto{ //Se extendie la clase Padre 
    //Se crea un atributo en la clase hija
	private String seccion;

	//Se crea el construcutor 
	public estandar(String nombre, double precio,String seccion) {
		super(nombre, precio);
		this.seccion=seccion;
	}
	
	//Se utiliza el metodo get
	public String getSección() {
	        return seccion;
	    }

	@Override
	public double obtenerPrecioPedido(int unidadesPedidas) { //Sw implementa lo que se heredo de la clase Padre
		double precioFinal = unidadesPedidas * getPrecio();
        if (unidadesPedidas >= 5) {//Si se pide 5 o mas unidades se
            precioFinal *= 0.9; // Aplica un 10% de descuento
        }
        return precioFinal; //retorna el precio final
    }
}


