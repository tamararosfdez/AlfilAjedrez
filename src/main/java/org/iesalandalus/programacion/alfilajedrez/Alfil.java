package org.iesalandalus.programacion.alfilajedrez;

import java.util.Objects;

public class Alfil {

	private Color color;
	private Posicion posicion;
	
	public Alfil () {}
	
	public Alfil(Color color) {
		this.color = color;
	}
	
	public Alfil (Color color, Posicion posicion) {
		this.color = color;
		this.posicion = posicion;
	}

	

	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		if (color == null) {
			throw new NullPointerException("ERROR: No se puede asignar un color nulo.");
		}
		this.color = color;
	}


	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
	
	public Alfil (Color color, char columnaInicial) {
		setColor(color);
		if (columnaInicial != 'c' || columnaInicial != 'f') {
			throw new IllegalArgumentException("ERROR: Columna no válida.");
		}
		if (color == Color.NEGRO) {
			posicion = new Posicion (8, columnaInicial);
		}
		else if (color == Color.BLANCO) {
			posicion = new Posicion (1, columnaInicial);
		}
	}

	public int hashCode() {
		return Objects.hash(color, posicion);
	}


	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Alfil)) {
			return false;
		}
		Alfil other = (Alfil) obj;
		return color == other.color && posicion == other.posicion;

	}
	
	public String toString() {
		return String.format("color=%s, posicion=%s", color, posicion);
	}
	
}
 