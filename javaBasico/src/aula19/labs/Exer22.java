package aula19.labs;

public class Exer22 {
    public static void main(String[] args) {
        
        int [] A = new int[10];

        int zero = 0;
        int um = 0;

        for (int i = 0; i < A.length; i++) {
            A[i] = (int) Math.round(Math.random() * 1);

            if (A[i] == 0) {
                zero++;
            } else {
                um++;
            }
        }

        double porcZero = (zero * 100) / A.length;
        double porcUm = (um * 100) / A.length;

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("\nPorcentagem de Zero: " + porcZero + "%");
        System.out.println("Porcentagem de Um: " + porcUm + "%");
    }
}
