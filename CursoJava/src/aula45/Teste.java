package aula45;

public class Teste {
    public static void main(String[] args) {
        //UpCasting
        Aluno aluno = new Aluno();
        Pessoa pessoaAluno = aluno;

        Pessoa aluno2 = (Pessoa) new Aluno();

        //DownCasting
        // Pessoa aluno3 = new Pessoa();
        // Aluno aluno4 = (Aluno) aluno3;

        Pessoa pessoa = new Pessoa();
        Professor prof = new Professor();

        if (pessoa instanceof Pessoa) {
            System.out.println("É do tipo Pessoa");
        }

        if (aluno instanceof Aluno) {
            System.out.println("É do tipo Aluno");
        }
        if (prof instanceof Professor) {
            System.out.println("É do tipo Professor");
        }
    }
}
