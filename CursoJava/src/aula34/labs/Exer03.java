package aula34.labs;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;

        do {
            System.out.print("Digite um número positivo: ");
            num = scan.nextInt();

            if (num < 0) {
                System.out.println("Número inválido, Tente Novamente.");
            }

        } while (num < 0);

        System.out.println(Calculadora.fatorial(num));
        scan.close();
    }
}
