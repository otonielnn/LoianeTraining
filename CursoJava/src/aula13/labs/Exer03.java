package aula13.labs;

import java.util.Scanner;

public class Exer03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int n1 = input.nextInt();
		System.out.print("Digite outro número: ");
		int n2 = input.nextInt();
		int soma = n1 + n2;
		System.out.println("A soma dos números é: " + soma);
		input.close();
	}
}
