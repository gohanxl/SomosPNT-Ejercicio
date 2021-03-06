package somosPNT.ejercicio;

public class Bebidas extends Productos {

	private Double litros;

	public Bebidas(String nombre, Integer precio, Double litros) {
		super(nombre, precio);

		this.litros = litros;
	}

	public Double getLitros() {
		return litros;
	}

	public void setLitros(Double litros) {
		this.litros = litros;
	}

	@Override
	public String toString() {

		return "Nombre: " + getNombre() + " /// Litros: " + litros + " /// Precio: $" + getPrecio() + "\n";
	}

}
