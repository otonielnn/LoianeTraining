package aula29;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	
	
	Carro(String marca, String modelo, int passageiros, double combustivel, double consumo) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = passageiros;
		this.capCombustivel = combustivel;
		this.consumoCombustivel = consumo;
		System.out.println("O Carro foi criado.");
	}
	
	void exibirAutonomia() {
	    System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
	}
	
	double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado.");
		return capCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel(double km){
		
		double qtdCombustivel = km/consumoCombustivel;
		
		return qtdCombustivel;
	}
}
