package aula20.labs;

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] compromissos = new String[31][24];
        boolean sair = false;
        int opcao;

        while (!sair) {
            System.out.println("Digite 1 para Adicionar compromisso.");
            System.out.println("Digite 2 para Verificar compromisso.");
            System.out.println("Digite 0 para Sair.");
            opcao = input.nextInt();

            if (opcao == 1) {
                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.print("Entre com o dia do mês:");
                    dia = input.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente.");
                    }
                }

                boolean horaValida = false;
                int hora = 0;
                while (!horaValida) {
                    System.out.print("Entre com a hora do compromisso:");
                    hora = input.nextInt();
                    if (hora >= 0 && hora <= 24) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida, Digite novamente.");
                    }
                }
                dia--;
                System.out.print("Digite o Compromisso: ");
                input.nextLine();
                compromissos[dia][hora] = input.nextLine();
            } else if (opcao == 2) {
                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.print("Entre com o dia do mês:");
                    dia = input.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente.");
                    }
                }

                int hora = 0;
                boolean horaValida = false;
                while (!horaValida) {
                    System.out.print("Entre com a hora do compromisso:");
                    hora = input.nextInt();
                    if (hora >= 0 && hora <= 24) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida, Digite novamente.");
                    }
                }
                dia--;
                System.out.println("O compromisso agendado é: ");
                System.out.println(compromissos[dia][hora]);
            } else if (opcao == 0) {
                sair = true;
            } else {
                System.out.println("Opção inválida!!!");
            }
        }
        input.close();
    }
}
