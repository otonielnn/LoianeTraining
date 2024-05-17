package aula46.labs;

public class Triangulo extends Figura2D {

    private double base;
    private double altura;

    public Triangulo(String nome, double base, double altura) {
        super.setNome(nome);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double area = (base * altura) / 2;
        return area;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
