package aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double[] A = new Double[15];
        Double[] B = new Double[A.length];

        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + "º: ");
            A[i] = input.nextDouble();
            B[i] = Math.sqrt(A[i]);
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

        DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.print("\nVetor B: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(df.format(B[i]) + " ");
        }
        input.close();
    }
}
