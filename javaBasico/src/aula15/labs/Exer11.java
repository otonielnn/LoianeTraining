package aula15.labs;

import java.util.Scanner;

public class Exer11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Qual seu salário em R$: ");
		double salario = input.nextDouble();
		double novoSalario = 0;
		double percentual = 0;
		double aumento = 0;
		
		if (salario <= 280) {
			percentual = 20;
			aumento = salario * (percentual / 100);
			novoSalario += salario + aumento;
		} else if (salario > 280 && salario <= 700) {
			percentual = 15;
			aumento = salario * (percentual / 100);
			novoSalario += salario + aumento;
		} else if (salario > 700 && salario <= 1500) {
			percentual = 10;
			aumento = salario * (percentual / 100);
			novoSalario += salario + aumento;
		} else if (salario > 1500) {
			percentual = 5;
			aumento = salario * (percentual / 100);
			novoSalario += salario + aumento;
		}
		
		System.out.println("Salário antes do Reajuste: " + salario);
		System.out.println("Percentual Aplicado: " + percentual + "%");
		System.out.println("Valor do Aumento: " + aumento);
		System.out.println("Novo Salário: " + novoSalario);
		input.close();
	}
}
