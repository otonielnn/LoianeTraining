package com.otoniel.cursoJava.aula13.labs;

import java.util.Scanner;

public class Exer11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		int n1 = input.nextInt();
		System.out.print("Digite outro número inteiro: ");
		int n2 = input.nextInt();
		System.out.print("Digite um número decimal: ");
		double n3 = input.nextDouble();
		System.out.println((n1 * 2) * (n2 / 2));
		System.out.println((n1 * 3) + n3);
		System.out.println(Math.pow(n3, 3));
	}
}
