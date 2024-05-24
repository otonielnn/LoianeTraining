package aula17.labs;

import java.util.Scanner;

public class Exer21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o Número de Turmas: ");
        int numeroTurmas = input.nextInt();

        int numeroAlunos, soma = 0;

        for (int i = 0; i < numeroTurmas; i ++) {
            do {
                System.out.print("Entre com o número de alunos da turma " + (i + 1) + ": ");
                numeroAlunos = input.nextInt();

                if (numeroAlunos > 40) {
                    System.out.println("Limite de 40 alunos ultrapassados");
                }
            } while(numeroAlunos > 40);
            soma += numeroAlunos;
        }
        double media = soma / numeroTurmas;
        System.out.println("Total de alunos: " + soma);
        System.out.println("Média de alunos: " + media);
        input.close();
    }
}
