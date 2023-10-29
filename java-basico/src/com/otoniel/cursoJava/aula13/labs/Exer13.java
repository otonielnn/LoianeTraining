package com.otoniel.cursoJava.aula13.labs;

import java.util.Scanner;

public class Exer13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Qual seu Sexo: ");
		String sexo = input.next();

		System.out.print("Digite sua altura: ");
		double altura = input.nextDouble();

		System.out.print("Digite seu peso: ");
		double peso = input.nextDouble();

		double pesoIdeal = 0;
		if (sexo.equalsIgnoreCase("M")) {
			pesoIdeal = (72.7 * altura) - 58;
		} else if (sexo.equalsIgnoreCase("F")) {
			pesoIdeal = (62.1 * altura) - 44.7;
		}
		
		System.out.println("Seu peso ideal seria: " + pesoIdeal + " Kg.");

		if (peso == pesoIdeal) {
			System.out.println("Dentro do peso ideal.");
		} else if (peso > pesoIdeal) {
			System.out.println("Acima do peso ideal.");
		} else if (peso < pesoIdeal) {
			System.out.println("Abaixo do peso ideal.");
		}
	}
}
