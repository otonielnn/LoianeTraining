package aula46.labs;

public class Cilindro extends Figura3D {

    private double altura;
    private double raio;
    

    public Cilindro(String nome, double altura, double raio) {
        super.setNome(nome);
        this.altura = altura;
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        double area =  (2 * (Math.PI * (raio * raio))) + (2 * Math.PI * raio * altura);
        return area;
    }

    @Override
    public double calcularVolume() {
        double volume = Math.PI * (raio * raio) * altura;
        return volume;
    }
    
}
