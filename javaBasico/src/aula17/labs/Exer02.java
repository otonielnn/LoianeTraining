package aula17.labs;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String login = "";
        String senha = "";

        while (login.equals(senha)) {
            System.out.print("Digite seu Login: ");
            login = input.nextLine();

            System.out.print("Digite sua Senha: ");
            senha = input.nextLine();

            if (login.equals(senha)) {
                System.out.println("O login não pode ser igual a senha!!!");
            } else {
                System.out.println("Cadastrado com sucesso");
            }
        }

        input.close();
    }
}
