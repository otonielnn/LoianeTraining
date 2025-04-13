package vetor.teste;

import vetor.Lista;

public class Aula11 {
    public static void main(String[] args) {
        Lista<String> vetor = new Lista<>(3);

        vetor.adiciona("Otoniel");
        vetor.adiciona("Lucas");
        vetor.adiciona("Guilherme");

        System.out.println(vetor);
    }
}