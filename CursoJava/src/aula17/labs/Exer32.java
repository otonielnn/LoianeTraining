package aula17.labs;

import java.util.Scanner;

public class Exer32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int codigo, quantidade;
        double total = 0;
        String output = "";

        do {
            System.out.println("Digite o código e a quantidade. Digite 0 0 para sair.");
            codigo = input.nextInt();
            quantidade = input.nextInt();

            if (codigo == 0 && quantidade == 0) {
                output += "Total a pagar = " + total;
            } else {
                if (codigo == 100) {
                    output += "Cachorro Quente -> 1,20 * " + quantidade;
                    output += " = " + (1.20*quantidade) + "\n";
                    total += 1.20 * quantidade;
                } else if (codigo == 101) {
                    output += "Bauru Simples -> 1,30 * " + quantidade;
                    output += " = " + (1.30*quantidade) + "\n";
                    total += 1.30 * quantidade;
                } else if (codigo == 102) {
                    output += "Bauru com Ovo -> 1,50 * " + quantidade;
                    output += " = " + (1.50*quantidade) + "\n";
                    total += 1.50 * quantidade;
                } else if (codigo == 103) {
                    output += "Hambúrguer -> 1,20 * " + quantidade;
                    output += " = " + (1.20*quantidade) + "\n";
                    total += 1.20 * quantidade;
                } else if (codigo == 104) {
                    output += "Chesse Burguer -> 1,30 * " + quantidade;
                    output += " = " + (1.30*quantidade) + "\n";
                    total += 1.30 * quantidade;
                } else if (codigo == 105) {
                    output += "Refrigerante -> 1,00 * " + quantidade;
                    output += " = " + (1.00*quantidade) + "\n";
                    total += 1.00 * quantidade;
                }
            }
        }while(codigo != 0 && quantidade != 0);
        System.out.println(output);
        input.close();
    }
}
