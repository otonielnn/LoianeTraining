package aula43.labs.exer01;

public class Teste {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("cliente1", "1", 500);
        ContaPoupanca contaPoupanca  = new ContaPoupanca("cliente2", "2", 250, 16);
        ContaEspecial contaEspecial = new ContaEspecial("cliente3", "3", 100, 200);

        contaBancaria.sacar(400);
        contaBancaria.depositar(100);
        System.out.println(contaBancaria);

        contaPoupanca.sacar(100);
        contaPoupanca.depositar(100);
        contaPoupanca.calcularNovoSaldo(0.5);
        System.out.println(contaPoupanca);

        contaEspecial.sacar(200);
        contaEspecial.depositar(100);
        System.out.println(contaEspecial);
    }
}
