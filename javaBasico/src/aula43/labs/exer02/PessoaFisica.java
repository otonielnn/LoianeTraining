package aula43.labs.exer02;

public class PessoaFisica extends Contribuinte {
    private String cpf;

    public PessoaFisica(String nome, double rendaBruta, String cpf) {
        super(nome, rendaBruta);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public double calcularImposto() {

        if (this.getRendaBruta() <= 1400) {
            return 0;
        }

        if (this.getRendaBruta() > 1400 && this.getRendaBruta() <= 2100) {
            return (this.getRendaBruta() * 0.1) - 100;
        }

        if (this.getRendaBruta() > 2100 && this.getRendaBruta() <= 2800) {
            return (this.getRendaBruta() * 0.15) - 270;
        }

        if (this.getRendaBruta() > 2800 && this.getRendaBruta() <= 3600) {
            return (this.getRendaBruta() * 0.25) - 500;
        }

        return (this.getRendaBruta() * 0.3) - 700;
    }

    @Override
    public String toString() {
        return "PessoaFisica\n[ cpf = " + cpf + "\nImposto a ser pago = " + this.calcularImposto() + " ]\n" + super.toString() + "\n";
    }

    
}
