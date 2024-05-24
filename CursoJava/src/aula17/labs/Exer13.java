package aula17.labs;

import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número Base: ");
        int base = input.nextInt();

        System.out.print("Digite o número Expoente: ");
        int expoente = input.nextInt();

        int resultado = base;

        for (int i = 1; i < expoente; i++) {
            resultado *= base;
        }

        System.out.println(resultado);
        input.close();
    }
}
