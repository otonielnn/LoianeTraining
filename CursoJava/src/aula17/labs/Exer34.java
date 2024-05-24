package aula17.labs;

import java.util.Scanner;

public class Exer34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o valor de N: ");
        int n = input.nextInt();

        double soma = 0;

        for (int i=1; i <= n; i++) {
            soma += 1/i;
        }
        System.out.println("Soma = " + soma);
        input.close();
    }
}
