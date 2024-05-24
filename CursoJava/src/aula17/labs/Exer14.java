package aula17.labs;

import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0;
        int par = 0, impar = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o número %dº: ", i);
            num = input.nextInt();

            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("Números Pares: " + par);
        System.out.println("Números Impares: " + impar);

        input.close();
    }
}
