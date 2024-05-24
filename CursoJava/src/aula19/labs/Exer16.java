package aula19.labs;

import java.util.Scanner;

public class Exer16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] A = new int[10];
        int somaMenores15 = 0;
        int somaMaiores15 = 0;
        int igual15 = 0;
        int maior15 = 0;

        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + "º do vetor A: ");
            A[i] = input.nextInt();
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] < 15) {
                somaMenores15 += A[i];
            } else if (A[i] == 15) {
                igual15++;
            } else {
                somaMaiores15 += A[i];
                maior15++;
            }

        }

        int mediaMaiores15 = somaMaiores15 / maior15;
        System.out.println("\nSoma dos valores menores que 15 : " + somaMenores15);
        System.out.println("Quantidade de valores igual a 15 : " + igual15);
        System.out.println("Média dos valores superiores a 15: " + mediaMaiores15);
        input.close();
    }
}
