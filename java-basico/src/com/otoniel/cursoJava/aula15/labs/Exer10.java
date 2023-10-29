package com.otoniel.cursoJava.aula15.labs;

import java.util.Scanner;

public class Exer10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Em qual Turno você estuda: ");
		String turno = input.next();
		
		if (turno.equalsIgnoreCase("m")) {
			System.out.println("Bom Dia!");
		} else if (turno.equalsIgnoreCase("v")) {
			System.out.println("Boa Tarde!");
		} else if (turno.equalsIgnoreCase("n")) {
			System.out.println("Boa Noite!");
		} else {
			System.out.println("Valor Inválido");
		}
	}
}
