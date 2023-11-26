package aula17.labs;

import java.util.Scanner;

public class Exer27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de temperaturas: ");
        int quantidadeTemperaturas = input.nextInt();

        double temperatura, soma=0, maior = Double.MIN_VALUE, menor = Double.MAX_VALUE;

        for (int i = 1; i <= quantidadeTemperaturas; i++) {
            System.out.print("Entre com a temperatura " + i);
            temperatura = input.nextDouble();

            soma += temperatura;

            if (temperatura > maior) {
                maior = temperatura;
            }
            
            if (temperatura < menor) {
                menor = temperatura;
            }
        }
        double media = soma / quantidadeTemperaturas;
        System.out.println("A Média das temperaturas é de: " + media);
        System.out.println("A Menor Temperatura: " + menor);
        System.out.println("A Maior Temperatura: " + maior);
        input.close();
    }
}
