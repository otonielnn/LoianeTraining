package aula43;

import java.util.Arrays;

public class Aluno {
    private String curso;
    private double[] notas;

    public Aluno() {}

    public Aluno(String curso, double[] notas) {
        this.curso = curso;
        this.notas = notas;
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

    public String obterEtiquetaEndereco() {
        String s = "Endereço do Aluno : ";
        // s += this.getEndereco();
        return s;
    }

    public void exibirEtiquetaEndereco() {
        System.out.println(this.obterEtiquetaEndereco());
    }

    public String toString() {
        String s = curso + "\n";
        for (double nota : notas) {
            s += nota + " ";
        }

        return s;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((curso == null) ? 0 : curso.hashCode());
        result = prime * result + Arrays.hashCode(notas);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (curso == null) {
            if (other.curso != null)
                return false;
        } else if (!curso.equals(other.curso))
            return false;
        if (!Arrays.equals(notas, other.notas))
            return false;
        return true;
    }

    
}
