package somosPNT.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

	private List<Productos> listaDeProductos;

	Integer precioMasCaro;
	Integer precioMasBarato;
	String productoMasCaro;
	String productoMasBarato;

	public Supermercado() {

		listaDeProductos = new ArrayList<Productos>();

	}

	
	/* Ítem  6 */
	
	public void productosMayorMenorPrecio() {

		precioMasCaro = listaDeProductos.get(0).getPrecio();
		precioMasBarato = listaDeProductos.get(0).getPrecio();

		for (Productos e : listaDeProductos) {

			if (e.getPrecio() > precioMasCaro) {

				precioMasCaro = e.getPrecio();
				productoMasCaro = e.getNombre();
			}

			if (e.getPrecio() < precioMasBarato) {

				precioMasBarato = e.getPrecio();
				productoMasBarato = e.getNombre();

			}
		}
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

	/* Ítem 5 y 7 */
	
	@Override
	public String toString() {

		StringBuffer StringConsola = new StringBuffer("");

		for (Productos e : listaDeProductos) {

			StringConsola.append(e.toString());

		}
		return StringConsola.toString() + "\n======================\n \nProducto mas caro: " + productoMasCaro
				+ "\nProducto mas barato: " + productoMasBarato + "\n";
	}

}
