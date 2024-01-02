package aula20.labs;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[3][3];
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print("Digite um valor para [" + i + "][" + j + "]: ");
                A[i][j] = input.nextInt();
                if (A[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("Números Pares: " + pares);
        System.out.println("Números Impares: " + impares);
        input.close();
    }
}
