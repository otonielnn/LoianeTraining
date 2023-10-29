package com.otoniel.cursoJava.aula15.labs;

import java.util.Scanner;

public class Exer16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o valor de A: ");
		int a = input.nextInt();
		if (a == 0) {
			System.out.println("Não uma Equação do 2º Grau");
		} else {
			System.out.print("Digite o valor de B: ");
			int b = input.nextInt();
			System.out.print("Digite o valor de C: ");
			int c = input.nextInt();
			
			double delta = (b * b) - (4 * a * c);
			
			if (delta < 0) {
				System.out.println("A Equação não possui raízes reais.");
			} else {
				
				System.out.println("Delta: " + delta);
				
				double x1 = ((-b) + Math.sqrt(delta) / (2 *a));
				double x2 = ((-b) - Math.sqrt(delta) / (2 *a));
				
				System.out.println("X1: " + x1);
				System.out.println("X2: " + x2);
			}
		}
	}
}
