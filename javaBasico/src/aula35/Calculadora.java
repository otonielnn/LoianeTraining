package aula35;

public class Calculadora {
    public static int fatorialNaoRecursivo(int num) {

        if (num == 0) {
            return 1;
        }

        int resultado = 1;
        for (int i = num; i > 1; i--) {
            resultado *= i;
        }
        return resultado;
    }

    public static int fatorialRecursivo(int num) {

        if (num == 0) {
            return 1;
        }

        return num * fatorialRecursivo(num - 1);
    }
}
