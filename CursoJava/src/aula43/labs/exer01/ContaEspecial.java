package aula43.labs.exer01;

public class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial(String nomeCliente, String numConta, double saldo, double limite) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "ContaEspecial\n[ limite = " + limite + " ]\n" + super.toString();
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > (this.getSaldo() + this.limite)) {
            return false;
        }
        this.setSaldo(this.getSaldo() - valor);
        return true;
    }
    
    
}
