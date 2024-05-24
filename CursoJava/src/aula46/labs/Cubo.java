package aula46.labs;

public class Cubo extends Figura3D {

    private double lado;

    public Cubo(String nome, double lado) {
        super.setNome(nome);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double base = lado * lado;
        double area = base * 6;
        return area;
    }

    @Override
    public double calcularVolume() {
        double volume = lado * lado * lado;
        return volume;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
}
