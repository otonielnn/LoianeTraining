package aula34.labs;

public class Exer01 {
    
    static void exibirValor() {
        System.out.println(Contador.valor());
    }

    public static void main(String[] args) {
        exibirValor();
    
        Contador.incrementar();
        exibirValor();

        Contador.zerar();
        exibirValor();

        Contador.incrementar();
        Contador.incrementar();
        exibirValor();
        
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        exibirValor();
    }
}
