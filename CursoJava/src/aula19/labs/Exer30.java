package aula19.labs;

import java.util.Scanner;

public class Exer30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[20];
        int[] B = new int[A.length];
        int[] C = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            System.out.print("Entre com o " + i + "º valor: ");
            A[i] = input.nextInt();
        }

        int posB = 0;
        int posC = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                B[posB] = A[i];
                posB++;
            } else {
                C[posC] = A[i];
                posC++;
            }
        }

        System.out.println("Vetor A");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println("\nVetor B");
        for (int i = 0; i < posB; i++) {
            System.out.print(B[i] + " ");
        }

        System.out.println("\nVetor C");
        for (int i = 0; i < posC; i++) {
            System.out.print(C[i] + " ");
        }
        input.close();
    }
}
