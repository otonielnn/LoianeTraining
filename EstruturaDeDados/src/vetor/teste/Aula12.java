package vetor.teste;

import java.util.ArrayList;

public class Aula12 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("fogo");
        lista.add("agua");
        lista.add("terra");
        lista.add("ar");

        System.out.println(lista);

        lista.add(1, "eletricidade");

        System.out.println(lista);

        boolean existe = lista.contains("agua");

        if (existe) {
            System.out.println("A lista contém o item");
        } else {
            System.out.println("A lista não contém item");
        }

        int posicao = lista.indexOf("agua");
        if (posicao != -1) {
            System.out.println("O item está na posição " + posicao);
        } else {
            System.out.println("O item não foi encontrada");
        }

        System.out.println(lista.get(2));

        lista.remove(0);
        lista.remove("eletricidade");

        System.out.println(lista);

        int tamanhoDaLista = lista.size();

        System.out.println("O tamanho da lista: " + tamanhoDaLista);
    }
}