package aula33.labs;

public class TesteLampada {
	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		System.out.println(lampada.Ligada());
		
		System.out.println(lampada.ligar());
		System.out.println(lampada.ligar());
		
		System.out.println(lampada.desligar());
		System.out.println(lampada.desligar());
	}
}
