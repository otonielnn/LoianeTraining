package aula17.labs;

import java.util.Scanner;

public class Exer24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o preço do Pão: ");
        double preço = input.nextDouble();
    
        
        System.out.println("Panificadora Pão de Ontem - Tabela de Preços");

        for (int i = 1; i <= 50; i++){
            System.out.println(i + " - R$ " + (preço * i));
        }
        input.close();
    }
}
