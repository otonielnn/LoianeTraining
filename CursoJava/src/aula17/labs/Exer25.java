package aula17.labs;

import java.util.Scanner;

public class Exer25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lojas Tabajara");

        boolean sair = false;
        String continuarCompra;
        int quantidadeProdutos = 0;
        double preco, total, valorPago, troco;
        String output;

        do {
            System.out.println("Deseja informar uma nova compra? S/N");
            continuarCompra = input.next();

            if (continuarCompra.equalsIgnoreCase("s")) {
                
                output = "Lojas Tabajaras\n";

                System.out.println("Digite a quantidade de itens da compra: ");
                quantidadeProdutos = input.nextInt();

                total = 0;

                for (int i = 1; i <= quantidadeProdutos; i++) {
                    System.out.println("Informe preço do produto " + i);
                    preco = input.nextDouble();
                    total += preco;
                    output += "Produto " + i + ": R$ " + preco + "\n";
                }
                output += "total: R$ " + total + "\n";

                System.out.println("Total: R$ " + total + "\n");

                System.out.print("Entre com o valor pago: ");
                valorPago = input.nextDouble();

                output += "Dinheiro: R$ " + valorPago + "\n";

                troco = total - valorPago;

                output += "Troco: R$ " + troco;

                System.out.println(output);

            } else {
                sair = true;
            }

        }while (!sair);
        input.close();
    }
}
