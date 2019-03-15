package somosPNT.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

	private List<Productos> listaDeProductos;
	private String productoMasCaro;
	private String productoMasBarato;

	public Supermercado() {

		listaDeProductos = new ArrayList<Productos>();
		
	}

	
	/* Ítem 4 */

	public void agregarProducto(Productos producto) {

		listaDeProductos.add(producto);

	}

	public List<Productos> getProductos() {
		return listaDeProductos;
	}

	public void setProductos(List<Productos> productos) {
		listaDeProductos = productos;
	}

	public String getProductoMasCaro() {
		return productoMasCaro;
	}

	public void setProductoMasCaro(String productoMasCaro) {
		this.productoMasCaro = productoMasCaro;
	}

	public String getProductoMasBarato() {
		return productoMasBarato;
	}

	public void setProductoMasBarato(String productoMasBarato) {
		this.productoMasBarato = productoMasBarato;
	}

	
	/* Ítem 5 y 7 */

	@Override
	public String toString() {

		final StringBuffer StringConsola = new StringBuffer("");

		for (Productos e : listaDeProductos) {

			StringConsola.append(e.toString());

		}
		return StringConsola.toString() + "\n======================\n";
	}

}
