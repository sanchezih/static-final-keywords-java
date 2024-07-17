package com.github.sanchezih.finalkeyword._02_metodo_final;

/**
 * 
 * @author ihsanch
 *
 */
public class Main {

	public static void main(String[] args) {

		Persona persona1 = new Persona("Juan", 10);
		persona1.mostrarDatosPersonales();

		if (persona1.esMayorDeEdad()) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("No es mayor de edad");
		}

		System.out.println();

		Empleado empleado1 = new Empleado("Carlos", 4, 10000);
		empleado1.mostrarDatosPersonales();
		empleado1.imprimirSueldo();

		if (empleado1.esMayorDeEdad()) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("No es mayor de edad");
		}
	}

}
