package aula42;

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


}