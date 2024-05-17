package aula43.labs.exer03;

public class Teste {
    public static void main(String[] args) {
        Animal camelo = new Animal("Camelo", 150, 2);
        camelo.setCor("Amarelo");
        camelo.setAmbiente("Terra");

        Peixe tubarao = new Peixe("Tubarão", 300,1.5);

        Mamifero urso = new Mamifero("Urso Pardo", 100, 0.5);
        
        Animal[] animais = new Animal[3];
        animais[0] = camelo;
        animais[1] = tubarao;
        animais[2] = urso;

        System.out.println("Zoo:");
        System.out.println("-----------------------");
        for (Animal animal : animais) {
            System.out.println(animal);
            System.out.println("-----------------------");
        }
    }
}
