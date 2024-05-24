package aula43.labs.exer03;

public class Peixe extends Animal {
    private String caracteristicas;

    

    public Peixe(String nome, int comprimento, double velocidade) {
        super(nome, comprimento, velocidade);
        this.setPatas(0);
        this.setAmbiente("Mar");
        this.setCor("Cinzenta");
        this.caracteristicas = "Barbatanas e Cauda";
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return super.toString() + "\ncaracteristicas: " + caracteristicas;
    }

    
    
}
