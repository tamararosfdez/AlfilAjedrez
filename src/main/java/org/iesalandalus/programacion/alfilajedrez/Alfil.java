package org.iesalandalus.programacion.alfilajedrez;

public class Alfil {

	private Color color;
	private Posicion posicion;
	
	
	
	public Alfil(Color color, Posicion posicion) {
		super();
		this.color = color;
		this.posicion = posicion;
	}


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}


	public Posicion getPosicion() {
		return posicion;
	}


	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
	
}
