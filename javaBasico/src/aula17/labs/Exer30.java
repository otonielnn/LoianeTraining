package aula17.labs;

import java.util.Scanner;

public class Exer30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numero, inicioTabuada, finalTabuada;

        System.out.print("Qual número deseja ver a tabuada: ");
        numero = input.nextInt();
        do {
            System.out.print("Digite um número para iniciar a tabuada: ");
            inicioTabuada = input.nextInt();

            System.out.print("Digite um número para finalizar a tabuada: ");
            finalTabuada = input.nextInt();
            
            if (finalTabuada < inicioTabuada) {
                System.out.println("ERRO!!! Final da tabuada menor do que o inicio.");
            }
        } while(finalTabuada < inicioTabuada);

        System.out.println("Tabuada de " + numero + ": ");

        for (int i = inicioTabuada; i <= finalTabuada; i++) {
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }
        input.close();
    }
}
