package aula13.labs;

import java.util.Scanner;

public class Exer08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Quanto você ganha por hora: ");
		double ganhoPorHora = input.nextDouble();
		System.out.print("Quantas horas você trabalha por mês: ");
		int horasPorMes = input.nextInt();
		double salario = ganhoPorHora * horasPorMes;
		System.out.println("Ganhando R$" + ganhoPorHora + " Por hora e Trabalhando " + horasPorMes + " Por mês. Você terá um salário de R$" + salario);
		input.close();
	}
}
