package com.otoniel.cursoJava.aula15.labs;

import java.util.Scanner;

public class Exer03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite seu Sexo: ");
		String sexo = input.next();
		if (sexo.equalsIgnoreCase("m")) {
			System.out.println("Masculino");
		} else if (sexo.equalsIgnoreCase("f")) {
			System.out.println("Feminino");
		} else {
			System.out.println("Inválido");
		}
	}
}
