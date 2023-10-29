package com.otoniel.cursoJava.aula15.labs;

import java.util.Scanner;

public class Exer18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int n = input.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Ímpar");
		}
	}
}
