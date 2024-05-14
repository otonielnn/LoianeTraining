package aula34;

public class TesteCalculadora {
	static int resultSoma;
	public static void main(String[] args) {
		resultSoma = MinhaCalculadora.soma(1, 2);

		soma2Valores(3, 2);
	}

	static int soma2Valores(int n1, int n2) {
		return MinhaCalculadora.soma(n1, n2);
	}
}
