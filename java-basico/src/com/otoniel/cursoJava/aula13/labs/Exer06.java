package com.otoniel.cursoJava.aula13.labs;

import java.util.Scanner;

public class Exer06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o Raio do ciruclo: ");
		double raio = input.nextDouble();
		double area = 3.14 * (raio * raio);
		System.out.println("A Área do circulo é: " + area);
	}
}
