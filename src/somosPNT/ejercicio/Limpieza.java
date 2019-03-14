package somosPNT.ejercicio;

public class Limpieza extends Productos {

	private String contenido;

	public Limpieza(String nombre, String contenido, Integer precio) {
		super(nombre, precio);

		this.contenido = contenido;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {

		return "Nombre: " + getNombre() + " /// Contenido: " + contenido + " /// Precio: $" + getPrecio() + "\n";

	}

}
