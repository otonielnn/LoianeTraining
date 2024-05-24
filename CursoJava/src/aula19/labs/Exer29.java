package aula19.labs;

import java.util.Scanner;

public class Exer29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[A.length];
        int[] C = new int[A.length * 2];

        System.out.println("Vetor A");
        for (int i = 0; i < A.length; i++) {
            System.out.print("Entre com o " + i + "º valor: ");
            A[i] = input.nextInt();
        }

        System.out.println("\nVetor B");
        for (int i = 0; i < A.length; i++) {
            System.out.print("Entre com o " + i + "º valor: ");
            B[i] = input.nextInt();
        }

        for (int i = 0; i < C.length; i++) {
            if (i < 10) {
                C[i] = A[i];
            } else {
                C[i] = B[i - 10];
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
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
        input.close();
    }
}
