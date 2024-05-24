package aula17.labs;

import java.util.Scanner;

public class Exer19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entre com o número de notas: ");
        int notas = input.nextInt();

        double soma = 0;
        double media;
        double nota;

        for (int i = 0; i < notas; i ++) {
            System.out.print("Entre com a nota: " + (i + 1) + ": ");
            nota = input.nextDouble();

            soma += nota;
        }
        media = soma / notas;

        System.out.println("Você digitou " + notas + "notas");
        System.out.println("A Soma das foi de: " + soma);
        System.out.println("A Média das notas foi de: " + media);
        input.close();
    }
}
