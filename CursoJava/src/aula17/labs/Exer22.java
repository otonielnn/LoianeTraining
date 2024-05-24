package aula17.labs;

import java.util.Scanner;

public class Exer22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entre com a quantidade de CDs: ");
        int cds = input.nextInt();

        double preco;
        double soma = 0;

        for (int i = 1 ; i <= cds; i ++) {
            System.out.print("Informe o preço do CD " + i + ": ");
            preco = input.nextDouble();
            soma += preco;
        }
        double media = soma / cds;
        System.out.println("A media gasta em CDs foi de: " + media);
        input.close();
    }
}
