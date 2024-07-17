package com.github.sanchezih.finalkeyword._02_metodo_final;

public class Persona {

	private static final int LIMITE_MENOR_EDAD = 18;

	private String nombre;
	private String apellido;
	private String dni;
	private int edad;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param nombre
	 * @param edad
	 */
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;

	}

	/**
	 * 
	 * @param nombre
	 * @param apellido
	 * @param dni
	 */
	public Persona(String nombre, String apellido, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	/*----------------------------------------------------------------------------*/

	public String getNombre() {
		return nombre;
	}

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
	 * En Java podemos sellar un metodo para que las subclases no puedan
	 * sobreescribirlo, para ello debemos agregar la palabra clave final previo al
	 * tipo de dato que devuelve.
	 * 
	 * @return
	 */
	public final boolean esMayorDeEdad() {
		return edad >= LIMITE_MENOR_EDAD ? true : false;
	}

}