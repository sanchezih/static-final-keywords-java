package com.github.sanchezih.statickeyword._01_ejemplo_inicial;

public class Main {

	public static void main(String[] args) {

		Automovil a1 = new Automovil("Renault", "CIK882", "Blanco", 19000.0);
		Automovil a2 = new Automovil("Ford", "DBN853", "Rojo", 24000.0);

		System.out.println(a1);
		System.out.println("Precio promocional: " + a1.getPrecioPromocional());

		System.out.println(a2);
		System.out.println("Precio promocional: " + a2.getPrecioPromocional());

		Automovil.anularDescuento();
		System.out.println("\nDescuento anulado\n");

		System.out.println(a1);
		System.out.println("Precio promocional: " + a1.getPrecioPromocional());

		System.out.println(a2);
		System.out.println("Precio promocional: " + a2.getPrecioPromocional());

	}
}
