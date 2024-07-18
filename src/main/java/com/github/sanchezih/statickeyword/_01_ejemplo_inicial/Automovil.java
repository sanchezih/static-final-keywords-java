package com.github.sanchezih.statickeyword._01_ejemplo_inicial;

public class Automovil {

	private String marca;
	private String patente;
	private String color;
	private double precio;
	private static double descuento; // Variable de clase

	/*----------------------------------------------------------------------------*/
	/**
	 * 
	 */
	public Automovil() {

	}

	/**
	 * 
	 * @param marca
	 * @param patente
	 * @param color
	 * @param precio
	 */
	public Automovil(String marca, String patente, String color, double precio) {
		this.marca = marca;
		this.patente = patente;
		this.color = color;
		this.precio = precio;
		Automovil.descuento = 10; // De esta manera se referencia a una variable de clase, no con this
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Desde un metodo de instancia, puedo trabajar con una variable de clase. Lo
	 * contrario no puede hacerse.
	 * 
	 * @return
	 */
	public double getPrecioPromocional() {
		return this.precio - (this.precio * Automovil.descuento / 100);
	}

	/**
	 * Metodo estatico que le pertenece a la clase. En un metodo estatico no se
	 * puede acceder ni variables de instancia (this.xxx) ni a metodos de instancia.
	 * 
	 * Se accede a traves de la clase: Automovil.anularDescuento();
	 */
	public static void anularDescuento() {
		Automovil.descuento = 0;
	}

	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", patente=" + patente + ", color=" + color + ", precio=" + precio + "]";
	}

}
