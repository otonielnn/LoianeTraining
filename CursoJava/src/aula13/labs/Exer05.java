package aula13.labs;

import java.util.Scanner;

public class Exer05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite uma medida em Metros: ");
		double metros = input.nextDouble();
		double centimetros = metros * 100;
		System.out.println(metros + "m é igual a " + centimetros + "cm");
		input.close();
	}
}
