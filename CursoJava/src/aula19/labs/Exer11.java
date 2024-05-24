package aula19.labs;

import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] A = new int[10];

        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + "º do vetor A: ");
            A[i] = input.nextInt();
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.print("\nElementos pares do Vetor A: ");
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                System.out.print(A[i] + " ");
            }
        }
        input.close();
    }
}
