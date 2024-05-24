package aula24.labs;

import java.util.Date;

public class Exer04 {
    public static void main(String[] args) {
        LivroDeBiblioteca livroBiblioteca = new LivroDeBiblioteca();

        livroBiblioteca.nome = "Mastering ExtJS";
        livroBiblioteca.autor = "Loiane Groner";
        livroBiblioteca.anoLancamento = 2015;
        livroBiblioteca.emprestado = true;
        livroBiblioteca.dataEntrega = new Date();
        livroBiblioteca.emprestadoA = "Otoniel";
    }
}
