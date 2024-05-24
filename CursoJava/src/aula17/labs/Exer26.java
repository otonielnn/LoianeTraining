package aula17.labs;

import java.util.Scanner;

public class Exer26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        System.out.println("Fatorial de " + numero);
        int fatorial = 1;
        System.out.print(numero + "! = ");
        for (int i = numero; i > 0; i--) {
            fatorial *= i;
            if (i != 1) {
                System.out.print(i + " . ");
            } else {
                System.out.print(i + " = " + fatorial);
            }
        }
        input.close();
    }
}
