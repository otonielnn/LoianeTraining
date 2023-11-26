package aula13.labs;

import java.util.Scanner;

public class Exer12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite sua altura: ");
		double altura = input.nextDouble();
		double pesoIdeal = (72.2 * altura) - 58;
		System.out.println("Seu peso ideal seria: " + pesoIdeal + " Kg.");
		input.close();
	}
}
