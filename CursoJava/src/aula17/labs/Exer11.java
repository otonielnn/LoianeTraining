package aula17.labs;

import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o Primeiro número: ");
        int n1 = input.nextInt();

        System.out.print("Digite o Segundo número: ");
        int n2 = input.nextInt();

        int soma = 0;

        for (int i = n1; i <= n2; i++){
            System.out.println(i);
            soma += i;
        }
        System.out.println("A soma dos números entre " + n1 + " e " + n2 + " é de: " + soma);
        input.close();
    }
}
