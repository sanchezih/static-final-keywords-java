package com.github.sanchezih.finalkeyword._02_metodo_final;

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
	 * Si esMayorDeEdad() no fuera final, una subclase podria sobrescribirlo y
	 * modificar su comportamiento.
	 * 
	 * En este caso, por ejemplo, estamos intentando indicar que un empleado con
	 * edad >= 5 es mayor de edad. Esto demuestra por que queremos impedir que las
	 * subclases sobrescriban este metodo.
	 */
//	@Override
//	public boolean esMayorDeEdad() {
//		return getEdad() >= 5;
//	}

}
