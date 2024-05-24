package aula17.labs;

import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int maior = Integer.MIN_VALUE;

        for (int i = 1; i < 6; i++) {
            System.out.printf("Digite o número %dº: ", i);
            num = input.nextInt();

            if (num > maior) {
                maior = num;
            }
        }

        System.out.printf("O maior dos 5 números foi o: %d", maior);
        input.close();
    }
}
