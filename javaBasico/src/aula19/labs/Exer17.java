package aula19.labs;

import java.util.Scanner;

public class Exer17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] A = new int[10];
        int maior35 = 0;

        for (int i = 0; i < A.length; i++) {
            System.out.print("Ente com a idade da pessoa " + (i + 1) + "º: ");
            A[i] = input.nextInt();
            if (A[i] > 35) {
                maior35++;
            }
        }

        System.out.print("Lista de idades: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println("\nExistem " + maior35 + " Pessoas com idade superior a 35 anos na lista.");
        input.close();
    }
}
