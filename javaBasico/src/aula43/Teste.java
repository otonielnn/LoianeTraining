package aula43;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setCurso("Licenciatura em Computação");
        double[] notas = {8, 8, 7, 9};
        aluno.setNotas(notas);

        System.out.println(aluno);

        String s1 = "otoniel";
        String s2 = "otoniel";

        // Comparando referência
        System.out.println(s1 == s2);

        // Comparando valores
        System.out.println(s1.equals(s2));
    }
}
