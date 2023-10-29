package com.otoniel.cursoJava.aula15.labs;

import java.util.Scanner;

public class Exer01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int n1 = input.nextInt();
		System.out.print("Digite outro número: ");
		int n2 = input.nextInt();
		
		if (n1 > n2) {
			System.out.println("O " + n1  + " é maior do que " + n2);
		} else {
			System.out.println("O " + n2  + " é maior do que " + n1);
		}
	}
}
