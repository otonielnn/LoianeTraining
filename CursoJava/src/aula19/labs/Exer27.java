package aula19.labs;

import java.util.Scanner;

public class Exer27 {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
        int[] A = new int[10];
        char[] B = new char[A.length];

        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite o valor " + i + ": ");
            A[i] = input.nextInt();

            if (A[i] < 7) {
                B[i] = 'a';
            } else if (A[i] == 7){
                B[i] = 'b';
            } else if (A[i] > 7 && A[i] < 10) {
                B[i] = 'c';
            } else if (A[i] == 10) {
                B[i] = 'd';
            } else {
                B[i] = 'e';
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
        input.close();
    }
}
