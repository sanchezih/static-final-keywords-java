package com.github.sanchezih.statickeyword._02_contador_de_tickets;

public class Ticket {

	// Al declarar la variable como static, el valor de contador sera compartido por
	// todas las instancias de la clase. Si no fuese static, en cada llamada al
	// constructor este valor seria 0, por lo tanto, cada ticket tendria numero 1.
	private int contador = 0;

	private int numero;
	private String fechaDeCompra;
	private String dniDeComprador;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param fechaDeCompra
	 * @param dniDeComprador
	 */
	public Ticket(String fechaDeCompra, String dniDeComprador) {

		contador++;

		this.numero = contador;
		this.fechaDeCompra = fechaDeCompra;
		this.dniDeComprador = dniDeComprador;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public String toString() {
		return "Ticket [numero=" + numero + ", fechaDeCompra=" + fechaDeCompra + ", dniDeComprador=" + dniDeComprador
				+ "]";
	}

}
