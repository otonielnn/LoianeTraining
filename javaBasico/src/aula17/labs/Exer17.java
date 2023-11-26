package aula17.labs;

import java.util.Scanner;

public class Exer17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        System.out.print(numero + "! = ");
        int fatorial = 1;
        for (int i = numero; i > 0; i--) {
            fatorial *= i;
            if (i != 1) {
                System.out.print(i + " X ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println("\nResultado: " + fatorial);
        input.close();
    }
}
