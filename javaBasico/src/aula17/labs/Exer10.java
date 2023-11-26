package aula17.labs;

import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o Primeiro número: ");
        int n1 = input.nextInt();

        System.out.print("Digite o Segundo número: ");
        int n2 = input.nextInt();

        for (int i = n1; i <= n2; i++){
            System.out.println(i);
        }
        input.close();
    }
}
