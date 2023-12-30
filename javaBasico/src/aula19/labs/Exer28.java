package aula19.labs;

import java.util.Scanner;

public class Exer28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            System.out.print("Entre com o " + i + "º valor: ");
            A[i] = input.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            B[i] = A[(A.length - 1) - i];
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
