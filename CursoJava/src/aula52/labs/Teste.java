package aula52.labs;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao = 1;

        while (opcao != 3) {
            opcao = obterOpcaoMenu(scan);
    
            if (opcao == 1) {
                consultarContato(scan, agenda);
            } else if (opcao == 2) {
                adicionarContato(scan, agenda);
            }
        }
        scan.close();
    }

    public static void adicionarContato(Scanner scan, Agenda agenda) {
        try {
            System.out.println("Criando um contato, entre com as informações");
            String nome = leInformacaoString(scan, "Digite o nome do contato: ");
            String telefone = leInformacaoString(scan, "Digite o telefone do contato: ");
            String email = leInformacaoString(scan, "Digite o email do contato: ");

            Contato contato = new Contato(nome, telefone, email);

            System.out.println("Contato a ser criado: ");
            System.out.println(contato);

            agenda.adicionarContato(contato);
        } catch (AgendaCheiaException e) {
            System.out.println(e.getMessage());
            System.out.println("Contatos da agenda");
            System.out.println(agenda);
        }
    }

    public static void consultarContato(Scanner scan, Agenda agenda) {
        String nomeContato = leInformacaoString(scan, "Entre com o nome do contato a ser pesquisado: ");
        try {
            if (agenda.consultaContatoPorNome(nomeContato) >= 0) {
                System.out.println("Contato Existe!!!");
            }
        } catch (ContatoNaoExisteException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static String leInformacaoString(Scanner scan, String msg) {
        System.out.println(msg);
        String entrada = scan.nextLine();
        return entrada;
    }

    public static int obterOpcaoMenu(Scanner scan) {

        boolean entradaValida = false;
        int opcao = 3;

        while (!entradaValida) {
            System.out.println("Digite a opção desejada: ");
            System.out.println("1: Consultar contato");
            System.out.println("2: Adicionar contato");
            System.out.println("3: Sair");

            try {
                String entrada = scan.nextLine();

                opcao = Integer.parseInt(entrada);

                if (opcao < 1 || opcao > 3) {
                    throw new Exception("Entrada inválida!");
                } else {
                    entradaValida = true;
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente!\n");
            }
        }

        return opcao;
    }
}
