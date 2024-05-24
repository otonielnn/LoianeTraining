package aula17.labs;

import java.util.Scanner;

public class Exer15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o n-ésimo termo da serie fibonacci: ");
        int n = input.nextInt();

        int primeiro = 0;
        int segundo = 1;
        int proximo = 0;

        System.out.println(primeiro);
        System.out.println(segundo);
        for (int i = 3; i <= n; i++) {
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            System.out.println(proximo);
        }
        input.close();
    }
}
