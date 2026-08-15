package com.github.sanchezih.finalkeyword._01_clase_final;

/**
 * En Java podemos impedir que una clase sea heredada por otras clases mediante
 * la palabra clave 'final', colocandola antes de la declaracion de la clase:
 * 
 * public final class [Nombre de la clase] { }
 * 
 * En algunas situaciones, cuando consideramos que no tiene sentido permitir que
 * otras clases hereden de la clase que estamos creando, podemos declararla como
 * 'final'.
 * 
 * Si luego otra clase intenta heredar de una clase declarada como 'final', se
 * genera un error de compilacion.
 * 
 * Esta clase representa un punto en el plano.
 * 
 * @author ihsanch
 *
 */
public final class Punto {

	private int x;
	private int y;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param x
	 * @param y
	 */
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Muestra por consola en que cuadrante se encuenta el punto
	 */
	public void mostrarCuadrante() {

		System.out.print("[" + x + "," + y + "] ");

		if (x > 0 && y > 0)
			System.out.println("Se encuentra en el primer cuadrante.");
		else if (x < 0 && y > 0)
			System.out.println("Se encuentra en el segundo cuadrante.");
		else if (x < 0 && y < 0)
			System.out.println("Se encuentra en el tercer cuadrante.");
		else if (x > 0 && y < 0)
			System.out.println("Se encuentra en el cuarto cuadrante.");
		else
			System.out.println("El punto no esta en un cuadrante.");
	}
}
