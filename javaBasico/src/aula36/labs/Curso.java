package aula36.labs;

public class Curso {
    String nome;
    String horario;
    Professor professor;
    Aluno[] alunos;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public Aluno[] getAlunos() {
        return alunos;
    }
    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String exibirInfo() {
        String info = "Nome do Curso = " + nome + "\n";

        if (professor != null) {
            info += professor.exibirInfo();
        }

        if (alunos != null) {
            info += "\n---Alunos---\n";
            for (Aluno aluno : alunos) {
                if (aluno != null) {
                    info += aluno.exibirInfo() + "\n";
                }
            }
            info += "\nMédia da turma = " + exibirMediaTurma();
        }

        return info;
    }

    public double exibirMediaTurma() {
        double soma = 0;
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                soma += aluno.obterMedia();
            }
        }
        return soma / alunos.length;
    }
}
