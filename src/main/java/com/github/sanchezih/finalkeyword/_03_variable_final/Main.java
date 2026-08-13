package com.github.sanchezih.finalkeyword._03_variable_final;

/**
 * Cuando una variable se declara con la palabra clave 'final', su valor solo
 * puede asignarse una vez.
 * 
 * Despues de inicializarla, no puede modificarse.
 */
public class Main {

	public static void main(String[] args) {

		final double PI = 3.14159;

		System.out.println("Valor de PI: " + PI);

		// PI = 3.14; // Error de compilacion
	}

}
