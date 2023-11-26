package aula17.labs;

import java.util.Scanner;

public class Exer12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Qual número deseja ver a tabuada: ");
        int numero = input.nextInt();

        System.out.println("Tabuada de " + numero + ": ");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }
        input.close();
    }
}
