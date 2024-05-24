package aula15.labs;

import java.util.Scanner;

public class Exer15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o valor do 1º lado: ");
		int l1 = input.nextInt();
		System.out.print("Digite o valor do 2º lado: ");
		int l2 = input.nextInt();
		System.out.print("Digite o valor do 3º lado: ");
		int l3 = input.nextInt();
		
		if ((l1 + l2) > l3 || (l1 + l3) > l2 || (l2 + l3) > l1) {
			if (l1 == l2 && l1 == l3 && l2 == l3) {
				System.out.println("Triângulo Equilátero");
			} else if (l1 != l2  && l1 != l3 && l2 != l3) {
				System.out.println("Triângulo Escaleno");
			} else if (l1 == l2 || l1 == l3 || l2 == l3) {
				System.out.println("Triângulo Isósceles");
			}
		} else {
			System.out.println("Não formam um Triângulo");
		}
		input.close();
	}
}
