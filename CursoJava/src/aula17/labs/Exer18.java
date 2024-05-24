package aula17.labs;

import java.util.Scanner;

public class Exer18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entre com o número: ");
        int numero = input.nextInt();

        boolean primo = true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                System.out.println("Não é primo");
                primo = false;
            }
        }

        if (primo) {
            System.out.println("É primo");
        }

        input.close();
    }
}
