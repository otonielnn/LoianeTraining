package vetor.teste;

import vetor.Vetor;

public class Aula09 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("E");

        System.out.println(vetor);

        vetor.remove(1);

        System.out.println(vetor);

        System.out.println("Removendo o elemento D");
        int posicao = vetor.busca("D");
        if (posicao > -1) {
            vetor.remove(posicao);
        } else {
            System.out.println("O elemento não existe  no array");
        }

        System.out.println(vetor);
    }
}
