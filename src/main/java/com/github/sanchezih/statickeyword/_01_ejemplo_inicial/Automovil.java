package com.github.sanchezih.statickeyword._01_ejemplo_inicial;

public class Automovil {

	private String marca;
	private String patente;
	private String color;
	private double precio;
	private static double descuento = 10; // Variable de clase

	/*----------------------------------------------------------------------------*/

	public Automovil() {

	}

	public Automovil(String marca, String patente, String color, double precio) {
		this.marca = marca;
		this.patente = patente;
		this.color = color;
		this.precio = precio;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Desde un metodo de instancia se puede acceder tanto a variables de instancia
	 * como a variables de clase (static).
	 * 
	 * En cambio, desde un metodo static no se puede acceder directamente a
	 * variables ni a metodos de instancia, ya que estos pertenecen a un objeto
	 * especifico.
	 * 
	 * @return
	 */
	public double getPrecioPromocional() {
		return this.precio - (this.precio * Automovil.descuento / 100);
	}

	/**
	 * Metodo estatico que pertenece a la clase y no a una instancia particular.
	 * 
	 * Desde un metodo static no se puede acceder directamente a variables ni a
	 * metodos de instancia, ya que estos pertenecen a un objeto especifico.
	 * 
	 * Los metodos static se pueden invocar utilizando el nombre de la clase:
	 * 
	 * Automovil.anularDescuento();
	 */
	public static void anularDescuento() {
		Automovil.descuento = 0;
	}

	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", patente=" + patente + ", color=" + color + ", precio=" + precio + "]";
	}

}