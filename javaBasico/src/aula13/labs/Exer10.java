package aula13.labs;

import java.util.Scanner;

public class Exer10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite a temperatura em ºC: ");
		double C = input.nextDouble();
		double F = 1.8 * C + 32;
		System.out.println(C + "ºC é igual a " + F + "ºC");
		input.close();
	}
}
