package aula35.labs;

public class Calculadora {
    public static int fiboannaci(int n) {

        if (n < 2) {
            return 1;
        }

        return fiboannaci(n - 1) + fiboannaci(n - 2);
    }

    public static int somatorio(int n) {

        if (n == 1) {
            return 1;
        }

        return n + somatorio(n - 1);
    }
}
