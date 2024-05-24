package aula17.labs;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota = 0;
        do {
            System.out.print("Digite a nota: ");
            nota = input.nextDouble();

            if (nota >= 0 && nota <= 10) {
                System.out.println("Você digitou a nota: " + nota);
            } else {
                System.out.println("nota inválida");
            }
        } while (nota > 10 || nota < 0);

        input.close();
    }
}
