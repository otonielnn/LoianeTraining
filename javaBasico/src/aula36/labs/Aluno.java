package aula36.labs;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double obterMedia() {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        double media = soma / notas.length;
        return media;
    }

    public String exibirInfo() {
        String info = "Aluno = " + nome + "\n";
        info += "Matricula = " + matricula + "\n";
        info += "notas: = ";

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
            info += nota + " ";
        }

        double media = soma / notas.length;

        info += "\n" + "Média = " + media + " - ";
        if (media >= 7) {
            info += "Aprovado";
        } else {
            info += "Reprovado";
        }

        return info;
    }
}
