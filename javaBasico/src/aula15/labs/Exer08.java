package aula15.labs;

import java.util.Scanner;

public class Exer08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o preço do 1º Produto: ");
		double p1 = input.nextDouble();
		System.out.print("Digite o preço do 2º Produto: ");
		double p2 = input.nextDouble();
		System.out.print("Digite o preço do 3º Produto: ");
		double p3 = input.nextDouble();
		
		if (p1 < p2 && p1 < p3) {
			System.out.println("O produto mais barato é o : " + p1);
		} else if (p2 < p1 && p2 < p3) {
			System.out.println("O produto mais barato é o : " + p2);
		} else {
			System.out.println("O produto mais barato é o : " + p3);
		}
		input.close();
 	}
}
