package aula19.labs;

import java.util.Scanner;

public class Exer32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[5];

        for (int i = 0; i < A.length; i++) {
            System.out.print("Entre com o " + i + "º valor: ");
            A[i] = input.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            System.out.println("Tabuada de " + A[i]);
            for (int j = 1; j <= 9; j++) {
                System.out.println(A[i] + " X " + j + " = " + (A[i] * j));
            }
        }
        input.close();
    }
}
