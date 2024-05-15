package aula36.labs;

import java.util.Arrays;

public class Agenda {
    private String nome;
    private Contato[] contatos;

    public Agenda() {

    }

    public Agenda(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String exibirInfo() {
        String info = "Nome da Agenda = " + nome + "\n";

        if (contatos != null) {
            for (Contato c : contatos) {
                info += c.exibirInfo() + "\n";
            }
        }
        return info;
    }

}
