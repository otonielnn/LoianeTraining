package aula46.labs;

public class Circulo extends Figura2D {

    private double raio;

    

    public Circulo(String nome, double raio) {
        super.setNome(nome);
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        double area = Math.PI * (raio *raio);
        return area;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    
}
