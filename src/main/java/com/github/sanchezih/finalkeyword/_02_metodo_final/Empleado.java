package com.github.sanchezih.finalkeyword._02_metodo_final;

/**
 * 
 * @author ihsanch
 *
 */
public class Empleado extends Persona {

	protected int sueldo;

	/*----------------------------------------------------------------------------*/

	public Empleado(String nombre, int edad, int sueldo) {
		super(nombre, edad);
		this.sueldo = sueldo;
	}

	/*----------------------------------------------------------------------------*/

	public void imprimirSueldo() {
		System.out.println("El sueldo es: " + sueldo);
	}

	/**
	 * Este metodo indica que todo empleado con edad >= 5 es mayor de edad. Esto no
	 * deberia pasar, por eso el metodo en la super clase esta declarado como final.
	 */
//	@Override
//	public boolean esMayorDeEdad() {
//		return getEdad() >= 5 ? true : false;
//	}

}