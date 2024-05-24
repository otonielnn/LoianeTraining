package aula19.labs;

import java.util.Scanner;

public class Exer34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[10];

        for (int i = 0; i < A.length; i++) {
            System.out.print("Entre com o " + i + "º valor: ");
            A[i] = input.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            System.out.println("análise do número " + A[i]);

            for (int j = 2; j < A[i]; j++) {
                if (j % 2 == 0) {
                    System.out.println(j + " é Par");
                }
            }
            System.out.println();
        }
        input.close();
    }
}
