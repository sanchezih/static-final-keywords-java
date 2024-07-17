package com.github.sanchezih.finalkeyword._03_variable_final;

/**
 * Cuando una variable se declara con la palabra clave final, su valor no se
 * puede modificar, esencialmente, es una constante. Esto tambien significa que
 * debe inicializar una variable final.
 * 
 * @author ihsanch
 *
 */
public class Main {

	public static void main(String[] args) {

		final double PI = 3.14159;

		System.out.println("Valor de PI: " + PI);
	}
}