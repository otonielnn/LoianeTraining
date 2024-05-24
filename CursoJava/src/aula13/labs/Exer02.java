package aula13.labs;

import java.util.Scanner;

public class Exer02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int n = input.nextInt();
		System.out.println("O número digitado foi: " + n);
		input.close();
	}
}
