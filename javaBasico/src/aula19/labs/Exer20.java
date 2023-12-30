package aula19.labs;

import java.util.Scanner;

public class Exer20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double[] A = new Double[20];
        double cotacao;

        System.out.print("Digite o valor do USD: ");
        cotacao = input.nextDouble();

        for (int i = 0; i < A.length; i++) {
            System.out.println("R$ " + (i + 1) + " = USD$ " + (cotacao * (i + 1)));
        }
        input.close();
    }
}
