package com.github.sanchezih.finalkeyword._02_metodo_final;

public class Persona {

	private static final int LIMITE_MENOR_EDAD = 18;

	private String nombre;
	private String apellido;
	private String dni;
	private int edad;

	/*----------------------------------------------------------------------------*/

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;

	}

	public Persona(String nombre, String apellido, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	/*----------------------------------------------------------------------------*/

	public int getEdad() {
		return edad;
	}

	/**
	 * 
	 */
	public void mostrarDatosPersonales() {
		System.out.println("Nombre:" + nombre);
		System.out.println("Edad:" + edad);
	}

	/**
	 * En Java podemos impedir que un metodo sea sobrescrito por las subclases
	 * mediante la palabra clave 'final', colocandola antes del tipo de dato que
	 * devuelve el metodo.
	 * 
	 * Un metodo declarado como 'final' puede ser heredado por las subclases, pero
	 * estas no pueden sobrescribirlo.
	 */
	public final boolean esMayorDeEdad() {
		return edad >= LIMITE_MENOR_EDAD;
	}

}
