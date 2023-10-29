package com.otoniel.cursoJava.aula32;

public class TesteCarro {
	public static void main(String[] args) {
		
		Carro van = new Carro();
		
		van.setMarca("Fiat");
		van.setModelo("Ducato");
		van.setNumPassageiros(10);
		
		System.out.println("Marca: " + van.getMarca());
		System.out.println("Modelo: " + van.getModelo());
		System.out.println("Número de Passageiros: " + van.getNumPassageiros());
	}
}
