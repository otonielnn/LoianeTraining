package aula17.labs;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int idade;
        double salario;
        char sexo, estadoCivil;
        boolean sexoValido = false, estadoCivilValido = false;

        do {
            System.out.print("Digite seu nome: ");
            nome = input.nextLine();

            if (nome.length() < 3) {
                System.out.println("O nome precisa ter no minimo 3 digitos!!!");
            }
        } while (nome.length() < 3);

        do {
            System.out.print("Digite sua idade: ");
            idade = input.nextInt();

            if (idade < 0 || idade > 150) {
                System.out.println("A idade precisa ser entre 0 e 150!!!");
            }
        } while (idade < 0 || idade > 150);

        do {
            System.out.print("Digite seu salario: ");
            salario = input.nextDouble();

            if (salario < 0) {
                System.out.println("Salario precisa ser maior do que 0!!!");
            }
        } while (salario < 0);

        do {
            System.out.print("Digite seu Sexo: ");
            sexo = input.next().charAt(0);
            sexo = Character.toLowerCase(sexo);
            System.out.println(sexo);

            if (sexo == 'f' || sexo == 'm') {
                sexoValido = true;
            } else {
                System.out.println("O sexo precisa ser 'f' ou 'm'.");
            }
        } while (!sexoValido);

        do {
            System.out.print("Digite seu Estado Civil: ");
            estadoCivil = input.next().charAt(0);

            if (estadoCivil == 's' || estadoCivil == 'c' || estadoCivil == 'v' || estadoCivil == 'd') {
                estadoCivilValido = true;
            } else {
                System.out.println("O Estado Civil precisa ser 's', 'c' , 'v', 'd'.");
            }
        } while (!estadoCivilValido);

        System.out.println("------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);
        System.out.println("------------------");
        input.close();
    }
}
