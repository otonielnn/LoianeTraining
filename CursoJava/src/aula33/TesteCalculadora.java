package aula33;

public class TesteCalculadora {
	public static void main(String[] args) {
		
		MinhaCalculadora calc = new MinhaCalculadora();
		
		System.out.println(calc.soma(5.5, 5.6));
		System.out.println(calc.soma(5, 7));
		System.out.println(calc.soma(12, 13, 5));
	}
}
