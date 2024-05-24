package aula34.labs;

public class Calculadora {
	public static int soma(int num1, int num2) {
		return num1 + num2;
	}
    
	public static int subtrair(int num1, int num2) {
		return num1 - num2;
	}

	public static int multiplicar(int num1, int num2) {
		return num1 * num2;
	}
	
    public static int divir(int num1, int num2) {
		return num1 / num2;
	}

    public static int exponeciacao(int num1, int num2) {
        int resultado = num1;

		for (int i = 2; i <= num2; i++) {
            resultado *= num1;
        }
        return resultado;
	}

    public static int fatorial(int num) {

        if (num == 0) {
            return 1;
        }

        int resultado = 1;
        for (int i = num; i > 1; i--) {
            resultado *= i;
        }
        return resultado;
    }
}
