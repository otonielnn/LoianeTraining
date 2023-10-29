package com.otoniel.cursoJava.aula13.labs;

import java.util.Scanner;

public class Exer14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite quantos Kg de peixe pescou: ");
		int peso = input.nextInt();
		int excesso = 0;
		int multa = 0;
		if (peso > 50) {
			excesso = peso - 50;
			multa = excesso * 4;
			System.out.println("A Multa é de R$" + multa);
		} else {
			System.out.println("Dentro do peso limite");
		}
	}
}
