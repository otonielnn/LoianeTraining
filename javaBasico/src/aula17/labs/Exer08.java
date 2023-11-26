package aula17.labs;

import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int soma = 0;

        for (int i = 1; i < 6; i++) {
            System.out.printf("Digite o número %dº: ", i);
            num = input.nextInt();
            soma += num;
        }
        double media = soma / 5;
        System.out.println("A soma de todos os números é: " + soma);
        System.out.println("A Média dos números é : " + media);
        input.close();
    }
}
