package com.otoniel.cursoJava.aula15.labs;

import java.util.Scanner;

public class Exer02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int n = input.nextInt();
		
		if (n < 0 ) {
			System.out.println("O número é negativo");
		} else {
			System.out.println("O número é positivo");
		}
	}
}
