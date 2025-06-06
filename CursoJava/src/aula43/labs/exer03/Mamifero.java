package aula43.labs.exer03;

public class Mamifero extends Animal {
    private String alimento;

    

    public Mamifero(String nome, int comprimento, double velocidade) {
        super(nome, comprimento, velocidade);
        this.setCor("Castanho");
        this.alimento = "Mel";
        this.setAmbiente("Terra");
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nalimento: " + alimento;
    }
    
    
}
