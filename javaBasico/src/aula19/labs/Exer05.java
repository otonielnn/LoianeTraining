package aula19.labs;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + "º: ");
            A[i] = input.nextInt();
            B[i] = A[i] * (i + 1);
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.print("\nVetor B: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(B[i] + " ");
        }
        input.close();
    }
}
