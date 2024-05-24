package aula19.labs;

import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] A = new int[10];
        int soma = 0;
        int impar = 0;

        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + "º do vetor A: ");
            A[i] = input.nextInt();
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 1) {
                soma += A[i];
                impar++;
            }
        }

        int media = soma / impar;
        System.out.println("\nSoma dos Ímpares: " + soma);
        System.out.print("Média dos Ímpares: " + media);
        input.close();
    }
}
