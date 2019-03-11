package somosPNT.ejercicio;

public class Productos implements Comparable<Productos> {

	String nombre;
	String unidadDeVenta;
	Double litros;
	Integer precio;
	String contenido;

	public Productos(String nombre, Integer precio) {

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

	public String getUnidadDeVenta() {
		return unidadDeVenta;
	}

	public void setUnidadDeVenta(String unidadDeVenta) {
		this.unidadDeVenta = unidadDeVenta;
	}

	public Double getLitros() {
		return litros;
	}

	public void setLitros(Double litros) {
		this.litros = litros;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	/* Ítem 7 */

	@Override
	public int compareTo(Productos o) {

		return this.precio.compareTo(o.getPrecio());
	}

}
