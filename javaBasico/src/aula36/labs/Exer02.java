package aula36.labs;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome do Curso: ");
        String nomeCurso = scan.nextLine();

        System.out.print("Digite o horario do Curso: ");
        String horario = scan.nextLine();

        System.out.print("Digite o nome do Professor: ");
        String nomeProf = scan.nextLine();

        System.out.print("Digite o Departamento do Professor: ");
        String depProf = scan.nextLine();

        System.out.print("Digite o email do Professor: ");
        String emailPof = scan.nextLine();
        
        Curso curso = new Curso();
        curso.setNome(nomeCurso);
        curso.setHorario(horario);
        
        Professor professor = new Professor();
        professor.setNome(nomeProf);
        professor.setDepartamento(depProf);
        professor.setEmail(emailPof);

        curso.setProfessor(professor);

        System.out.println("---Alunos---");

        Aluno[] alunos = new Aluno[5];

        for (int i = 0; i < alunos.length; i++) {

            scan.nextLine();

            System.out.print("Digite o nome do aluno " + (i+1) + ": ");
            String nomeAluno = scan.nextLine();

            System.out.print("Digite a Matricula do aluno " + (i+1) + ": ");
            String matriculaAluno = scan.nextLine();

            double[] notas = new double[4];

            for (int j = 0; j < notas.length; j++) {
                System.out.print("Digite a nota " + (j+1) + ": ");
                notas[j] = scan.nextDouble();
            }

            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matriculaAluno);
            aluno.setNotas(notas);

            alunos[i] = aluno;
        }

        curso.setAlunos(alunos);

        System.out.println(curso.exibirInfo());

        scan.close();
    }
}
