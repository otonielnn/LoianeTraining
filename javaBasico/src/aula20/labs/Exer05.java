package aula20.labs;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][][] compromissos = new String[12][31][8];
        boolean sair = false;
        int opcao;

        while (!sair) {
            System.out.println("Digite 1 para Adicionar compromisso.");
            System.out.println("Digite 2 para Verificar compromisso.");
            System.out.println("Digite 0 para Sair.");
            opcao = input.nextInt();

            if (opcao == 1) {
                boolean mesValido = false;
                int mes = 0;
                while (!mesValido) {
                    System.out.print("Entre com o mês:");
                    mes = input.nextInt();
                    if (mes > 0 && mes <= 12) {
                        mesValido = true;
                    } else {
                        System.out.println("Mês inválido, digite novamente.");
                    }
                }

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
                    if (hora >= 0 && hora <= 8) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida, Digite novamente.");
                    }
                }
                dia--;
                mes--;
                System.out.print("Digite o Compromisso: ");
                input.nextLine();
                compromissos[mes][dia][hora] = input.nextLine();
            } else if (opcao == 2) {
                boolean mesValido = false;
                int mes = 0;
                while (!mesValido) {
                    System.out.print("Entre com o mês:");
                    mes = input.nextInt();
                    if (mes > 0 && mes <= 12) {
                        mesValido = true;
                    } else {
                        System.out.println("Mês inválido, digite novamente.");
                    }
                }
                
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
                mes--;
                System.out.println("O compromisso agendado é: ");
                System.out.println(compromissos[mes][dia][hora]);
            } else if (opcao == 0) {
                sair = true;
            } else {
                System.out.println("Opção inválida!!!");
            }
        }
        input.close();
    }
}
