package aula20.labs;

import java.util.Random;

public class Exer01 {
    public static void main(String[] args) {
        int[][] A = new int[4][4];
        int maior = Integer.MIN_VALUE;
        int linha = 0;
        int coluna = 0;

        Random numeroRandom = new Random();

        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = numeroRandom.nextInt(100);

                if (A[i][j] > maior) {
                    maior = A[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j < A.length; j++) {
                System.out.print(A[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("Maior número: " + maior);
        System.out.println("Linha: " + linha);
        System.out.println("Coluna: " + coluna);
    }
}
