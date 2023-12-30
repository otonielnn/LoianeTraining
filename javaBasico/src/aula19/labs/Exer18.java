package aula19.labs;

import java.util.Scanner;

public class Exer18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] A = new int[10];

        for (int i = 0; i < A.length; i++) {
            System.out.print("Ente com a idade da pessoa " + (i + 1) + "º: ");
            A[i] = input.nextInt();
        }

        int maior = A[0];
        int indexMaior = 0;
        int menor = A[0];
        int indexMenor = 0;

        System.out.print("Lista de idades: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");

            if (A[i] > maior) {
                maior = A[i];
                indexMaior = i;
            } else if (A[i] < menor) {
                menor = A[i];
                indexMenor = i;
            }
        }

        System.out.println("\nMenor: " + menor + " no index " + indexMenor);
        System.out.println("Maior: " + maior + " no index " + indexMaior);
        input.close();
    }
}
