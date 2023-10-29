package com.otoniel.cursoJava.aula13.labs;

import java.util.Scanner;

public class Exer04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite a 1º nota: ");
		double n1 = input.nextDouble();
		System.out.print("Digite a 2º nota: ");
		double n2 = input.nextDouble();
		System.out.print("Digite a 3º nota: ");
		double n3 = input.nextDouble();
		System.out.print("Digite a 4º nota: ");
		double n4 = input.nextDouble();
		double media = (n1 + n2 + n3 + n4) / 4;
		System.out.println("A média das notas é: " + media);
	}
}
