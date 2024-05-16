package aula43.labs.exer02;

public class PessoaJuridica extends Contribuinte {
    private String cnpj;

    public PessoaJuridica(String nome, double rendaBruta, String cnpj) {
        super(nome, rendaBruta);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {
        return this.getRendaBruta() * 0.1;
    }

    @Override
    public String toString() {
        return "PessoaJuridica\n[ cnpj = " + cnpj + "\nImposto a ser pago = " + this.calcularImposto() + " ]\n" + super.toString() + "\n";
    }
}
