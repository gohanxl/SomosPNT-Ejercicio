package somosPNT.ejercicio.tests;

import java.util.Collections;

import org.junit.Before;
import org.junit.Test;

import somosPNT.ejercicio.Bebidas;
import somosPNT.ejercicio.Comidas;
import somosPNT.ejercicio.Limpieza;
import somosPNT.ejercicio.Supermercado;

public class TestSupermercado {

	private Supermercado supermercado1;
	private Bebidas producto1;
	private Bebidas producto2;
	private Limpieza producto3;
	private Comidas producto4;

	@Before

	public void inicializacion() {

		supermercado1 = new Supermercado();

		producto1 = new Bebidas("Coca-Cola Zero", 20, 1.5);
		producto2 = new Bebidas("Coca-Cola", 18, 1.5);
		producto3 = new Limpieza("Shampoo Sedal", "500ml", 19);
		producto4 = new Comidas("Frutillas", "kilo", 64);

	}

	@Test

	public void primerTest() {

		supermercado1.agregarProducto(producto1);
		supermercado1.agregarProducto(producto2);
		supermercado1.agregarProducto(producto3);
		supermercado1.agregarProducto(producto4);

		supermercado1.productosMayorMenorPrecio();

		System.out.println(supermercado1);

		/* Ordeno lista para mostrar el funcionamiento del Comparable*/
		
		Collections.sort(supermercado1.getProductos());
		Collections.reverse(supermercado1.getProductos());

		System.out.println("/~~~~~~~~~~~~~~~~~~~~~~/\n\nLISTA ORDENADA CON COMPARABLE \n\n" + supermercado1);
	}

}
