package somosPNT.ejercicio;

public class Productos extends Supermercado implements Comparable<Productos> {

	private String nombre;
	private Integer precio;

	public Productos(String nombre, Integer precio) {
		super();

		this.nombre = nombre;
		this.precio = precio;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	/* Ítem 7 */

	@Override
	public int compareTo(Productos o) {

		int resultado = 0;

		if (this.precio < o.getPrecio()) {

			resultado = -1;

		} else if (this.precio > o.getPrecio()) {

			resultado = 1;

		}

		return resultado;
	}

}
