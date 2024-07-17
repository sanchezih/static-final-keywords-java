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
	 * Este metodo indica que todo empleado es mayor de edad, independientemente de
	 * su edad (Lo cual no deberia pasar).
	 */
//	@Override
//	public boolean esMayorDeEdad() {
//		return true;
//	}

}