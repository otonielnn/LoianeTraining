package aula15.labs;

import java.util.Scanner;

public class Exer04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite uma letra: ");
		String letra = input.next();
		if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e")
				|| letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o")
				|| letra.equalsIgnoreCase("u")) {
			System.out.println("Vogal");
		} else {
			System.out.println("Consoante");
		}
		input.close();
	}
}
