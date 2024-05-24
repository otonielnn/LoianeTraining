package aula17.labs;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double populacaoA, taxaA;
        double populacaoB, taxaB; 

        do {
            System.out.print("Digite o número da população A: ");
            populacaoA = input.nextDouble();

            if (populacaoA < 0) {
                System.out.println("Número da população precisa ser maior que 0");
            }

        } while(populacaoA < 0);

        do {
            System.out.print("Digite a taxa de crescimento da população A: ");
            taxaA = input.nextDouble();

            if (taxaA < 0) {
                System.out.println("taxa de crescimento precisa ser maior do que 0.");
            }
        } while(taxaA < 0);

        do {
            System.out.print("Digite o número da população B: ");
            populacaoB = input.nextDouble();

            if (populacaoB < 0) {
                System.out.println("Número da população precisa ser maior que 0");
            }
        } while(populacaoB <0);

        do {
            System.out.print("Digite a taxa de crescimento da população B: ");
            taxaB = input.nextDouble();

            if (taxaB < 0) {
                System.out.println("taxa de crescimento precisa ser maior do que 0.");
            }
        } while(taxaB <0);

        int cont = 0;

        while (populacaoA <= populacaoB) {
            populacaoA += (populacaoA / 100) * taxaA;
            populacaoB += (populacaoB / 100) * taxaB;
            cont++;
        }

        System.out.println("População A: " + populacaoA);
        System.out.println("População B: " + populacaoB);
        System.out.println("Quantidade de anos : " + cont);

        input.close();
    }
}
