package aula19.labs;

import java.util.Scanner;

public class Exer26 {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[A.length];
        int[] C = new int[A.length];
        
        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite o valor " + i + ": ");
            A[i] = input.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite o valor " + i + ": ");
            B[i] = input.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] > B[i]) {
                C[i] = 1;
            } else if (A[i] == B[i]) {
                C[i] = 0;
            } else {
                C[i] = -1;
            }
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.print("\nVetor B: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(B[i] + " ");
        }

        System.out.print("\nVetor C: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(C[i] + " ");
        }
        input.close();
    }
}
