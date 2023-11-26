package aula15.labs;

import java.util.Scanner;

public class Exer06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o 1º número: ");
		int n1 = input.nextInt();
		System.out.print("Digite o 2º número: ");
		int n2 = input.nextInt();
		System.out.print("Digite o 3º número: ");
		int n3 = input.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("O maior número é: " + n1);
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("O maior número é: " + n2);
		} else {
			System.out.println("O maior número é: " + n3);
		}
		input.close();
	}
}
