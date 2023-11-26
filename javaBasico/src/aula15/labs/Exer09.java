package aula15.labs;

import java.util.Scanner;

public class Exer09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o 1º número: ");
		int n1 = input.nextInt();
		System.out.print("Digite o 2º número: ");
		int n2 = input.nextInt();
		System.out.print("Digite o 3º número: ");
		int n3 = input.nextInt();
		
		if (n1 <= n2 && n1 <= n3 && n2 <= n3) {
			System.out.println(n3 + " " + n2 + " " + n1);
		} else if (n1 <= n2 && n1 <= n3 && n3 <= n2) {
			System.out.println(n2 + " " + n3 + " " + n1);
		} else if (n2 <= n1 && n2 <= n3 && n1 <= n3) {
			System.out.println(n3 + " " + n1 + " " + n2);
		} else if (n2 <= n1 && n2 <= n3 && n3 <= n1) {
			System.out.println(n1 + " " + n3 + " " + n2);
		} else if (n3 <= n1 && n3 <= n2 && n1 <= n2) {
			System.out.println(n2 + " " + n1 + " " + n3);
		} else if (n3 <= n1 && n3 <= n2 && n2 <= n1) {
			System.out.println(n1 + " " + n2 + " " + n3);
		}
		input.close();
	}
}
