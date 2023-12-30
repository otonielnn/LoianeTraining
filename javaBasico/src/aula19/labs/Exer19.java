package aula19.labs;

import java.util.Scanner;

public class Exer19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Double[] result = new Double[10];
        Double[] notas1 = new Double[result.length];
        Double[] notas2 = new Double[result.length];

        for (int i = 0; i < result.length; i++) {
            System.out.println("Digite a 1º nota do " + (i + 1) + " aluno: ");
            notas1[i] = input.nextDouble();
            System.out.println("Digite a 2º nota do " + (i + 1) + " aluno : ");
            notas2[i] = input.nextDouble();

            result[i] = (notas1[i] + notas2[i]) / 2;
        }


        System.out.println("\nNotas 1 :");
        for (int i = 0; i < result.length; i++) {
            System.out.print(notas1[i] + " ");
        }

        System.out.println("\nNotas 2 :");
        for (int i = 0; i < result.length; i++) {
            System.out.print(notas2[i] + " ");
        }

        System.out.println("\nResultado");
        for (int i = 0; i < result.length; i++) {
            System.out.print("Media do aluno " + (i + 1) + ": " + result[i] + " - ");
            if (result[i] >=  7) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
        input.close();
    }
}
