package aula15.labs;

import java.util.Scanner;

public class Exer19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o 1º número: ");
		int n1 = input.nextInt();
		System.out.print("Digite o 2º número: ");
		int n2 = input.nextInt();
		
		System.out.print("Escolha a operação (+, -, *, /): ");
		String operacao = input.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch (operacao) {
			case "+":
				resultado = n1 + n2;
				break;
			case "-":
				resultado = n1 - n2;
				break;
			case "*":
				resultado = n1 * n2;
				break;
			case "/":
				resultado = n1 / n2;
				break;
			default:
				System.out.println("Operação Inválida");
				valida = false;
		}
		
		if (valida) {
			System.out.println("O resultado foi: " + resultado);
			
			if (resultado >= 0) {
				System.out.println("Resultado Positivo");
			} else {
				System.out.println("Resultado Negativo");
			}
			
			if (resultado % 2 == 0) {
				System.out.println("Resultado par");
			} else {
				System.out.println("Resultado Ímpar");
			}
		}
		input.close();
	}
}
