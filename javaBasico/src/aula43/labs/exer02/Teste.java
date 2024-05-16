package aula43.labs.exer02;

public class Teste {
    public static void main(String[] args) {
        Contribuinte c1 = new PessoaFisica("Contribuinte 1", 1000, "583.358.456-62");
        Contribuinte c2 = new PessoaJuridica("Contribuinte 2", 5000, "91.403.512/0001-54");
        Contribuinte c3 = new PessoaFisica("Contribuinte 3", 2000, "828.277.078-70");
        Contribuinte c4 = new PessoaJuridica("Contribuinte 4", 3000, "35.434.693/0001-05");
        Contribuinte c5 = new PessoaFisica("Contribuinte 5", 4000, "10.684.822/0001-92");
        Contribuinte c6 = new PessoaJuridica("Contribuinte 6", 4000, "10.684.822/0001-92");

        Contribuinte[] contribuintes = new Contribuinte[6];
        contribuintes[0] = c1;
        contribuintes[1] = c2;
        contribuintes[2] = c3;
        contribuintes[3] = c4;
        contribuintes[4] = c5;
        contribuintes[5] = c6;

        for (Contribuinte contribuinte : contribuintes) {
            System.out.println(contribuinte);
        }
    }
}
