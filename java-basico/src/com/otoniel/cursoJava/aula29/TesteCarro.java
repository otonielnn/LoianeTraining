package com.otoniel.cursoJava.aula29;

public class TesteCarro {
	public static void main(String[] args) {
		Carro van = new Carro("Fiat", "Ducato", 10, 100, 0.2);
		/*van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel 0.2;*/
		van.exibirAutonomia();
	}
}
