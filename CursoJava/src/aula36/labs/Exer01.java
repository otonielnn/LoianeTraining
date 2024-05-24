package aula36.labs;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome da sua Agenda: ");
        Agenda agenda = new Agenda(scan.next());

        Contato[] contatos = new Contato[3];

        for (int i = 0; i < contatos.length; i++) {
            Contato contato = new Contato();
            System.out.print("Digite o nome do " + (i+1) + " Contato: ");
            String nome = scan.next();
            contato.setNome(nome);

            System.out.print("Digite o telefone do " + (i+1) + " Contato: ");
            String telefone = scan.next();
            contato.setTelefone(telefone);

            System.out.print("Digite o email do " + (i+1) + " Contato: ");
            String email = scan.next();
            contato.setEmail(email);

            contatos[i] = contato;
        }

        agenda.setContatos(contatos);
       
        if (agenda != null) {
            System.out.println(agenda.exibirInfo());
        }

        scan.close();
    }
}
