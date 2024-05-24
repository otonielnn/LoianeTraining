package aula34.labs;

public class Exer02 {
    public static void main(String[] args) {
        exibirResultado(Calculadora.soma(1, 1));
        exibirResultado(Calculadora.subtrair(5, 3));
        exibirResultado(Calculadora.multiplicar(3, 2));
        exibirResultado(Calculadora.divir(10, 2));
        exibirResultado(Calculadora.exponeciacao(2, 7));
    }

    static void exibirResultado(int num) {
        System.out.println(num);
    }
}
