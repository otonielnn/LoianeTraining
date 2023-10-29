package com.otoniel.cursoJava.aula13.labs;

import java.util.Scanner;

public class Exer09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite a temperatura em ºF: ");
		double F = input.nextDouble();
		double C = (5 * (F - 32) / 9);
		System.out.println(F + "ºF é igual a " + C + "ºC");
	}
}
