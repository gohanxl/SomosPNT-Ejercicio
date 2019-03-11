package somosPNT.ejercicio;

public class Comidas extends Productos {

	String unidadDeVenta;

	public Comidas(String nombre, String unidadDeVenta, Integer precio) {
		super(nombre, precio);

		this.unidadDeVenta = unidadDeVenta;

	}

	public String getUnidadDeVenta() {
		return unidadDeVenta;
	}

	public void setUnidadDeVenta(String unidadDeVenta) {
		this.unidadDeVenta = unidadDeVenta;
	}

	@Override
	public String toString() {

		return "Nombre: " + nombre + " /// Precio: $" + precio + " /// Unidad de Venta: " + unidadDeVenta + "\n";
	}

}
