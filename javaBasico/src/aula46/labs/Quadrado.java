package aula46.labs;

public class Quadrado extends Figura2D {

    private double lado;

    public Quadrado(String nome, double lado) {
        super.setNome(nome);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double area = lado * lado;
        return area;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
}
