package aula39;

public class Professor extends Pessoa{
    private double salario;
    private String nomeCurso;

    public void verificarAcesso() {
        this.nomeVisibilidade = "Consegue editar com o modificador default"; // default = apenas classes do mesmo pacote
        this.nomeVisibilidade = "Consegue editar com o modificador public"; // public = tem acesso classes de qualquer pacote
        this.nomeVisibilidade = "Não consegue editar com o modificador private"; // apenas a própria classe
        this.nomeVisibilidade = "Consegue editar com o modificador protected"; // protected = funciona parecido como o default. Porém as subclasses independente de pacote tem acesso.
    }

    public Professor(String nome, String endereco, String telefone, String cpf, String telefoneCelular, double salario,
            String nomeCurso) {
        super(nome, endereco, telefone, cpf, telefoneCelular);
        this.salario = salario;
        this.nomeCurso = nomeCurso;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double calcularSalarioLiquido() {
        return 0;
    }
}
