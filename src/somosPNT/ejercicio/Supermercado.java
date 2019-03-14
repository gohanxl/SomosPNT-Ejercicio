package somosPNT.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

	private List<Productos> listaDeProductos;

	private Integer precioMasCaro;
	private Integer precioMasBarato;
	private String productoMasCaro;
	private String productoMasBarato;

	public Supermercado() {

		listaDeProductos = new ArrayList<Productos>();

	}

	/* Ítem 6 */

	public void productosMayorMenorPrecio() {

		precioMasCaro = 0;
		precioMasBarato = 9999999;

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

		final StringBuffer StringConsola = new StringBuffer("");

		for (Productos e : listaDeProductos) {

			StringConsola.append(e.toString());

		}
		return StringConsola.toString() + "\n======================\n \nProducto mas caro: " + productoMasCaro
				+ "\nProducto mas barato: " + productoMasBarato + "\n";
	}

}
