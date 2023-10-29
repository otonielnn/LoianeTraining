package com.otoniel.cursoJava.aula15.labs;

import java.util.Scanner;

public class Exer12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Entre com o valor/hora: ");
		double valorHora = input.nextDouble();
		
		System.out.print("Entre com as horas trabalhadas no mês: ");
		double qtdHoras = input.nextDouble();
		
		double salarioBruto = valorHora * qtdHoras;
		
		int percentualIR = 0;
		
		if (salarioBruto <= 900) {
			percentualIR = 0;
		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
			percentualIR = 5;
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			percentualIR = 10;
		} else if (salarioBruto > 2500) {
			percentualIR = 20;
		}
		
		double ir = (salarioBruto / 100) * percentualIR;
		double inss = (salarioBruto / 100) * 10;
		double fgts = (salarioBruto / 100) * 11;
		double totalDescontos = ir + inss;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salário Bruto: (" + valorHora + " * " + qtdHoras + "): R$" + salarioBruto);
		System.out.println("(-) IR (" + percentualIR + "%): R$" + ir);
		System.out.println("(-) INSS (10%): R$" + inss);
		System.out.println("FGTS (11%): R$" + fgts);
		System.out.println("Total de Descontos: R$" + totalDescontos);
		System.out.println("Salário Liquido: R$" + salarioLiquido);
	}
}
