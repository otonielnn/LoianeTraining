package aula19.labs;

import java.util.Scanner;

public class Exer24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[10];

        for (int i = 0; i < A.length; i++) {
            System.out.print("Entre com o número da posição " + i + ": ");
            A[i] = input.nextInt();
        }

        boolean palindromo = true;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != A[(A.length - 1) - i]) {
                palindromo = false;
                break;
            }
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println();
        if (palindromo) {
                System.out.println("Palindromo");
            } else {
                System.out.println("Não é palindromo");
            }
        input.close();
    }
}
