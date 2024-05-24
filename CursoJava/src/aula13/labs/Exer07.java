package aula13.labs;

import java.util.Scanner;

public class Exer07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite a medidade do lado do quadrado");
		double lado = input.nextDouble();
		double area = lado * lado;
		double dobroArea = area * 2;
		System.out.println("A Área do quadrado é " + area + ". E o Dobro da Área é " + dobroArea);
		input.close();
	}
}
