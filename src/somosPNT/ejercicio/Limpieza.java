package somosPNT.ejercicio;

public class Limpieza extends Productos {

	String contenido;

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

		return "Nombre: " + nombre + " /// Contenido: " + contenido + " /// Precio: $" + precio + "\n";

	}

}
