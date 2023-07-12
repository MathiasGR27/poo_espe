package src;

public class ofertado extends Producto {//Se extendie la clase Padre 
	//Se crea un atributo en la clase hija
	private int dias;

	//Se crea el construcutor 
    public ofertado(String nombre, double precio, int dias) {
        super(nombre, precio);
        this.dias = dias;
    }

  //Se utiliza el metodo get
    public int getDias() {
        return dias;
    }

    @Override
    public double obtenerPrecioPedido(int unidadesPedidas) { //Se implementa lo que se heredo de la clase Padre
        double precioFinal = getPrecio();
        if (dias == 1) {
            precioFinal *= 0.8; //Cuando le queda un 1 dia aplica un 20% de descuento
        } else if (dias == 2 || dias == 3) {
            precioFinal *= 0.85; //Cuando le quedan 2 o 3 dias aplica un 15% de descuento
        } else if (dias > 3) {
            precioFinal *= 0.9; //Cuando le quedan mas de 3 dias aplica un 10% de descuento
        }
        return precioFinal * unidadesPedidas; //se retorna el precio final y se multipica por las unidades que se pidio
    }
}
