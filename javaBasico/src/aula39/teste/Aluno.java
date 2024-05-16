package aula39.teste;

import aula39.Pessoa;

public class Aluno extends Pessoa{
    private String curso;
    private double[] notas;
    
    

    public Aluno(String nome, String endereco, String telefone, String cpf, String telefoneCelular, String curso,
            double[] notas) {
        super(nome, endereco, telefone, cpf, telefoneCelular);
        this.curso = curso;
        this.notas = notas;
    }

    public void verificarAcesso() {
        this.nomeVisibilidade = "Não consegue editar com o modificador default";
        this.nomeVisibilidade = "Consegue editar com o modificador public";
        this.nomeVisibilidade = "Não consegue editar com o modificador private";
        this.nomeVisibilidade = "Consegue editar com o modificador protected";
    }
    
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }
}
