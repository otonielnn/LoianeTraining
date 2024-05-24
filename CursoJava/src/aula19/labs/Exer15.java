package aula19.labs;

import java.util.Scanner;

public class Exer15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] A = new int[10];
        int par = 0;
        int impar = 0;

        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + "º do vetor A: ");
            A[i] = input.nextInt();
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                par++;
            }
        }

        impar = A.length - par;

        System.out.println(impar);
        System.out.println(par);
        System.out.println(A.length);

        int porcPar = (par * 100) / A.length;
        int porcImpar = (impar * 100) / A.length;

        System.out.println("\nPorcentagem de números pares: " + porcPar + "%");
        System.out.println("Porcentagem de números Ímpares: " + porcImpar + "%");
        input.close();
    }
}
