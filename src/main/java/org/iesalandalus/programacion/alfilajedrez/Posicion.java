package org.iesalandalus.programacion.alfilajedrez;

import java.util.Objects;

public class Posicion {

	private int fila;
	private char columna; 
	
	public Posicion(int fila, char columna) {
		setFila(fila);
		setColumna(columna);
	}
	
	
	public int getFila() {
		return fila;
	}

	private void setFila(int fila) {
		if (fila < 1 || fila > 8) {
			throw new IllegalArgumentException("ERROR: Fila no válida.");
		}
		this.fila = fila;
	}

	public char getColumna() {
		return columna;
	}

	private void setColumna(char columna) {
		if (columna < 'a' || columna > 'h') {
			throw new IllegalArgumentException("ERROR: Columna no válida.");
		}
		this.columna = columna;

	}
	public Posicion(Posicion posicion){
		if (posicion == null) {
			throw new NullPointerException("ERROR: No es posible copiar una posición nula.");
		}
		fila = posicion.getFila();
		columna = posicion.getColumna();
}
	public int hashCode() {
		return Objects.hash(fila, columna);
	}
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Posicion)) {
			return false;
		}
		Posicion other = (Posicion) obj;
		return fila == other.fila && columna == other.columna;
	}
	
	public String toString() {
		return String.format("fila=%s, columna=%s", fila, columna);
	}
}