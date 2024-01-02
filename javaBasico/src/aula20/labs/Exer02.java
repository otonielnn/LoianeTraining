package aula20.labs;

import java.util.Random;

public class Exer02 {
    public static void main(String[] args) {
        int[][] A = new int[10][10];
        int maiorLinha5 = Integer.MIN_VALUE;
        int menorLinha5 = Integer.MAX_VALUE;
        int maiorColuna7 = Integer.MIN_VALUE;
        int menorColuna7 = Integer.MAX_VALUE;

        Random numeroRandom = new Random();

        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j < A.length; j++) {
                A[i][j] = numeroRandom.nextInt(100);
            }
        }

        for (int i = 0; i < A[5].length; i++) {
            if (A[5][i] < menorLinha5) {
                menorLinha5 = A[5][i];
            } else if (A[5][i] > maiorLinha5) {
                maiorLinha5 = A[5][i];
            }
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i][7] < menorColuna7) {
                menorColuna7 = A[i][7];
            } else if (A[i][7] > maiorColuna7) {
                maiorColuna7 = A[i][7];
            }
        }

        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j < A.length; j++) {
                System.out.print(A[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("Maior da linha 5: " + maiorLinha5);
        System.out.println("Menor da linha 5: " + menorLinha5);
        System.out.println("Maior da coluna 7: " + maiorColuna7);
        System.out.println("Menor da coluna 7: " + menorColuna7);
    }
}
