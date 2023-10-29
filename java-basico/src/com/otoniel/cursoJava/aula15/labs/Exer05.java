package com.otoniel.cursoJava.aula15.labs;

import java.util.Scanner;

public class Exer05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite a 1º nota: ");
		double n1 = input.nextDouble();
		System.out.print("Digite a 2º nota: ");
		double n2 = input.nextDouble();
		double media = (n1 + n2) / 2;
		
		if (media == 10) {
			System.out.println("Aprovado com Distinção");
		} else if (media >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
	}
}
