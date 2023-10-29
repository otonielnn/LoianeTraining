package com.otoniel.cursoJava.aula15.labs;

import java.util.Scanner;

public class Exer17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um ano: ");
		int ano = input.nextInt();
		
		if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println("É Bissexto");
		} else {
			System.out.println("Não é Bissexto");
		}
	}
}
