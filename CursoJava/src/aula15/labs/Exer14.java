package aula15.labs;

import java.util.Scanner;

public class Exer14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite sua 1º nota: ");
		double n1 = input.nextDouble();
		System.out.println("Digite sua 2º nota: ");
		double n2 = input.nextDouble();
		
		double media = (n1 + n2) / 2;
		String conceito = "";
		
		if (media > 0 && media <= 4) {
			conceito = "E";
		} else if (media > 4 && media <= 6) {
			conceito = "D";
		} else if (media > 6 && media <= 7.5) {
			conceito = "C";
		} else if (media > 7.5 && media <= 9) {
			conceito = "B";
		} else if (media > 9) {
			conceito = "A";
		}
		
		System.out.println("Nota 1: " + n1);
		System.out.println("Nota 2: " + n2);
		System.out.println("Média: " + media);
		System.out.println("Conceito: " + conceito);
		input.close();
	}
}
