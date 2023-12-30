package aula19.labs;

import java.util.Scanner;

public class Exer23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[10];

        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite o valor " + i + ": ");
            A[i] = input.nextInt();

            if (A[i] % 2 == 1) {
                System.out.println("Foi digitado um número Ímpar!!!");
                break;
            }
        }
        input.close();
    }
}
