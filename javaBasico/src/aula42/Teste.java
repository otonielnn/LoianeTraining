package aula42;

public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        // Pessoa aluno = new Aluno();
        // Pessoa professor = new Professor();

        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        System.out.println(Constantes.URL_BlOG);
        // Constantes.URL_BlOG = "Trocando valor";
        System.out.println(Constantes.URL_BlOG);

        final int total = 1;
        // total++;
        System.out.println(total);
    }   
}
