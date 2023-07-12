package src;

public class Lab3U2_GualpaMathias {
	
	public static void main(String[] args) {
		//Se crea estancia de la clase estandar
		Producto producto1 = new estandar("Producto estándar 1", 5.0,  "Sección A");
        Producto producto2 = new estandar("Producto estándar 2", 11.0, "Sección B");

      //Se crea estancia de la clase ofertado
        Producto producto3 = new ofertado("Producto ofertado 1", 27.0, 2);
        Producto producto4 = new ofertado("Producto ofertado 2", 18.0, 2);
        Producto producto5 = new ofertado("Producto ofertado 3", 15.0, 4);

        int unidadesPedidas = 5;//Son el total de unidades a pedir

        double totalPedido = producto1.obtenerPrecioPedido(unidadesPedidas) +
                             producto2.obtenerPrecioPedido(unidadesPedidas) +
                             producto3.obtenerPrecioPedido(unidadesPedidas) +
                             producto4.obtenerPrecioPedido(unidadesPedidas) +
                             producto5.obtenerPrecioPedido(unidadesPedidas);

        System.out.println("Total del pedido: $" + totalPedido); //Se arroga el precio final
	}                                                            //el total de pedidos de los 5 productos 

}
