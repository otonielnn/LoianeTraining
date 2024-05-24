package aula19.labs;

import java.util.Scanner;

public class Exer33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[10];

        for (int i = 0; i < A.length; i++) {
            System.out.print("Entre com o " + i + "º valor: ");
            A[i] = input.nextInt();
        }

        boolean primo;

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");

            primo = true;
            for (int j = 2; j < A[i]; j++) {
                if (A[i] % j == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println("Primo");
            } else {
                System.out.println("Não é Primo");
            }
        }

        input.close();
    }
}
