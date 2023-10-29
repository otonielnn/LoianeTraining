package com.otoniel.cursoJava.aula33.labs;

public class Lampada {
	private boolean ligada;
	
	public boolean Ligada() {
		return this.ligada;
	}
	
	public String ligar() {
		if (this.ligada == true) {
			return "A Lampada já está ligada";
		} else {
			this.ligada = true;
			return "A Lampada foi ligada";
		}
	}
	
	public String desligar() {
		if (this.ligada == false) {
			return "A Lampada já está desligada";
		} else {
			this.ligada = false;
			return "A Lampada foi desligada";
		}
	}
}
